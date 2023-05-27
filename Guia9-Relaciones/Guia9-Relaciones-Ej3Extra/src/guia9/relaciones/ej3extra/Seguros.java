/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.relaciones.ej3extra;

import entidades.Cliente;
import entidades.Poliza;
import entidades.Vehiculo;
import enums.Cobertura;
import enums.Color;
import enums.FormasPago;
import enums.Marcas;
import enums.Tipos;
import enums.modelosChevrolet;
import enums.modelosFord;
import enums.modelosToyota;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Seguros {
    Scanner sc=new Scanner(System.in);
    ArrayList<Cliente> clientes=new ArrayList<>();
    ArrayList<Vehiculo>vehiculos=new ArrayList<>();
    ArrayList<Poliza>polizas=new ArrayList<>();
    
    
    public void crearClientes(){
        String[] nombres = {"Roman", "Marcus", "John", "Anthony", "Paul", "Robert", "Tom", "Fletcher", "Louis", "Rick", "Jacob", "Andrew", "Samuel", "Alexis", "Vladimir", "Javier", "Mateo", "Andres", "Simon", "David", "Arnold", "Martin", "Joe", "Donald", "Ronald", "George"};
        String[] apellidos = {"Sevil", "Johnson", "Smith", "Perez", "De Paul", "Alvarez", "Gutierrez", "Fernandez", "Orban", "Nuñez", "Garcia", "Riquelme", "Martinez", "Sanchez", "Rios", "Plaza", "Mateos", "Ramirez", "Reede", "Saravia", "Gonzalez", "Zapata", "Lopez", "Cordoba", "Palermo", "Torres"};
        Random generate=new Random();
        System.out.println("Ingrese cuantos clientes va a crear");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            clientes.add(new Cliente(nombres[generate.nextInt(nombres.length)], apellidos[generate.nextInt(apellidos.length)], (int) (Math.random() * (100000000 - 10000000) + 10000000),null , null, (long) (Math.random() * (297699999 - 297400000) + 297400000)));
        }
        
        /*for(Cliente aux:clientes){
            System.out.println(aux);
        }*/
    }
    
    public void crearVehiculo(){
        Vehiculo v1=new Vehiculo<modelosFord>(Marcas.FORD, modelosFord.FIESTA, 2012, 89416554, 451441442, Color.ROJO, Tipos.SEDAN);
        Vehiculo v2=new Vehiculo<modelosChevrolet>(Marcas.CHEVROLET, modelosChevrolet.S10, 2017, 4169477, 215475858, Color.NEGRO, Tipos.CAMIONETA);
        Vehiculo v3=new Vehiculo<modelosToyota>(Marcas.TOYOTA, modelosToyota.HILUX,2004, 6845665, 57416463, Color.BLANCO, Tipos.CAMIONETA);
        Vehiculo v4=new Vehiculo<modelosFord>(Marcas.FORD, modelosFord.TRANSIT, 2012, 8941655, 4514442, Color.BLANCO, Tipos.FURGON);
        Vehiculo v5=new Vehiculo<modelosChevrolet>(Marcas.CHEVROLET, modelosChevrolet.TRACKER, 2022, 417561477, 762475858, Color.AZUL, Tipos.SUV);
        Vehiculo v6=new Vehiculo<modelosFord>(Marcas.FORD, modelosFord.KA, 2018, 417761477, 7675858, Color.ROJO, Tipos.HATCH);
        Vehiculo v7=new Vehiculo<modelosToyota>(Marcas.TOYOTA, modelosToyota.RAV4, 2017, 0, 0, Color.BORDO, Tipos.SUV);
        
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);
        vehiculos.add(v5);
        vehiculos.add(v6);
        vehiculos.add(v7);
        
        /*for(Vehiculo aux:vehiculos){
            System.out.println(aux);
        }*/
    }
    
    public void crearPolizas(){
        /*int dia,mes,anio;
        dia=25;
        mes=4;
        anio=2022;*/
        
        Poliza p1=new Poliza(vehiculos.get(0), clientes.get(0), 164642, new Date(2022-1900, 4-1, 25), new Date(2022-1900, 10-1, 1),12, FormasPago.CREDITO, 3000d, 1000d, Cobertura.TodoRiesgo);
        Poliza p2=new Poliza(vehiculos.get(1), clientes.get(1), 61456135, new Date(2022-1900, 6-1, 27), new Date(2022-1900, 11-1, 10), 6, FormasPago.EFECTIVO, 2000d, 1000d, Cobertura.Ampliado);
        
        polizas.add(p1);
        polizas.add(p2);
        
        for(Poliza aux:polizas){
            //System.out.println(aux);
            for(int i=0;i<aux.getCantCuotas();i++){
                boolean pagar=false;
                System.out.println("Numero de cuota " + (i+1) + " Monto de la cuota " + aux.getMontoTotal()+aux.getMontoGranizo()/aux.getCantCuotas() + "Fecha vencimiento " + aux.getFechaFin()+"Forma de pago " + aux.getFormaPago());
                System.out.println(aux.getCliente().getNombre() + " desea pagar la cuota?");
                String res=sc.next();
                if(res.equalsIgnoreCase("si")){
                    pagar=true;
                }
                if(pagar){
                    System.out.println("Cuota pagada");
                }else{
                    System.out.println("Debe pagar la cuota de " + aux.getMontoTotal()+aux.getMontoGranizo()/aux.getCantCuotas());
                }
            }
        }
        
    }
    
    
    
}
