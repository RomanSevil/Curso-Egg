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
public class sopaLetras {
    String[][]matriz;
    String palabra;

    public sopaLetras() {
    }

    
    public sopaLetras(String[][] matriz, String palabra) {
        this.matriz = matriz;
        this.palabra = palabra;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    
}
