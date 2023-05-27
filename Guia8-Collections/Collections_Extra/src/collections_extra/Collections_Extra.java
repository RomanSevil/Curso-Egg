/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_extra;

import collections_extra.servicios.alumnoServicios;
import entidades.Alumno;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Collections_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        alumnoServicios service=new alumnoServicios();
        ArrayList<Alumno> lista=service.crearLista();
        service.imprimirLista(lista);
        service.ordenApellido(lista);
        service.ordenDescNombre(lista);
        service.mostrarEdad(lista);
        service.informeFinal(lista);
    }
    
}
