/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package didier_gil_martínez_17743611_tarea_3;

/**
 *
 * @author Lenovo
 */
public class Cuadrado {
    private int l;
    public Cuadrado(){
        this.l=0;
    }
    public Cuadrado(int lado){
    this.l=lado;
    }
    public int Perimetro (){
    return l*4;    
    }
    public int Area (){
        return l*l;
    }
    public double Diagonal (){
        return Math.sqrt((l*l)+(l*l));
    }
    public void ImprimirArea(){
        System.out.println("El area del cuadrado es: "+Area());
         
    }
public void ImprimirPerimetro(){
         System.out.println("El Perimetro del cuadrado es: "+Perimetro());    
}
public void ImprimirDiagonal(){
          System.out.println("La diagonal del cuadrado es: "+Diagonal());}
}
