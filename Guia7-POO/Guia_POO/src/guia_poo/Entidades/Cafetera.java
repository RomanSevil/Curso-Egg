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
public class Cafetera {

    Scanner leer = new Scanner(System.in);
    int capacidadMaxima;
    int capacidadActual;

    public Cafetera() {

    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        System.out.println("Ingrese la cantidad maxima de la cafetera");
        capacidadMaxima = leer.nextInt();
        if(capacidadActual < capacidadMaxima) {
            capacidadActual=capacidadMaxima;
        }

        System.out.println("La capacidad actual es de " + capacidadActual);
    }

    public void servirTaza(int tamañoTaza) {
        //System.out.println("Ingrese el tamaño de la taza");
        int taza=0;
        if (capacidadActual < tamañoTaza) {
            taza = capacidadActual;
            System.out.println("La taza no se lleno y quedo en " + taza + " ml ");
        } else {
            while(tamañoTaza>taza) {
                taza++;
            }
            
            System.out.println("La taza contiene " + taza +" ml");
            System.out.println("La taza esta llena");
        }
        capacidadActual-=taza;
        System.out.println("La cafetera tiene " + capacidadActual);
    }
    
    public void vaciarCafetera(){
        capacidadActual=0;
    }
    
    public void agregarCafe(int cantidad){
        int resto;
        int vacio=capacidadMaxima-capacidadActual;
        if(cantidad <= vacio){
            capacidadActual+=cantidad;
        }else{
            resto=cantidad-vacio;
            capacidadActual+=vacio;
            System.out.println("La cafetera tiene " + capacidadActual + " y te sobran " + resto);
        }
        System.out.println("La cafetera tiene " + capacidadActual);
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

}
