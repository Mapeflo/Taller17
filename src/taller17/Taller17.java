/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller17;

/**
 *
 * @author marya
 */
public class Taller17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Figura cir = new Circulo(2);
        Figura rec = new Rectangulo(4,6);
        
        System.out.println("El area del circulo es: " + cir.calcularArea());
        System.out.println("El area del rectangulo es: " + rec.calcularArea());
    }
}
