/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author usuario
 */
public class Baraja {
    private List<Carta>baraja;

    public Baraja() {
    }

    public Baraja(List<Carta> baraja) {
        this.baraja = baraja;
    }

    public List<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(List<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "baraja{" + "baraja=" + baraja + '}';
    }
    
}
