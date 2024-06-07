/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Liskov;


/**
 *
 * @author Sebastian
 */
public class Audi extends Coche{
    @Override
    int precioMedioCoche() {
        return 25000;
    }
    @Override
    int numAsientos() {
        return 5;
    }
}
