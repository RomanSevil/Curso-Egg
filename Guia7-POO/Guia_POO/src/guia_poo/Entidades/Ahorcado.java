/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Entidades;

/**
 *
 * @author usuario
 */
public class Ahorcado {
    private String[] palabra;
    private int letrasEncontradas;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int intentos) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    
}
