/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller17;

/**
 *
 * @author marya
 */
public abstract class Transporte {
    
    String tipo;

    public Transporte(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract void moverse();
    
}
