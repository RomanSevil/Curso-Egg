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
public class Rectangulo {
    private int base;
    private int altura;
    public Rectangulo(){
        
    }
    
    public Rectangulo(int base,int altura){
        this.base=base;
        this.altura=altura;
    }
    
    public void crearRectangulo(){
        Scanner leer=new Scanner(System.in);
        base=leer.nextInt();
        altura=leer.nextInt();
        
    }
    
    public void superficie(){
        int superficie=base*altura;
        
    }
    
    public void perimetro(){
        int perimetro=(base*altura)*2;
    }
    
    public void dibujarRectangulo(){
        for(int i=0;i<base;i++){
            System.out.print("*");
        }
        System.out.println(" ");
            for(int i=0;i<altura-2;i++){
                System.out.print("*");
                for(int j=0;j<base-2;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        
        for(int i=0;i<base;i++){
            System.out.print("*");
        }
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
