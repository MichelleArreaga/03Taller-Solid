/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seccion.c;

/**
 *
 * @author Julian Ruiz
 */
public class PagoPaypal extends Pago{
    private boolean loggedIn; //conexion a cuenta Paypal
    
    public void realizarCobro(double monto){
        if(!loggedIn){
            LoggedIn();
        }
        //cargar el monto
    }
    
    public void LoggedIn(){
        //logica para LoggedIn
    }
}
