/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_sem2;
import java.util.Scanner;
public class Ejercicio3_sem2 {
    public static void main(String[] args) {
        
        double salarioBase= 800.00;
        double salario = 0.0; Scanner leer = new Scanner (System.in);

System.out.println("Introduzca la cantidad de autos vendidos");
double n = leer.nextDouble();

System.out.println("Introduzca el nombre de el vendedor");
String nombre = leer.next();
double com = comisionAutosDos();

salario =salarioBase + comisionAutosVendidos(n) + com;

System.out.println("El salario del trabajador es: $" + salario);
System.out.println("El nombre de el trabajador es: " + nombre);
    }
    public static double comisionAutosVendidos(double cantidad){
         double totalComision = 170 * cantidad;
         return totalComision;
    }
    
    public static double comisionAutosDos() {
        int xventas = 3;
        double valorv1 = 5000;
        double valorv2 = 7000;
        double valorv3 = 15000;
        
        double comision = (valorv1 * 0.05) + (valorv3 * 0.05);
        return comision;
    }
    
}
