package com.javalec.simulatedInvestment.scheduled;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.javalec.simulatedInvestment.dto.OrderbookDto;
import com.javalec.simulatedInvestment.mapper.OrderbookMapper;

@Service
@SessionAttributes({"bids", "name", "age"})
public class ReceiveApi {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	OrderbookDto orderbookDto;
	
	@Async("apiExecutor")
	@Scheduled(fixedDelay=10000)
	//BTC 거래체결내역
	public void apiTransactionHistoryBTC() {
		
		String url = "https://api.bithumb.com/public/transaction_history/BTC";
		Object obj = restTemplate.getForObject(url, String.class);

		
		System.out.println(obj);
	}

	@Async("apiExecutor")
	@Scheduled(fixedDelay=5000) 
	//BTC 오더북
	public void apiOrderbookBTC() {
		System.out.println(sqlSession);
		
		JsonParser jsonParser = new JsonParser();
		OrderbookMapper dao = sqlSession.getMapper(OrderbookMapper.class);
		

		String url = "https://api.bithumb.com/public/orderbook/BTC";
		
		String obj = restTemplate.getForObject(url, String.class);	//API가져오기
		
		JsonObject parseResult = jsonParser.parse(obj).getAsJsonObject();
		
		JsonArray jsonArray = parseResult.get("data").getAsJsonObject().get("bids").getAsJsonArray();
		
		for(int i=0; i<jsonArray.size(); i++) {
		
			parseResult =  (JsonObject) jsonArray.get(i);
			//DB 저장
			try {
			
				if(dao.check(parseResult.get("price").getAsInt()) == null) {
					//System.out.println("dao.check(00) == null");
					dao.insert(parseResult.get("price").getAsInt() , parseResult.get("quantity").getAsDouble() );
				}else {
					//System.out.println("dao.check(00) != null");
					dao.update(parseResult.get("price").getAsInt() , parseResult.get("quantity").getAsDouble() );
				}
				
	            System.out.println("디비");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			//객체 저장
			//orderbookDto.putBid(parseResult.get("price").getAsInt(), parseResult.get("quantity").getAsDouble());
		}
		
		
		
		
	}

}
