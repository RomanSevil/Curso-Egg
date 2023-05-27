/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.revolverAgua;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class revolverServicios {

    public revolverAgua llenarRevolver() {
        revolverAgua r1 = new revolverAgua();
        r1.setPosicionActual((int) Math.floor(Math.random() * 6) + 1);
        r1.setPosicionAgua((int) Math.floor(Math.random() * 6) + 1);
        return r1;
    }

    public boolean mojar(revolverAgua r1) {
        return r1.getPosicionActual() == r1.getPosicionAgua();
    }

    public void siguienteChorro(revolverAgua r1) {
        int posicion = r1.getPosicionActual();
        final int inicioTambor = 1;
        final int finTambor = 6;
        if (posicion == finTambor) {
            r1.setPosicionActual(inicioTambor);
        } else {
            r1.setPosicionActual(posicion + 1);
        }
    }
}
