/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author usuario
 */
public class DivisionNumero {
    private int dividendo;
    private int divisor;

    public DivisionNumero() {
    }

    public DivisionNumero(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "dividendo=" + dividendo + ", divisor=" + divisor + '}';
    }
    
    
}
