package com.kdcoder.gsconsumingrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kdcoder.gsconsumingrest.dto.Quote;

@RestController
@RequestMapping("/api/quote")
public class QuoteController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public ResponseEntity<Quote> getQuote() {
		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		return ResponseEntity.ok(quote);
	}
}
