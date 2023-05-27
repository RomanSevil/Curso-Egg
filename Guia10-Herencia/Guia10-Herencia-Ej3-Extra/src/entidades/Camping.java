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
public class Camping extends AlojamientoExtra{
    private int maxCarpas;
    private int baniosDisponibles;
    private boolean restaurant;

    public Camping() {
    }

    public Camping(int maxCarpas, int baniosDisponibles, boolean restaurant) {
        this.maxCarpas = maxCarpas;
        this.baniosDisponibles = baniosDisponibles;
        this.restaurant = restaurant;
    }

    public Camping(int maxCarpas, int baniosDisponibles, boolean restaurant, boolean privado, int m2) {
        super(privado, m2);
        this.maxCarpas = maxCarpas;
        this.baniosDisponibles = baniosDisponibles;
        this.restaurant = restaurant;
    }

    public Camping(int maxCarpas, int baniosDisponibles, boolean restaurant, boolean privado, int m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.baniosDisponibles = baniosDisponibles;
        this.restaurant = restaurant;
    }

    

    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public int getBaniosDisponibles() {
        return baniosDisponibles;
    }

    public void setBaniosDisponibles(int baniosDisponibles) {
        this.baniosDisponibles = baniosDisponibles;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }
    
    public void crearCamping(){
        Scanner sc=new Scanner(System.in);
        crearAlojamientoExtra();
        System.out.println("Ingrese la cantidad de baños");
        this.setBaniosDisponibles(sc.nextInt());
        System.out.println("Ingrese el maximo de carpas ");
        this.setMaxCarpas(sc.nextInt());
        System.out.println("¿El camping tiene restaurante? (Si/No)");
        String res=sc.next();
        if(res.equalsIgnoreCase("si")){
            this.setRestaurant(true);
        }else{
            this.setRestaurant(false);
        }
    }

    @Override
    public String toString() {
        return "Camping{" + "maxCarpas=" + maxCarpas + ", baniosDisponibles=" + baniosDisponibles + ", restaurant=" + restaurant + super.toString()+'}';
    }
    
    
}
