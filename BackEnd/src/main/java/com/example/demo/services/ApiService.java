package com.example.demo.services;

import com.example.demo.model.Stock;
import com.example.demo.model.StockDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {
    private final RestTemplate restTemplate = new RestTemplate();

    private final String API_BASE_URL = "https://financialmodelingprep.com/api/v3/quote-short/";

    private final String API_KEY = "?apikey=0a6f4e847808b1b349d15b37493da586";

    @CrossOrigin
    public Stock getStockRaw(String info){
        Stock stock = new Stock();
        StockDto n;
        n = restTemplate.getForObject(API_BASE_URL + info + API_KEY, StockDto.class);
        stock.setTicker(n.getStockName());
        stock.setPrice(n.getCurrentStockPrice());
        stock.setVolume(n.getCurrentVolumne());
        return stock;
    }
}
