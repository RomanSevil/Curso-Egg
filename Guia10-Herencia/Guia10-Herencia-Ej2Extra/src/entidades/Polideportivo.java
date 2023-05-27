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
public class Polideportivo extends Edificio implements queHacer{
    
    private String nombre;
    private boolean techado;

    public Polideportivo() {
        
        
    }

    public Polideportivo(String nombre, boolean techado) {
        this.nombre = nombre;
        this.techado = techado;
    }

    public Polideportivo(String nombre, boolean techado, int ancho, int largo, int alto, int superficie, int volumen) {
        super(ancho, largo, alto, superficie, volumen);
        this.nombre = nombre;
        this.techado = techado;
    }
    
    
    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
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

    
    

   
    
    
    
    

