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
public class IronGuante {
    private int expulsor=100,salud=100;
    private boolean dañado=false;

    public IronGuante() {
    }
    
    

    public int getExpulsor() {
        return expulsor;
    }

    public void setExpulsor(int expulsor) {
        this.expulsor = expulsor;
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
        return "IronGuante{" + "expulsor=" + expulsor + ", salud=" + salud + ", da\u00f1ado=" + dañado + '}';
    }
 
    
}
