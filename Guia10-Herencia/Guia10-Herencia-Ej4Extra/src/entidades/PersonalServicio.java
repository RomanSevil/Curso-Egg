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
public class PersonalServicio extends Empleado implements accionEmpleado {

    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion) {
        this.seccion = seccion;
    }

    public PersonalServicio(String seccion, int anioIncorporacion, int numDespacho) {
        super(anioIncorporacion, numDespacho);
        this.seccion = seccion;
    }

    public PersonalServicio(String seccion, int anioIncorporacion, int numDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    

    @Override
    public void reasignar() {

        Scanner sc = new Scanner(System.in);

        boolean log = false;

        System.out.println("Ingrese la seccion de " + this.getNombre());
        String seccion = sc.next();
        do {
            if (seccion.equalsIgnoreCase("Biblioteca") || seccion.equalsIgnoreCase("Decanato") || seccion.equalsIgnoreCase("Secretaria")) {
                this.setSeccion(seccion);
                log = true;
            } else {
                System.out.println("La seccion no existe. Ingrese una seccion valida");
                seccion = sc.next();
            }

        } while (!log);
    }

    @Override
    public String toString() {
        return super.toString()+" PersonalServicio{" + "seccion=" + seccion + '}';
    }

}
