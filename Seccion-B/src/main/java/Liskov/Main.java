/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Liskov;


/**
 *
 * @author Sebastian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche[] arrayCoches = {
            new Renault(),
            new Audi(),
            new Mercedes()
    };

    imprimirNumAsientos(arrayCoches);  
    }
    public static void imprimirNumAsientos(Coche[] arrayCoches){  
        for (Coche coche : arrayCoches) {
            System.out.println(coche.numAsientos());
        }
    }
    /* NO HACER
    
        Coche[] arrayCoches = {
            new Renault(),
            new Audi(),
            new Mercedes() Incumple tanto lisvok como OCP porque al añadir una nueva marca hay que modificar el codigo. 
                           El programa debe conocer cada tipo de Coche y llamar a su método numAsientos() asociado.
                           La superclase coche devuelve el tipo Coche, por lo que su subclase debe devolver o coche
                           o alguna subclase de coche
    };
        public static void imprimirNumAsientos(Coche[] arrayCoches){  
        for (Coche coche : arrayCoches) {                             
            if(coche instanceof Renault)
                System.out.println(numAsientosRenault(coche));
            if(coche instanceof Audi)
                System.out.println(numAsientosAudi(coche));
            if(coche instanceof Mercedes)
                System.out.println(numAsientosMercedes(coche));
        }
    }
        imprimirNumAsientos(arrayCoches);  
    */
}
