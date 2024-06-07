/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seccion.c;

/**
 *
 * @author Julian Ruiz
 */
public class Notificacion {
    
    public void notificar(Notificable notificacion, Pagable pago){
        notificacion.enviarNotificacion(pago);
    }
}
