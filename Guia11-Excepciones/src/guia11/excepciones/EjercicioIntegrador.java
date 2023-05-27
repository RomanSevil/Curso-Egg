/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11.excepciones;

import entidades.IronArmadura;
import servicios.IronManServicios;

/**
 *
 * @author usuario
 */
public class EjercicioIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IronManServicios service=new IronManServicios();
        service.crearArmadura();
        service.gastarEnergia();
        service.MostrarEstado();
        
        
    }
    
}
