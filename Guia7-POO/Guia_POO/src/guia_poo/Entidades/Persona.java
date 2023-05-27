/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Entidades;

//import guia_poo.Servicios.personaServicios;

import java.util.Date;




/**
 *
 * @author usuario
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private int altura;
    private Date fechaNacimiento;
    
    public Persona(){
        
    }
    
    public Persona(String nombre,int edad,String sexo,int peso,int altura,Date fechaNacimiento){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
        this.fechaNacimiento=fechaNacimiento;
        
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
    
    
    
    
}
