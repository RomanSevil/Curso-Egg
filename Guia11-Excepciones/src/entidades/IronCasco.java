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
public class IronCasco {
    private int sintetizador=100,consola=100,salud=100;
    private boolean dañado=false;

    public IronCasco() {
    }

    public IronCasco(int sintetizador, int consola, int salud,boolean dañado) {
        this.sintetizador = sintetizador;
        this.consola = consola;
        this.salud = salud;
        this.dañado=dañado;
    }

    public boolean isDañado() {
        return dañado;
    }

    public void setDañado(boolean dañado) {
        this.dañado = dañado;
    }

    public int getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(int sintetizador) {
        this.sintetizador = sintetizador;
    }

    public int getConsola() {
        return consola;
    }

    public void setConsola(int consola) {
        this.consola = consola;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        return "IronCasco{" + "sintetizador=" + sintetizador + ", consola=" + consola + ", salud=" + salud + ", da\u00f1ado=" + dañado + '}';
    }
    
}
