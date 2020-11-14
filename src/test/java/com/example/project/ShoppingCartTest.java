package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    ShoppingCart cart;
    Customer customer;
    Product product;
    
    @BeforeEach
    protected void setUp() {
        product = new Product("P001", "Plasma TV LG 32", "Plasma TV with TDT Decod. and high resolution Screen", 699.99);
        customer = new Customer("John Doe", 10);
        cart = new ShoppingCart();
        cart.addItem(product);
    }
    
    @Test
    public void testGetAddItem() {
        Product product2 = new Product("P002", "DVD player Samsung", "DVD Player with remote control and programming features", 39.99);
        cart.addItem(product2);
        fail("Verifica que existan dos artículos en el carrito");
        double expectedBalance = product.getPrice() + product2.getPrice();
        fail("Verifica que el costo del balance sea la suma del costo de ambos productos "
                + "(sin aplicar descuento ya que el carrito no tiene un cliente asignado)");
    }

    @Test
    public void testGetBalance() {
        fail("Verifica que el balance del carrito sea el costo del producto agregado"
                + "(sin aplicar descuento ya que el carrito no tiene un cliente asignado");
    }
    
    @Test
    public void testGetDiscount() {
        cart.setCustomer(customer);
        fail("Verifica que el balance del carrito sea el costo del producto agregado"
                + " aplicando el descuento que el cliente tiene asignado");
    }

    @Test
    public void testGetCount() {
        fail("Verifica que el número de artículos sea igual a uno");
    }
    
    @Test
    public void testRemoveItem() {
        cart.removeItem(product);
        fail("Verifica que el número de artículos sea igual a cero");
    }
    
    @Test
    public void testEmpty() {
        cart.empty();
        fail("Verifica que el número de artículos sea igual a cero");
    }
}
