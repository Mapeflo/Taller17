/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller17;

/**
 *
 * @author marya
 */
public class CuentaAhorros extends CuentaBancaria {
    
    double tasa;

    public CuentaAhorros(double tasa, double saldo) {
        super(saldo);
        this.tasa = tasa;
    }
    
    @Override
    public double calcularInteresDiario(){
        return (saldo*tasa)/365;
    }
    
    public static void main(String[] args) {
         
        CuentaBancaria cuenta = new CuentaAhorros(0.05, 100000);
        
        double interes = cuenta.calcularInteresDiario();
        
        System.out.println("Interes diario generado: " + interes);
        System.out.println("Saldo: " + cuenta.getSaldo());
     }
}
