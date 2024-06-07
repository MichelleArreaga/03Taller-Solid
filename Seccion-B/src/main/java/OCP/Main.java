/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OCP;

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

    imprimirPrecioMedioCoche(arrayCoches);
    }
    public static void imprimirPrecioMedioCoche(Coche[] arrayCoches){  
    for (Coche coche : arrayCoches) {
        System.out.println(coche.precioMedioCoche());
    }
}
    /* NO HACER
        class Coche {  
        String marca;

        Coche(String marca){ this.marca = marca; }

        String getMarcaCoche(){ return marca; }
    }
 
        public static void main(String[] args) {  
        Coche[] arrayCoches = {
                new Coche("Renault"),
                new Coche("Audi") esto viola OCP porque si se añade mercerdes entonces se debe modificar el metodo
                new Coche("Mercedes)  imprimirPrecioMedioCoche y se modificara por cada nuevo coche que se añada
    };
        imprimirPrecioMedioCoche(arrayCoches);
    }

        public static void imprimirPrecioMedioCoche(Coche[] arrayCoches){  
            for (Coche coche : arrayCoches) {
                if(coche.marca.equals("Renault")) System.out.println(18000);
                if(coche.marca.equals("Audi")) System.out.println(25000);
            }
    }
    */
    
        
}
