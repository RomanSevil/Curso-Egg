/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class AlojamientoExtra extends Alojamiento{
    private boolean privado;
    private int m2;

    public AlojamientoExtra() {
    }

    public AlojamientoExtra(boolean privado, int m2) {
        this.privado = privado;
        this.m2 = m2;
    }

    public AlojamientoExtra(boolean privado, int m2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.m2 = m2;
    }

    

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }
    
    
    public void crearAlojamientoExtra(){
        crearAlojamiento();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese si es privado o no");
        String opc=sc.next();
        if(opc.equalsIgnoreCase("si")){
            this.setPrivado(true);
        }else{
            this.setPrivado(false);
        }
        System.out.println("Ingrese los metros cuadrados ");
        this.setM2(sc.nextInt());
    }

    @Override
    public String toString() {
        return "AlojamientoExtra{" + "privado=" + privado + ", m2=" + m2 + super.toString()+'}';
    }
    
    
    
}
