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
public class BarcoMotor extends Embarcacion {

    int potenciaCV;
    
    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(int potenciaCV, int matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potenciaCV=" + potenciaCV + "Embarcacion{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion +'}';
    }

    

    
    public void calcularPrecioMotor(Alquiler a1) {
        calcularPrecio(a1);
        a1.setPrecio(a1.getPrecio()+this.getPotenciaCV());
    }

    

    
    
}
