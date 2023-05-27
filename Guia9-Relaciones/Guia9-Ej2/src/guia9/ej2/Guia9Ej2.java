/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ej2;

import entidades.Juego;
import entidades.Jugador;
import entidades.revolverAgua;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.juegoServicios;
import servicios.jugadorServicios;
import servicios.revolverServicios;

/**
 *
 * @author usuario
 */
public class Guia9Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Jugador>jugadores=new ArrayList<>();
        juegoServicios juego=new juegoServicios();
        //Juego partida=juego.llenarJuego();
        revolverServicios rService=new revolverServicios();
        
        
        //revolverAgua r1=rService.llenarRevolver();
       
        
        
        /*for(Jugador aux:jugadores){
            System.out.print(aux +" ");
        }*/
        
        juego.llenarJuego();
        juego.ronda();
    }
    
}
/*
jugadorServicios serviceJugador=new jugadorServicios();
System.out.println("Ingrese el numero de jugadores ");
        int nJugadores=sc.nextInt();



        
        for(int i=1;i<=nJugadores;i++){
            Jugador j1=new Jugador();
            j1.setId(i);
            j1.setNombre("Jugador " + i);
            jugadores.add(j1);
        }
*/
