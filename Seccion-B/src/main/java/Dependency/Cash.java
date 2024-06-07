/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependency;

/**
 *
 * @author Sebastian
 */
public class Cash {
    Persistence persistence;

    public Cash(Persistence persistence) {
        this.persistence = persistence;
    }

    public void pay(Product product) {

        persistence.save(product);

    }
}
