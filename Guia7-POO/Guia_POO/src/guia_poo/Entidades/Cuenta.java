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
public class Cuenta {
    Scanner leer=new Scanner(System.in);
    int numeroCuenta;
    long dni;
    int saldoActual;
    int interes;
    public Cuenta() {
    }
    public Cuenta(int numeroCuenta,long dni,int saldo,int interes){
        this.numeroCuenta=numeroCuenta;
        this.dni=dni;
        this.saldoActual=saldo;
        this.interes=interes;
    }
    
    public void crearCuenta(){
        System.out.println("Ingrese su DNI");
        dni=leer.nextInt();
        System.out.println("Ingrese su numero de cuenta");
        numeroCuenta=leer.nextInt();
        
    }
    
    public void ingresar(){
        System.out.println("Ingrese una cantidad de dinero a su saldo");
        int monto=leer.nextInt();
        saldoActual+=monto;
    }
    
    public void retirar(){
        System.out.println("Ingrese una cantidad a retirar");
        int extraccion=leer.nextInt();
        if(saldoActual<extraccion){
            saldoActual=0;
            System.out.println("Su saldo actual es 0");
        }else{
        saldoActual-=extraccion;
        }
    }
    
    public void extraccionRapida(){
        System.out.println("El 20% de su saldo es " + saldoActual*20/100);
        int extraer=leer.nextInt();
        
        if(extraer<=saldoActual*20/100){
            saldoActual-=extraer;
        }else{
            System.out.println("La cantidad a extraer es muy grande");
        }
        
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es " + saldoActual);
    }
    
    public void consultarDatos(){
        System.out.println("Su DNI es " + dni);
        System.out.println("Su nuemro de cuenta es " + numeroCuenta);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
    
}
