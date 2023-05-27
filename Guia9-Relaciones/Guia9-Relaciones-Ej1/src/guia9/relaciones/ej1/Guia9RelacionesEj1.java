/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.relaciones.ej1;

import guia9.relaciones.ej1.entidades.Perro;
import guia9.relaciones.ej1.entidades.Persona;

/**
 *
 * @author usuario
 */
public class Guia9RelacionesEj1 {

    public static void main(String[] args) {
        Perro m1=new Perro("Chispi", "Mestizo", 5, "Pequeño");
        Perro m2=new Perro("Leon","Labrador",4,"Grande");
        
        Persona p1=new Persona();
        p1.setNombre("Roman");
        p1.setApellido("apellido");
        p1.setDni(43480886);
        p1.setEdad(20);
        p1.setPerro(m1);
        Persona p2=new Persona("Blanca", "Sevil", 87, 10250000, m2);
        
        System.out.println(p1.toString());
        System.out.println("\n");
        System.out.println(p2.toString());
    }
    
}
