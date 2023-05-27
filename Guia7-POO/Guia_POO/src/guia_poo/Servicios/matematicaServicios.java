/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Servicios;

import guia_poo.Entidades.Matematica;

/**
 *
 * @author usuario
 */
public class matematicaServicios {
    Matematica m1=new Matematica();
            
    public Double devolverMayor(Matematica m1){
        double mayor;
        mayor=Math.max(m1.getNum1(), m1.getNum2());
        
        return mayor;
    }
    
    public void calcularPotencia(Matematica m1){
        double potencia,mayor,menor;
        mayor=Math.max(m1.getNum1(), m1.getNum2());
        menor=Math.min(m1.getNum1(), m1.getNum2());
        Math.round(menor);
        Math.round(mayor);
        potencia=Math.pow(mayor, menor);
        
        System.out.println("El resultado de la potencia es de " + Math.round(potencia));
    }
    
    public void calcularRaiz(Matematica m1){
        double menor;
        menor=Math.min(m1.getNum1(), m1.getNum2());
        Math.abs(menor);
        System.out.println("El resultado de la raiz de " + Math.round(menor) + " es de " + Math.sqrt(menor));
    }
    
    
}
