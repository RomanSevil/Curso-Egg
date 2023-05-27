/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Jugador;
import entidades.revolverAgua;

/**
 *
 * @author usuario
 */
public class jugadorServicios {

    public void disparaRevolver(revolverAgua r1, Jugador j1) {

        revolverServicios service = new revolverServicios();
        String nombre = j1.getNombre();

        System.out.println(nombre + " disparo");

        if (service.mojar(r1)) {
            j1.setMojado(true);
            System.out.println("Te mojaste!");
        } else {
            System.out.println("La pistola pasa al siguiente jugador");
            service.siguienteChorro(r1);
        }

    }

}

/*
boolean mojado = false;
mojado=true;
return mojado;
 */
