/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import Interfaces.queHacer;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Persona implements queHacer{
    private String nombre;
    private String apellido;
    private int dni;
    private String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", estadoCivil=" + estadoCivil + '}';
    }

    @Override
    public void cambiarEstadoCivil() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nuevo estado civil de "+this.nombre);
        String nuevoEstado=sc.next();
        if(nuevoEstado.equalsIgnoreCase("soltero")||nuevoEstado.equalsIgnoreCase("casado")||nuevoEstado.equalsIgnoreCase("divorciado")||nuevoEstado.equalsIgnoreCase("separado")||nuevoEstado.equalsIgnoreCase("viudo")){
            this.setEstadoCivil(nuevoEstado);
        }else{
            this.setEstadoCivil("soltero");
        }
    }

    

    
    
}
