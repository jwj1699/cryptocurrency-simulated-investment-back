package com.javalec.simulatedInvestment.externalApi;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;


public class OrderbookApi {
	
	
	public void abcd() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		HttpClient httpClient = HttpClientBuilder.create()
				.setMaxConnTotal(100)
				.setMaxConnPerRoute(5)
				.build();
		factory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(factory);
		
		String url = "https://api.bithumb.com/public/ticker/BTC";
		
		
		Object obj = restTemplate.getForObject(url, String.class);
		
		System.out.println(obj);
	}
	
}
