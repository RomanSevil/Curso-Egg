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
public final class EdificioDeOficinas extends Edificio implements queHacer{
    private int numeroOficinas;
    private int numeroPisos;
    private int cantidadPersonasOficina;
    

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroOficinas, int numeroPisos, int cantidadPersonasOficina) {
        this.numeroOficinas = numeroOficinas;
        this.numeroPisos = numeroPisos;
        this.cantidadPersonasOficina = cantidadPersonasOficina;
    }

    public EdificioDeOficinas(int numeroOficinas, int numeroPisos, int cantidadPersonasOficina, int ancho, int largo, int alto, int superficie, int volumen) {
        super(ancho, largo, alto, superficie, volumen);
        this.numeroOficinas = numeroOficinas;
        this.numeroPisos = numeroPisos;
        this.cantidadPersonasOficina = cantidadPersonasOficina;
    }

    
    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public int getCantidadPersonasOficina() {
        return cantidadPersonasOficina;
    }

    public void setCantidadPersonasOficina(int cantidadPersonasOficina) {
        this.cantidadPersonasOficina = cantidadPersonasOficina;
    }

    @Override
    public void calcularSuperficie() {
        this.setSuperficie(this.getLargo()*this.getAncho());
    }

    @Override
    public void calcularVolumen() {
        this.setVolumen(this.getAlto()*this.getLargo()*this.getAncho());
    }
    
    public void cantPersonas(){
        //int personasPiso=this.getCantidadPersonasOficina()*getNumeroOficinas();
        System.out.println("En un piso entran " + this.getCantidadPersonasOficina());
        System.out.println("En el edificio " + " de " + this.getNumeroPisos()+" pisos ,entran " +this.getCantidadPersonasOficina()*this.getNumeroPisos()+" personas");
    }
    

    
    
}
