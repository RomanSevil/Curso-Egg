/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.herencia.ej2;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Guia10HerenciaEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        ArrayList<Electrodomestico>electrodomesticos=new ArrayList<>();
        
        System.out.println("Ingrese cuantos electrodomesticos va a comprar");
        int opc=sc.nextInt();
        int total=0;
        
        for(int i=0;i<opc;i++){
            System.out.println("Ingrese el electrodomestico a comprar");
            String eleccion=sc.next().toUpperCase();
            if(eleccion.equalsIgnoreCase("LAVADORA")){
                System.out.println("Elija una lavadora");
                Lavadora l1=new Lavadora();
                l1.crearLavadora();
                electrodomesticos.add(l1);
                
                total += l1.getPrecio();
            }else{
                System.out.println("Elija un televisor");
                Televisor t1=new Televisor();
                t1.crearTelevisor();
                electrodomesticos.add(t1);
                
                total += t1.getPrecio();
            }
        }
        
        System.out.println("Los electrodomesticos que compro son:");
        for(Electrodomestico cada:electrodomesticos){
            System.out.println(cada);
        }
        
        System.out.println("El total de los " + opc + " productos es de: $" + total);
       
    }
    
}
