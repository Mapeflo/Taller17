/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller17;

/**
 *
 * @author marya
 */
public class Bicicleta extends Transporte {

    public Bicicleta(String tipo) {
        super(tipo);
    }
    
    @Override
    public void moverse(){
        System.out.println("La" + tipo + "se mueve pedaleando");
    }
    
}
