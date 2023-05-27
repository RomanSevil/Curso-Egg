/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ej3;

import entidades.Baraja;
import servicios.cartasServicios;

/**
 *
 * @author usuario
 */
public class Guia9Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cartasServicios service=new cartasServicios();
        Baraja b1=service.crearCarta();
        
        
        service.barajar(b1);
        //service.siguienteCarta(b1);
        
        service.darCartas(b1);
        service.mostrarBaraja(b1);
        
    }
    
}
