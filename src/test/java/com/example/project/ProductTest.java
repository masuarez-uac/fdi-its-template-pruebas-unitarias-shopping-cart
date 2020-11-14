package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {
    Product p1;
    
    @BeforeEach
    protected void setUp() {
        p1 = new Product("P001", "Plasma TV LG 32", "Plasma TV with TDT Decod. and high resolution screen", 699.99);
    }
    
    @Test
    public void testGetCode() {
        // Verificación de setter y getter de la propiedad "code"
        fail("Verificar el código asignado en el constructor");
        p1.setCode("X001");
        fail("Verificar el código asignado por el setter");                
    }
    
    @Test
    public void testGetTitle() {
        // Verificación de setter y getter de la propiedad "title"
        fail("Verificar el título asignado en el constructor");
        p1.setTitle("Plasma SmartTV");
        fail("Verificar el título asignado por el setter");
    }
    
    @Test
    public void testGetDescription() {
        // Verificación de setter y getter de la propiedad "descripcion"
        fail("Verificar la descripción asignada en el constructor");
        p1.setDescription("Samsung SmartTV 32");
        fail("Verificar la descripción asignada por el setter");
    }
    
    @Test
    public void testGetPrice() {
        // Verificación de setter y getter de la propiedad "price";
        fail("Verificar el precio asignado en el constructor");
        p1.setPrice(499.99);
        fail("Verificar el precio asignado en el setter");
    }
}
