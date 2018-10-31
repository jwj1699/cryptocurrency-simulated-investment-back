package com.javalec.simulatedInvestment.controller;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.javalec.simulatedInvestment.dto.CurrencyInfoDto;
import com.javalec.simulatedInvestment.mapper.CurrencyInfoMapper;

@RestController
@RequestMapping("/CurrencyInfo")
public class CurrencyController {

	@Autowired
	SqlSession sqlSession;
	
	Gson gson = new Gson();
	
	@GetMapping("/")
	@CrossOrigin(origins = "http://localhost:3000")
	public String tabledata(Model model) {
		System.out.println("/tableData");
		
		CurrencyInfoMapper dao = sqlSession.getMapper(CurrencyInfoMapper.class);
		//ArrayList<CurrencyInfoDto> CurrencyList = dao.list();
		
		String json = gson.toJson(dao.list());
		System.out.println("json="+json);
		return json;
	}
	
	@GetMapping("/BTC")
	@CrossOrigin(origins = "http://localhost:3000")
	public String btc(Model model) {
		
		CurrencyInfoMapper dao = sqlSession.getMapper(CurrencyInfoMapper.class);

		String json = gson.toJson(dao.BTC());
		System.out.println("json="+json);
		return json;
	
	}
	
	@GetMapping("/ETH")
	@CrossOrigin(origins = "http://localhost:3000")
	public String eth(Model model) {
		
		CurrencyInfoMapper dao = sqlSession.getMapper(CurrencyInfoMapper.class);

		String json = gson.toJson(dao.ETH());
		System.out.println("json="+json);
		return json;
	
	}
	
	@GetMapping("/ETC")
	@CrossOrigin(origins = "http://localhost:3000")
	public String etc(Model model) {
		
		CurrencyInfoMapper dao = sqlSession.getMapper(CurrencyInfoMapper.class);

		String json = gson.toJson(dao.ETC());
		System.out.println("json="+json);
		return json;
	
	}
	
	@GetMapping("/XRP")
	@CrossOrigin(origins = "http://localhost:3000")
	public String xrp(Model model) {
		
		CurrencyInfoMapper dao = sqlSession.getMapper(CurrencyInfoMapper.class);

		String json = gson.toJson(dao.XRP());
		System.out.println("json="+json);
		return json;
	
	}
	
	@GetMapping("/LTC")
	@CrossOrigin(origins = "http://localhost:3000")
	public String ltc(Model model) {
		
		CurrencyInfoMapper dao = sqlSession.getMapper(CurrencyInfoMapper.class);

		String json = gson.toJson(dao.LTC());
		System.out.println("json="+json);
		return json;
	
	}
}
