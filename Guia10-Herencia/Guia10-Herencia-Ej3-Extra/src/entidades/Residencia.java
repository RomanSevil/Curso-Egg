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
public class Residencia extends AlojamientoExtra{
    private int cantidadHabitaciones;
    private boolean descuentos;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantidadHabitaciones, boolean descuentos, boolean campoDeportivo) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(int cantidadHabitaciones, boolean descuentos, boolean campoDeportivo, boolean privado, int m2) {
        super(privado, m2);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(int cantidadHabitaciones, boolean descuentos, boolean campoDeportivo, boolean privado, int m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    public void crearResidencia(){
        Scanner sc=new Scanner(System.in);
        crearAlojamientoExtra();
        String res;
        System.out.println("Ingrese la cantidad de habitaciones");
        this.setCantidadHabitaciones(sc.nextInt());
        
        System.out.println("¿La residencia tiene campo deportivo? (Si/No)");
        res=sc.next();
        if(res.equalsIgnoreCase("si")){
            this.setCampoDeportivo(true);
        }else{
            this.setCampoDeportivo(false);
        }
        
        System.out.println("¿La residencia hace descuentos? (Si/No)");
        res=sc.next();
        if(res.equalsIgnoreCase("si")){
            this.setDescuentos(true);
        }else{
            this.setDescuentos(false);
        }
                
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", descuentos=" + descuentos + ", campoDeportivo=" + campoDeportivo + super.toString()+'}';
    }
    
    
}
