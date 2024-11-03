/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package didier_gil_martínez_17743611_tarea_3;

/**
 *
 * @author Lenovo
 */
public class Circulo {
    private int r;
    public Circulo(){
        this.r=0;
    }
    public Circulo(int radio){
      r=radio;
    }
    public double circunferencia(){
        return 2*Math.PI*r;
    }
    public double Area(){
        return Math.PI*r*r;
    }
    public void ImprimirArea(){
        System.out.println("El area del circulo es: "+Area());
    }
    public void ImprimirCircunferencia(){
        System.out.println("La circunferencia es: "+circunferencia());
    }
}
