/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.razaPerro;

/**
 *
 * @author usuario
 */
public class Perro {
    private String nombre;
    private razaPerro raza;

    public Perro() {
    }

    public Perro(String nombre, razaPerro raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public razaPerro getRaza() {
        return raza;
    }

    public void setRaza(razaPerro raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
    
    
}
