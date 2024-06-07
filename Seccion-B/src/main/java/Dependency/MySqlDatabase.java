/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependency;

/**
 *
 * @author Sebastian
 */
public class MySqlDatabase implements Persistence{
    
    @Override
    public void save(Product product) {
        System.out.println("Save product " + product);
        // guardar en la base de datos
    }
}
