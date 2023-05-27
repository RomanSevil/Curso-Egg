/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.herencia.ej1;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author usuario
 */
public class Guia10HerenciaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1=new Perro("Chispy","Carne",5,"Mestizo");
        perro1.alimentarse();
        
        Animal gato1=new Gato("Bella","Pescado",5,"Siames");
        gato1.alimentarse();
        
        Animal caballo1=new Caballo("Spark", "Pasto", 8, "Fino");
        caballo1.alimentarse();
    }
    
}
