/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dependency;

/**
 *
 * @author Sebastian
 */
/*NO HACER
    class Cash {

   public void pay(Product product) {

        MySqlDatabase persistence = new MySqlDatabase(); Se esta utilizando MySql como base de datos si se quisiera migrar a
        persistence.save(product);                       otra base de datos se tendria que modificar el codigo

   }

}
class MySqlDatabase {

    void save(Product product) {
        // guardar en la base de datos
    }

}
public class Main {

    public static void main(String[] args) {
        Cash cash = new Cash();
        cash.pay(new Product());
    }

}
*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persistence persistence = new MySqlDatabase();
        Cash cash = new Cash(persistence);
        cash.pay(new Product());
    }
    
}
