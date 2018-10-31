package com.javalec.simulatedInvestment.config;

import java.util.concurrent.Executor;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableAsync
public class AsyncConfig {

	@Bean(name = "apiExecutor")
	public Executor apiExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(4);
		taskExecutor.setMaxPoolSize(6);
        taskExecutor.setQueueCapacity(2);
        taskExecutor.setThreadNamePrefix("apiExecutor-");
        taskExecutor.initialize();
        
		return taskExecutor;
	}
	
	@Bean(name = "restTemplate")
	public RestTemplate restTemplate() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		HttpClient httpClient = HttpClientBuilder.create()
				.setMaxConnTotal(100)
				.setMaxConnPerRoute(5)
				.build();
		factory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(factory);
		
		return restTemplate;
	}
}
