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
public class Profesor extends Empleado implements accionEmpleado{

    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento) {
        this.departamento = departamento;
    }

    public Profesor(String departamento, int anioIncorporacion, int numDespacho) {
        super(anioIncorporacion, numDespacho);
        this.departamento = departamento;
    }

    public Profesor(String departamento, int anioIncorporacion, int numDespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void reasignar() {
        Scanner sc=new Scanner(System.in);
        
        boolean log = false;
        
        
        System.out.println("Ingrese el nuevo departamento del profesor " + this.getNombre());
        String departamento = sc.next();
        do {
            if (departamento.equalsIgnoreCase("Lenguaje") || departamento.equalsIgnoreCase("Arquitectura") || departamento.equalsIgnoreCase("Matematica")) {
                log=true;
                this.setDepartamento(departamento);
            }else{
                System.out.println("El departamento no existe. Ingrese un departamento que exista");
                departamento=sc.next();
            }

        } while (!log);
    }

    @Override
    public String toString() {
        return super.toString()+" Profesor{" + "departamento=" + departamento + '}';
    }
    

}
/*public void cambiarDepartamento() {
        boolean log = false;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nuevo departamento del profesor " + this.getNombre());
        String departamento = sc.next();
        do {
            if (departamento.equalsIgnoreCase("Lenguaje") || departamento.equalsIgnoreCase("Arquitectura") || departamento.equalsIgnoreCase("Matematica")) {
                log=true;
            }else{
                System.out.println("El departamento no existe. Ingrese un departamento que exista");
                departamento=sc.next();
            }

        } while (!log);
    }*/