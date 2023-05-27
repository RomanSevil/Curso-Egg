/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Juego;
import entidades.Jugador;
import entidades.revolverAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class juegoServicios {

    Scanner sc = new Scanner(System.in);
    revolverServicios rServicio = new revolverServicios();
    jugadorServicios jServicio = new jugadorServicios();
    Juego partida = new Juego();

    public void llenarJuego() {

        //ArrayList<Jugador> jugadores=new ArrayList<>();
        partida.setJugadores(llenarLista());

        //partida.setJugadores(jugadores);
        partida.setRevolver(rServicio.llenarRevolver());

        //return partida;
    }

    public ArrayList<Jugador> llenarLista() {
        System.out.println("Ingrese el numero de jugadores");
        int n = sc.nextInt();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Jugador j1 = new Jugador();

            j1.setNombre("Jugador " + (i + 1));
            j1.setId(i + 1);
            jugadores.add(j1);
        }

        return jugadores;

    }

    public void ronda() {

        revolverAgua r1 = partida.getRevolver();
        String mojado = " ";
        boolean salio = false;

        for (Jugador cada : partida.getJugadores()) {
            System.out.println(cada.toString());
        }
        do {
            for (Jugador jugador : partida.getJugadores()) {
                jServicio.disparaRevolver(r1, jugador);
                if (jugador.isMojado()) {
                    mojado = jugador.getNombre();
                    salio = true;
                    break;
                }
            }
        } while (!salio);

        System.out.println(mojado + " se mojo ");

    }
}
/*
 jugadores.add(j1);


for(Jugador cada:jugadores){
            System.out.println(cada.toString());
        }
 */
