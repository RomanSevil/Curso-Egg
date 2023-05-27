/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.herencia.ej4;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author usuario
 */
public class Guia10HerenciaEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1=new Circulo();
        Rectangulo r1=new Rectangulo();
        
        c1.setDiametro(25d);
        c1.setRadio(20d);
        c1.calcularArea();
        c1.calcularPerimetro();
        System.out.println(c1);
        
        r1.setAltura(30d);
        r1.setBase(45d);
        r1.calcularArea();
        r1.calcularPerimetro();
        System.out.println(r1);
    }
    
}
