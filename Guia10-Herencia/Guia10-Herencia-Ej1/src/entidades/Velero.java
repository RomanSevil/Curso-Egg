/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import Interfaces.queHacer;

/**
 *
 * @author usuario
 */
public final class  Velero extends Embarcacion {
    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public Velero(int numMastiles, int matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numMastiles=" + numMastiles + "Embarcacion{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion +'}';
    }

    public void calcularPrecioVelero(Alquiler a1) {
        calcularPrecio(a1);
        a1.setPrecio(a1.getPrecio()+this.getNumMastiles()*100);
        
    }

    
    
}
