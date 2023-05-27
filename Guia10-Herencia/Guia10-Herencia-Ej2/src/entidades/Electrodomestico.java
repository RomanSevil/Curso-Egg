/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Electrodomestico {
    double precio;
    String color;
    char consumoEnergetico;
    int peso;
    
    

    public Electrodomestico() {
    }
    
    

    public Electrodomestico(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        
        
        
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
    public void comprobarConsumoEnergetico(char letra){
        if(letra!='A'&&letra!='B'&&letra!='C'&&letra!='D'&&letra!='E'&&letra!='F'){
            setConsumoEnergetico('F');
        }else{
            setConsumoEnergetico(letra);
        }
    }
    
    public void comprobarColor(String color){
        if(!color.equalsIgnoreCase("blanco")&&!color.equalsIgnoreCase("negro")&&!color.equalsIgnoreCase("rojo")&&!color.equalsIgnoreCase("azul")&&!color.equalsIgnoreCase("gris")){
            setColor("blanco");
        }else{
            setColor(color);
        }
    }
    
    public void crearElectrodomestico(){
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        char letra;
        String color;
        
        
        this.setPrecio(1000);
        
        System.out.println("Ingrese el color del electrodomestico");
        color=sc.next();
        comprobarColor(color);
        
        System.out.println("Ingrese el consumo energetico del electrodomestico");
        letra=sc.next().charAt(0);
        comprobarConsumoEnergetico(letra);
        
        System.out.println("Ingrese el peso del electrodomestico");
        this.setPeso(sc.nextInt());
        
    }
    
    public void precioFinal(){
        switch(this.getConsumoEnergetico()){
            case 'A':
                this.setPrecio(1000);
                break;
            case 'B':
                this.setPrecio(800);
                break;
            case 'C':
                this.setPrecio(600);
                break;
            case 'D':
                this.setPrecio(500);
                break;  
            case 'E':
                this.setPrecio(300);
                break;
            case 'F':
                this.setPrecio(100);
                break;
        }
     if(this.getPeso()>=1&&this.getPeso()<=19){
         this.setPrecio(this.getPrecio()+100);
     }   
     if(this.getPeso()>=20&&this.getPeso()<=49){
         this.setPrecio(this.getPrecio()+500);
     } 
     if(this.getPeso()>=50&&this.getPeso()<=79){
         this.setPrecio(this.getPrecio()+800);
     }  
     if(this.getPeso()>=80){
         this.setPrecio(this.getPrecio()+1000);
     }  
     
    }
    
   
    
}
