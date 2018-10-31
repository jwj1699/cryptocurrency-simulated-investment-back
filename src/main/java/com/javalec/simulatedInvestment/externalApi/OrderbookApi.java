package com.javalec.simulatedInvestment.externalApi;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


public class OrderbookApi {
	/*HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
	HttpClient httpClient = HttpClientBuilder.create()
			.setMaxConnTotal(100)
			.setMaxConnPerRoute(5)
			.build();
	factory.setHttpClient(httpClient);
	RestTemplate restTemplate = new RestTemplate(factory);
	
	String url = "";
	
	Object obj = restTemplate.getForObject(url, dao.class);*/
}
