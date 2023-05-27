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
public class Estudiante extends Persona {
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso) {
        this.curso = curso;
    }

    public Estudiante(String curso, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void matricularCurso(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese el nuevo curso del estudiante " + this.getNombre() );
        String nuevoCurso=sc.next();
        this.setCurso(nuevoCurso);
        
    }

    @Override
    public String toString() {
        return  super.toString()+" Estudiante{" + "curso=" + curso + '}';
    }
    
}
