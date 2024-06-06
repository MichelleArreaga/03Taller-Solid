/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seccion.b;

import java.util.List;

/**
 *
 * @author MICHELLE ARREAGA
 */
public class ShoppingCart {
    
    private List<ProductInterface> products;
    
    public void addProduct(ProductInterface product){
        products.add(product);
    }
    public void removeProduct(ProductInterface product){
        products.remove(product);
    }
    public double calculateTotalPrice(){
        double total=0;
        //Lógica para calcular el precio total
        return total;
    }
}
