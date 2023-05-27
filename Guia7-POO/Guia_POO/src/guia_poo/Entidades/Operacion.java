/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Entidades;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Operacion {

    private int num1;
    private int num2;

    public Operacion() {

    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();
    }

    public int sumar() {
        int suma = num1 + num2;
        return suma;
    }

    public int restar() {
        int resta = num1 - num2;
        return resta;
    }

    public int multiplicar() {
        if (num2 != 0) {
            int multiplicacion = num1 * num2;
            return multiplicacion;
        } else {
            return 0;
        }
    }
    
    public double division(){
        if(num2!=0){
            double division=num1/num2;
            return division;
        }else{
            return 0;
        }
    }
}
