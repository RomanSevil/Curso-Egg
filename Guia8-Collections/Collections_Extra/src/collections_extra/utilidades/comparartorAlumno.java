/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_extra.utilidades;

import entidades.Alumno;
import java.util.Comparator;

/**
 *
 * @author usuario
 */
public class comparartorAlumno {
    public static Comparator<Alumno> comparaApellido=new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a1, Alumno a2) {
            return a1.getApellido().compareTo(a2.getApellido());
        }
    };
    
    public static Comparator<Alumno> comparaNombre=new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a1, Alumno a2) {
            return a2.getNombre().compareTo(a1.getNombre());
        }
    };
}
