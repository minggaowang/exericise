package com.wmg.entity;

public class Fruits {
    private long name;
    private double price;
    private String producingArea;

    public Fruits() {
    }

    public Fruits(long name, double price, String producingArea) {
        this.name = name;
        this.price = price;
        this.producingArea = producingArea;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducingArea() {
        return producingArea;
    }

    public void setProducingArea(String producingArea) {
        this.producingArea = producingArea;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", producingArea='" + producingArea + '\'' +
                '}';
    }
}
