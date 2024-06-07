/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Liskov;


/**
 *
 * @author Sebastian
 */
public class Mercedes extends Coche{

    @Override
    int precioMedioCoche() {
        return 27000;
    }
    @Override
    int numAsientos() {
        return 5;
    }
}
