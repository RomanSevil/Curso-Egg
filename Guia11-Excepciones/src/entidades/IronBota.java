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
public class IronBota {
    private int propulsor=100,salud=100;
    private boolean dañado=false;

    public IronBota() {
    }

    public IronBota(boolean dañado) {
        this.dañado = dañado;
    }

    

    public int getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(int propulsor) {
        this.propulsor = propulsor;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public boolean isDañado() {
        return dañado;
    }

    public void setDañado(boolean dañado) {
        this.dañado = dañado;
    }

    @Override
    public String toString() {
        return "IronBota{" + "propulsor=" + propulsor + ", salud=" + salud + ", da\u00f1ado=" + dañado + '}';
    }

    
    
    

   
}
