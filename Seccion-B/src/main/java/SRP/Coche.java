/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRP;

/**
 *
 * @author Sebastian
 */
public class Coche {
     String marca;

    Coche(String marca){ this.marca = marca; }

    String getMarcaCoche(){ return marca; }
}
/* NO HACER
    class Coche {  
        String marca;

        Coche(String marca){ this.marca = marca; }

        String getMarcaCoche(){ return marca; }

        void guardarCocheDB(Coche coche){ ... } Se tiene la responsabilidad de guardar el coche aparte del constructor
                                                Por lo que viola el single responsability
    }
*/
