package com.example.demo.services;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {
    private final RestTemplate restTemplate = new RestTemplate();

    private final String API_BASE_URL = "https://financialmodelingprep.com/api/v3/quote-short/";

    private final String API_KEY = "0a6f4e847808b1b349d15b37493da586";

    //public Stock getStock(String info){
       // Stock stock = new Stock();
       // restTemplate.getForObject(API_BASE_URL + info + "?apikey=" + API_KEY);
    //}
}
