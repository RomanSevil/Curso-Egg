/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.queHacer;

/**
 *
 * @author usuario
 */
public class Edificio implements queHacer{
    private int ancho;
    private int largo;
    private int alto;
    private int superficie;
    private int volumen;

    public Edificio() {
    }

    public Edificio(int ancho, int largo, int alto, int superficie, int volumen) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
        this.superficie = superficie;
        this.volumen = volumen;
    }

    

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    

    @Override
    public void calcularSuperficie() {
        this.setSuperficie(this.getLargo()*this.getAncho()); 
    }

    @Override
    public void calcularVolumen() {
        this.setVolumen(this.getAlto()*this.getLargo()*this.getAncho());
    }

    
    
    
}
