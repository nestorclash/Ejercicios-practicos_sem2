/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_sem2;
import java.util.Scanner;
public class Ejercicio4_sem2 {
    public static void main(String[] args) {
        
        double salario = 300.00; 
        double comision = 50.00;
        double renta = 0.10;
        double salarioC;
        double salarioR;
        double salarioT;
        double Renta;
        double comi;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el nombre de el vendedor"); 
        String nombre = leer.nextLine();
        
        System.out.println("Cuantas ventas realizo en el mes");
        double Venta = leer.nextDouble();
        
        comi= Venta * comision;
        
        salarioC = salario + comi;
        salarioR = salario * renta;
        salarioT = salarioC - salarioR;
        
        System.out.println("El salatio total es de: $" + salarioT);
        
        Renta = salario * renta;
        
        System.out.println("El monto a pagar de renta es de: $" + Renta);

    }
}