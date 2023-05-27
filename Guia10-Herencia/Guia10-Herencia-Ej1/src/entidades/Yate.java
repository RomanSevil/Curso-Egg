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
public  final class Yate extends BarcoMotor {
    private int numCamarotes;

    public Yate() {
    }

    public Yate(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public Yate(int numCamarotes, int potenciaCV) {
        super(potenciaCV);
        this.numCamarotes = numCamarotes;
    }

    public Yate(int numCamarotes, int potenciaCV, int matricula, int eslora, int anioFabricacion) {
        super(potenciaCV, matricula, eslora, anioFabricacion);
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "numCamarotes=" + numCamarotes +"Embarcacion{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + ",potenciaCV"+potenciaCV+ '}';
    }

    

    
    public void calcularPrecioYate(Alquiler a1) {
        calcularPrecioMotor(a1);
        a1.setPrecio(a1.getPrecio()+this.getNumCamarotes()*10000);
    }
    
    
    
}
