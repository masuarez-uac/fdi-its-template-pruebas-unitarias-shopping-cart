package com.example.project;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> items;
    Customer customer;
    
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public double getBalance() {        
        double balance = 0.00;
        // Sumamos los costos por producto en el carrito
        for (Product item: items) {
            balance += item.getPrice();
        }
        // Aplicamos descuento del cliente
        return balance * customer.getDiscount() / 100;
    }
    
    public void addItem(Product item) {
        items.add(item);
    }
    
    public void removeItem(Product item) {
        items.remove(item);
    }
    
    public int getItemCount() {
        // Obtenemos el tamaño del arreglo menos uno ya que empieza en cero
        return items.size()-1;
    }
    
    public void empty() {
        items.clear();
    }
}
