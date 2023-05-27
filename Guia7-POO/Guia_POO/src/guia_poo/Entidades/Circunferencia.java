/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Entidades;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Circunferencia {
    
    private double radio;
    
    public Circunferencia(){
    
    }
    
    public Circunferencia(double radio){
        
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
    Scanner leer=new Scanner(System.in);
    radio=leer.nextDouble();
    //System.out.println(radio);
}
    public void perimetro(){
        double perimetro=2*Math.PI*radio;
        System.out.println("El perimetro es " + perimetro);
    }
    
    public void area(){
        double area=Math.PI*Math.pow(radio, 2);
        System.out.println("El area es "+area);
    }
}
