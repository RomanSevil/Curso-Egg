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
public class Cine {
    private Pelicula pelicula;
    private int precioEntrada;
    private Sala sala[][];

    public Cine() {
    }

    public Cine(Pelicula pelicula, int precioEntrada) {
        //sala=new Sala[fil][col];
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Sala[][] getSala() {
        return sala;
    }

    public void setSala(Sala[][] sala) {
        this.sala = sala;
    }
    
    

   

    

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + ", sala=" + sala + '}';
    }
    
    
    
    
}
