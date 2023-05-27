/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Servicios;

import guia_poo.Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class puntoServicios {
    Scanner leer= new Scanner(System.in);
    public Puntos crearPuntos(){
        int x,y;
        System.out.println("Ingrese y para el punto ");
        x=leer.nextInt();
        System.out.println("Ingrese x para el punto ");
        y=leer.nextInt();
        
        Puntos p1=new Puntos(x,y);
        
        return p1;
    }
    
    public double calcularDistancia(Puntos p1,Puntos p2){
        double distancia;
        distancia=Math.sqrt(Math.pow(p2.getX1()-p1.getX1(),2)+Math.pow(p2.getY1()-p1.getY1(),2));
        return distancia;
    }
    
    
}
