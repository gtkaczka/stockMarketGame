package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockDto {
    @JsonProperty("symbol")
    private String stockName;
    @JsonProperty("price")
    private double currentStockPrice;
    @JsonProperty("volume")
    private double currentVolumne;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getCurrentStockPrice() {
        return currentStockPrice;
    }

    public void setCurrentStockPrice(double currentStockPrice) {
        this.currentStockPrice = currentStockPrice;
    }

    public double getCurrentVolumne() {
        return currentVolumne;
    }

    public void setCurrentVolumne(double currentVolumne) {
        this.currentVolumne = currentVolumne;
    }
}
