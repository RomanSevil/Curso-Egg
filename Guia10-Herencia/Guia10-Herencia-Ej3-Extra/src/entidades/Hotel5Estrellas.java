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
public class Hotel5Estrellas extends Hotel4Estrellas{
    private int cantidadSalonesConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas, char gimnasio, String nombreRestaurant, int capacidadRestaurant) {
        super(gimnasio, nombreRestaurant, capacidadRestaurant);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Hotel5Estrellas(int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas, char gimnasio, String nombreRestaurant, int capacidadRestaurant, int cantidadHabitaciones, int numCamas, int cantidadPisos, double precioHabitacion) {
        super(gimnasio, nombreRestaurant, capacidadRestaurant, cantidadHabitaciones, numCamas, cantidadPisos, precioHabitacion);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Hotel5Estrellas(int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas, char gimnasio, String nombreRestaurant, int capacidadRestaurant, int cantidadHabitaciones, int numCamas, int cantidadPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurant, capacidadRestaurant, cantidadHabitaciones, numCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    

   
    

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(int cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }
    
    public void crearHotel5Estrellas(){
        Scanner sc=new Scanner(System.in);
        crearHotel4Estrellas();
        System.out.println("Ingrese la cantidad de salones de conferencia ");
        this.setCantidadSalonesConferencia(sc.nextInt());
        System.out.println("Ingrese la cantidad de suites");
        this.setCantidadSuites(sc.nextInt());
        System.out.println("Ingrese la cantidad de limosinas");
        this.setCantidadLimosinas(sc.nextInt());
        
        calcularHotel5Estrellas();
    }

    public void calcularHotel5Estrellas(){
        calcularHotel4Estrellas();
        double valorLimosinas=this.getCantidadLimosinas()*15d;
        this.setPrecioHabitacion(this.getPrecioHabitacion()+valorLimosinas);
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" + "cantidadSalonesConferencia=" + cantidadSalonesConferencia + ", cantidadSuites=" + cantidadSuites + ", cantidadLimosinas=" + cantidadLimosinas + super.toString()+'}';
    }
    
    
}
