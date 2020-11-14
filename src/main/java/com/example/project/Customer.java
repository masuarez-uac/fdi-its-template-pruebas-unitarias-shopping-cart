package com.example.project;

public class Customer {
    String name;
    double discount;

    public Customer(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
