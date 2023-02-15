package com.example.demo.dao;

import com.example.demo.model.Stock;

public interface StockDao {
    public Stock getStockInfo(String ticker);
}
