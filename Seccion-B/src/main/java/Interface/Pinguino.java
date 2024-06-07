/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Sebastian
 */
public class Pinguino implements IAve,IAveNadadora{
    @Override
    public void Comer() {
        System.out.println("come");
    }
    @Override
    public void Nadar() {
        System.out.println("nada");
    }
}
/* NO HACER
    interface IAve {  
    void volar();
    void comer();
    void nadar();
}

class Loro implements IAve{

    @Override
    public void volar() {
        //...
    }

    @Override
    public void comer() {
        //...
    }

    @Override
    public void nadar() {
        //...
    }
}

class Pinguino implements IAve{ Pinguino no puede volar por lo tanto no le sirve esa interfaz

    @Override
    public void volar() {
        //...
    }

    @Override
    public void comer() {
        //...
    }

    @Override
    public void nadar() {
        //...
    }
}
*/
