/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ej2.extra;

import servicios.cineServicios;

/**
 *
 * @author usuario
 */
public class Guia9Ej2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cineServicios servicios=new cineServicios();
        servicios.crearSala();
        servicios.generarEspectadores();
        servicios.crearCine();
    }
    
}
