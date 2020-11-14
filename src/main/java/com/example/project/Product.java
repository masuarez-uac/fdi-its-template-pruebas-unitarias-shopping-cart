package com.example.project;

public class Product {
    String code;
    String title;
    String description;
    double price;

    public Product(String code, String title, String descripion, double price) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.price = price;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String cod) {
        this.code = cod;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
