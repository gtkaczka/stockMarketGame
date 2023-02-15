package com.example.demo.model;

import java.util.Objects;

public class Stock {
    private String ticker;
    private double price;
    private double volume;



    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.price, price) == 0 && Double.compare(stock.volume, volume) == 0 && ticker.equals(stock.ticker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticker, price, volume);
    }
}
