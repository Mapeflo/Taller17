/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller17;

/**
 *
 * @author marya
 */
public class Coche extends Transporte {

    public Coche(String tipo) {
        super(tipo);
    }
    
    @Override
    public void moverse(){
        System.out.println("El" + tipo + "se mueve con motor");
    }
    
    public static void main(String[] args) {
        
        Transporte t1 = new Bicicleta("Bicicleta");
        Transporte t2 = new Coche("Coche");
        
        t1.moverse();
        t2.moverse();
    }
}
