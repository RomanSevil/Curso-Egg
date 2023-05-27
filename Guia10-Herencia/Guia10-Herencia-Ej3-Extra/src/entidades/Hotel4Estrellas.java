/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Hotel4Estrellas extends Hotel {

    private char gimnasio;
    private String nombreRestaurant;
    private int capacidadRestaurant;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(char gimnasio, String nombreRestaurant, int capacidadRestaurant) {
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public Hotel4Estrellas(char gimnasio, String nombreRestaurant, int capacidadRestaurant, int cantidadHabitaciones, int numCamas, int cantidadPisos, double precioHabitacion) {
        super(cantidadHabitaciones, numCamas, cantidadPisos, precioHabitacion);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public Hotel4Estrellas(char gimnasio, String nombreRestaurant, int capacidadRestaurant, int cantidadHabitaciones, int numCamas, int cantidadPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public void crearHotel4Estrellas() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        crearHotel();
        System.out.println("Ingrese la capacidad del restaurante");
        this.setCapacidadRestaurant(sc.nextInt());
        System.out.println("Ingrese si el gimnasio es clase A o B");
        this.setGimnasio(sc.next().charAt(0));
        if(this.getGimnasio()!='A'||this.getGimnasio()!='B'){
            this.setGimnasio('B');
        }
        System.out.println("Ingrese el nombre del restaurante");
        this.setNombreRestaurant(sc.next());
        
        calcularHotel4Estrellas();
    }

    public void calcularHotel4Estrellas() {
        calcularPrecioHabitacion();
        double valorRestaurant = 0;
        double valorGimnasio;
        if (this.getCapacidadRestaurant() < 30) {
            valorRestaurant = 10d;
        } else if (this.getCapacidadRestaurant() >= 30 && this.getCapacidadRestaurant() <= 50) {
            valorRestaurant = 30d;

        } else if (this.getCapacidadRestaurant() > 50) {
            valorRestaurant = 50d;
        }

        if (this.getGimnasio() == 'A') {
            valorGimnasio = 50d;
        } else {
            valorGimnasio = 30d;
        }

        this.setPrecioHabitacion(this.getPrecioHabitacion() + valorGimnasio + valorRestaurant);
    }

    @Override
    public String toString() {
        return "Hotel4Estrellas{" + "gimnasio=" + gimnasio + ", nombreRestaurant=" + nombreRestaurant + ", capacidadRestaurant=" + capacidadRestaurant + super.toString()+'}';
    }
    
    
    

}
