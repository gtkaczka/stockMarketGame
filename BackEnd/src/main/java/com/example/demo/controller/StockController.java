package com.example.demo.controller;

import com.example.demo.model.Stock;
import com.example.demo.services.ApiService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping(path="/stocks")
@RestController
public class StockController {

    private final ApiService apiService;
    public StockController(ApiService apiService){
        this.apiService = apiService;
    }

    @RequestMapping(path="/{ticker}", method = RequestMethod.GET)
    public Stock getStock(@PathVariable String ticker){
        return apiService.getStockRaw(ticker);
    }
}
