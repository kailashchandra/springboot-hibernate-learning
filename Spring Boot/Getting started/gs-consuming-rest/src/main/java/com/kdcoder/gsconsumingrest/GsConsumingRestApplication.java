package com.kdcoder.gsconsumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.kdcoder.gsconsumingrest.dto.Quote;

@SpringBootApplication
public class GsConsumingRestApplication {
//	private static final Logger logger = LoggerFactory.getLogger(GsConsumingRestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(GsConsumingRestApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	/*@Bean
	public CommandLineRunner run(RestTemplate restTemplate) {
		return args -> {
			Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
			logger.info(quote.toString());
		};
	}*/

}
