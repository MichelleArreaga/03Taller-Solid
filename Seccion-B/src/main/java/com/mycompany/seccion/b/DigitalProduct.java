/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seccion.b;

/**
 *
 * @author MICHELLE ARREAGA
 */
public class DigitalProduct implements ProductInterface {
    
    private String name;
    private double price;
    
    public DigitalProduct(String name, double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
