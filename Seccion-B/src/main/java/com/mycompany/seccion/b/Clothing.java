/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seccion.b;

/**
 *
 * @author MICHELLE ARREAGA
 */
public class Clothing implements ProductInterface, IvaCalculator{
    private String name;
    private double price;
    private double weight;

    public Clothing(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double calculateIVA(ProductInterface product) {
        return price * 0.12;
    }
    
    
}
