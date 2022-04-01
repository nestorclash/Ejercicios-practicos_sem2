/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_sem2;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio5_sem2 {
    public static void main(String[] args) {
        //Declaracion de variables
        double salarioB;
        double descuentoT;
        double renta = 0.10;
        double salarioM;
        double salario1;
        double F;
        double minutoT;
        double total;
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#0.00");
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese su salario mensual");
        double salario = leer.nextDouble();
        
        System.out.println("Ingrese los minutos tardes en el mes");
        double minuto = leer.nextDouble();
        
        //Salario por minuto
        
        minutoT = salario / 30;
        salario1 = minutoT / 8;
        salarioM = salario1 / 60;
        F = salarioM * minuto;
        
        // Su Formula
        
        salarioB = salario - F;
        descuentoT = salarioB * renta;
        total = salarioB - descuentoT;
        
        System.out.println("Su nombre es: " + nombre);
        
        System.out.println("El descuento por llegadas tardias es de: " + formato.format(F));
        
        System.out.println("La retencion de renta es: $" + formato.format(descuentoT));
        
        System.out.println("Su salario total es de: $" + formato.format(total) ); 
    }  
}
