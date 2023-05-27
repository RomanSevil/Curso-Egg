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
public class Sala {
    private int fila;
    private char asiento;
    private Espectador espectador;
    private String x;

    public Sala() {
    }

    public Sala(int fila, char asiento) {
        this.fila = fila;
        this.asiento = asiento;
        this.espectador=null;
        this.x="";
        
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getAsiento() {
        return asiento;
    }

    public void setAsiento(char asiento) {
        this.asiento = asiento;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
    

   
    
    

    @Override
    public String toString() {
        return  fila + " " + asiento + x+'|';
    }

    
    
    
   
    
    
}
