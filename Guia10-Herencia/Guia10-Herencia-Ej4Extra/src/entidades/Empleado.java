/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import Interfaces.accionEmpleado;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Empleado extends Persona {
    private int anioIncorporacion;
    private int numDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int numDespacho) {
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public Empleado(int anioIncorporacion, int numDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+" Empleado{" + "anioIncorporacion=" + anioIncorporacion + ", numDespacho=" + numDespacho + '}';
    }

    
    public void reasignarDespacho() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de despacho ");
        this.setNumDespacho(sc.nextInt());
    }

    
    
    
}
