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
public class Hotel extends Alojamiento{

    private int cantidadHabitaciones;
    private int numCamas;
    private int cantidadPisos;
    private double precioHabitacion;

    public Hotel() {
    }

    public Hotel(int cantidadHabitaciones, int numCamas, int cantidadPisos, double precioHabitacion) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numCamas = numCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Hotel(int cantidadHabitaciones, int numCamas, int cantidadPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numCamas = numCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitacion = precioHabitacion;
    }

    
    

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public void crearHotel() {
        crearAlojamiento();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de habitaciones");
        this.setCantidadHabitaciones(sc.nextInt());
        System.out.println("Ingrese la cantidad de pisos");
        this.setCantidadPisos(sc.nextInt());
        System.out.println("Ingrese la cantidad de camas");
        this.setNumCamas(sc.nextInt());
    }

    public void calcularPrecioHabitacion() {

        this.setPrecioHabitacion(50d + (1d * this.getCantidadHabitaciones()));

    }

    @Override
    public String toString() {
        return "Hotel{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", numCamas=" + numCamas + ", cantidadPisos=" + cantidadPisos + ", precioHabitacion=" + precioHabitacion + super.toString()+'}';
    }
    
    
}
/*
if (this instanceof Hotel4Estrellas) {
            Hotel4Estrellas object = (Hotel4Estrellas) this;
            double valorRestaurant;
            if(((Hotel4Estrellas) this).getCapacidadRestaurant()<30){
                valorRestaurant=10d;
            }else if(((Hotel4Estrellas) this).getCapacidadRestaurant()>=30&&((Hotel4Estrellas) this).getCapacidadRestaurant()<=50){
                valorRestaurant=30d;
            }else if(((Hotel4Estrellas) this).getCapacidadRestaurant()>50){
                valorRestaurant=50d;
            }
        }
*/
