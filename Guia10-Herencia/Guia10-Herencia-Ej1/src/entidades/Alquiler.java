/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import Interfaces.queHacer;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Alquiler {
    Scanner sc=new Scanner(System.in);
    private String nombre;
    private int DNI;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicionAmarre;
    private Embarcacion embarcacion;
    private int precio;

    public Alquiler() {
    }

    public Alquiler(String nombre, int DNI, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, Embarcacion embarcacion,int precio) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.embarcacion = embarcacion;
        this.precio=precio;
        
    }

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Embarcacion getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(Embarcacion embarcacion) {
        this.embarcacion = embarcacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", DNI=" + DNI + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", embarcacion=" + embarcacion + '}';
    }

  
    public void crearAlquiler(Embarcacion embarcacion) {
        
        int dia,mes,anio;
        int diasOcupacion;
        
        //Date diaDevolucion;
        
        System.out.println("Ingrese el nombre del cliente");
        this.setNombre(sc.next());
        
        System.out.println("Ingrese el documento del cliente");
        this.setDNI(sc.nextInt());
        
        System.out.println("Ingrese el dia del alquiler");
        dia=sc.nextInt();
        
        System.out.println("Ingrese el mes del alquiler");
        mes=sc.nextInt();
        
        System.out.println("Ingrese el año del alquiler");
        anio=sc.nextInt();
        
        //Date diaAlquiler=new Date(anio-1900,mes-1,dia);
        this.setFechaAlquiler(new Date(anio-1900,mes-1,dia));
        
        System.out.println("Ingrese el dia de devolucion");
        dia=sc.nextInt();
        System.out.println("Ingrese el mes de devolucion");
        mes=sc.nextInt();
        System.out.println("Ingrese el año de devolucion");
        anio=sc.nextInt();
        //fechaDevolucion=new Date(anio-1900, mes-1, dia);
        this.setFechaDevolucion(new Date(anio-1900, mes-1, dia));
        
        diasOcupacion=(int) ((this.getFechaDevolucion().getTime()-fechaAlquiler.getTime())/86400000);
        //System.out.println(diasOcupacion);
        
        while(diasOcupacion<0){    
        System.out.println("Ingrese el dia de devolucion");
        dia=sc.nextInt();
        System.out.println("Ingrese el mes de devolucion");
        mes=sc.nextInt();
        System.out.println("Ingrese el año de devolucion");
        anio=sc.nextInt();
        this.setFechaDevolucion(new Date(anio-1900, mes-1, dia));
        diasOcupacion=(int) ((fechaDevolucion.getTime()-fechaAlquiler.getTime())/86400000);
        
        
        
        }
       
        this.setEmbarcacion(embarcacion);
        
        
    }
    /*public void calcularAlquiler() {
        int modulo=this.getEmbarcacion().obtenerModulo();
    }*/

    

   
    
    
}
