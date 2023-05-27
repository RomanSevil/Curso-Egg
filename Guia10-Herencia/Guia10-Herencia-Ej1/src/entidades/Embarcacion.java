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
public class Embarcacion {
    int matricula;
    int eslora;
    int anioFabricacion;

    public Embarcacion() {
    }

    public Embarcacion(int matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    

    @Override
    public String toString() {
        return "Embarcacion{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }

    
    public void calcularPrecio(Alquiler a1) {
        int diasOcupacion=(int) ((a1.getFechaDevolucion().getTime()-a1.getFechaAlquiler().getTime())/86400000);
        int modulo=this.getEslora()*10;
        a1.setPrecio(diasOcupacion*modulo);
    }
    
    
    
 
}
/*
int diasOcupacion=(int) ((alquiler.getFechaDevolucion().getTime()-alquiler.getFechaAlquiler().getTime())/86400000);
        int precio=diasOcupacion*modulo;
        System.out.println(precio);
*/