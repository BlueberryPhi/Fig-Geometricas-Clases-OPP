/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package didier_gil_martínez_17743611_tarea_3;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
     
        System.out.println("Figuras: Circulo y Cuadrado");
         System.out.println("Area y perimetro");
         
       
           System.out.print("Ingresa el valor del lado para tu cuadrado: ");
        int lado=scan.nextInt();
        Cuadrado Cuad= new Cuadrado(lado);
        Cuad.ImprimirArea();
        Cuad.ImprimirPerimetro();
        Cuad.ImprimirDiagonal();
           System.out.print("Ingresa el valor del radio para tu circulo: ");
        int radio=scan.nextInt();
           Circulo C=new Circulo(radio);
           
           C.ImprimirArea();
           C.ImprimirCircunferencia();
           
    }
    
}
