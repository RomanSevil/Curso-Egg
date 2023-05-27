/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.herencia.ej4extra;

import entidades.Empleado;
import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalServicio;
import entidades.Profesor;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author usuario
 */
public class Guia10HerenciaEj4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generate = new Random();
        ArrayList<Persona> personas = new ArrayList<>();
        String[] nombres = {"Roman", "Marcus", "John", "Anthony", "Paul", "Robert", "Tom", "Fletcher", "Louis", "Rick", "Jacob", "Andrew", "Samuel", "Alexis", "Vladimir", "Javier", "Mateo", "Andres", "Simon", "David", "Arnold", "Martin", "Joe", "Donald", "Ronald", "George"};
        String[] apellidos = {"Sevil", "Johnson", "Smith", "Perez", "De Paul", "Alvarez", "Gutierrez", "Fernandez", "Orban", "Nuñez", "Garcia", "Riquelme", "Martinez", "Sanchez", "Rios", "Plaza", "Mateos", "Ramirez", "Reede", "Saravia", "Gonzalez", "Zapata", "Lopez", "Cordoba", "Palermo", "Torres"};
        String[] cursos = {"Ingenieria Civil", "Analista de Sistemas", "Ingeniero en sistemas", "Abogacia", "Medicina", "Literatura"};
        String[] estadoCivil = {"Casado", "Soltero", "Separado", "Divorciado", "Viudo"};
        String[] departamento = {"Lenguaje", "Arquitectura", "Matematica"};
        String[] seccion = {"Biblioteca", "Decanato", "Secretaria"};

        System.out.println("Ingrese cuantas personas desea agregar");
        int n = sc.nextInt();
        int opc;
        for (int i = 0; i < n; i++) {
            System.out.println("1.Estudiante 2.Profesor 3.Personal Servicio");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    personas.add(new Estudiante(cursos[generate.nextInt(cursos.length)], nombres[generate.nextInt(nombres.length)], apellidos[generate.nextInt(apellidos.length)], (int) (Math.random() * (100000000 - 10000000) + 10000000), estadoCivil[generate.nextInt(estadoCivil.length)]));
                    break;
                case 2:
                    personas.add(new Profesor(departamento[generate.nextInt(departamento.length)], (int) (Math.random() * (2022 - 1990) + 1990), (int) (Math.random() * (100 - 1) + 1), nombres[generate.nextInt(nombres.length)], apellidos[generate.nextInt(apellidos.length)], (int) (Math.random() * (100000000 - 10000000) + 10000000), estadoCivil[generate.nextInt(estadoCivil.length)]));
                    break;
                case 3:
                    personas.add(new PersonalServicio(seccion[generate.nextInt(seccion.length)], (int) (Math.random() * (2022 - 1990) + 1990), (int) (Math.random() * (100 - 1) + 1), nombres[generate.nextInt(nombres.length)], apellidos[generate.nextInt(apellidos.length)], (int) (Math.random() * (100000000 - 10000000) + 10000000), estadoCivil[generate.nextInt(estadoCivil.length)]));
                    break;
            }

        }

        for (Persona p1 : personas) {
            System.out.println(p1);
        }

        String nombre, apellido;
        boolean salir = false;
        do{
        System.out.println("\n");
        System.out.println("1.Cambiar estado civil \n2.Reasignar despacho \n3.Matricular estudiante \n4.Cambiar departamento de profesor \n5.Cambiar seccion del personal de servicio\n6.Imprimir info");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese el nombre ");
                nombre = sc.next();
                System.out.println("Ingrese el apellido");
                apellido = sc.next();
                for (Persona p1 : personas) {
                    if (p1.getNombre().equalsIgnoreCase(nombre) && p1.getApellido().equalsIgnoreCase(apellido)) {
                        p1.cambiarEstadoCivil();
                    }
                }
                break;
            case 2:
                System.out.println("Ingrese el nombre ");
                nombre = sc.next();
                System.out.println("Ingrese el apellido");
                apellido = sc.next();
                for (Persona p1 : personas) {
                    if (p1 instanceof Empleado) {
                        Empleado object = (Empleado) p1;

                        if (p1.getNombre().equalsIgnoreCase(nombre) && p1.getApellido().equalsIgnoreCase(apellido)) {
                            ((Empleado) p1).reasignarDespacho();

                        }
                    }

                }
                break;
            case 3:
                System.out.println("Ingrese el nombre estudiante");
                nombre = sc.next();
                System.out.println("Ingrese el apellido estudiante ");
                apellido = sc.next();
                for (Persona p1 : personas) {
                    if (p1 instanceof Estudiante) {
                        Estudiante object = (Estudiante) p1;
                        if (p1.getNombre().equalsIgnoreCase(nombre) && p1.getApellido().equalsIgnoreCase(apellido)) {
                            ((Estudiante) p1).matricularCurso();
                        }
                    }
                }
                break;
            case 4:
                System.out.println("Ingrese el nombre del profesor ");
                nombre = sc.next();
                System.out.println("Ingrese el apellido del profesor ");
                apellido = sc.next();
                for (Persona p1 : personas) {
                    if (p1 instanceof Profesor) {
                        Profesor object = (Profesor) p1;
                        if (p1.getNombre().equalsIgnoreCase(nombre) && p1.getApellido().equalsIgnoreCase(apellido)) {
                            ((Profesor) p1).reasignar();
                        }
                    }
                }
                break;
            case 5:
                System.out.println("Ingrese el nombre del personal de servicio ");
                nombre = sc.next();
                System.out.println("Ingrese el apellido del personal de servicio ");
                apellido = sc.next();
                for (Persona p1 : personas) {
                    if (p1 instanceof PersonalServicio) {
                        PersonalServicio object = (PersonalServicio) p1;
                        if (p1.getNombre().equalsIgnoreCase(nombre) && p1.getApellido().equalsIgnoreCase(apellido)) {
                            ((PersonalServicio) p1).reasignar();
                        }

                    }
                }
                break;
            case 6:
                int i=0,j=0,k=0;
                System.out.println("Estudiantes ");
                for (Persona p1 : personas) {
                    if (p1 instanceof Estudiante) {
                        i++;
                        Estudiante object = (Estudiante) p1;
                        System.out.println(p1);
                    }
                }
                System.out.println("Profesores");
                for (Persona p1 : personas) {
                    if (p1 instanceof Profesor) {
                        j++;
                        Profesor object = (Profesor) p1;
                        System.out.println(p1);
                    }
                }

                System.out.println("Personal de servicio");
                for (Persona p1 : personas) {
                    if (p1 instanceof PersonalServicio) {
                        k++;
                        PersonalServicio object = (PersonalServicio) p1;
                        System.out.println(p1);
                    }
                }
                System.out.println(i +" Estudaintes");
                System.out.println(j +" Profesores");
                System.out.println(k +" Personal de servicio");
                break;
            case 7:
                salir = true;
                default:
                    System.out.println("Opcion invalida");

        }
        }while(!salir);

    }

}
/*Profesor p1=new Profesor("Arquitectura", 2019, 21, "Juan", "Perez", 26479315, "casado");
        p1.cambiarEstadoCivil();
        p1.reasignar();
        ArrayList<String>nombres=new ArrayList<>(Arrays.asList("Roman", "Marcus", "John", "Anthony", "Paul", "Robert", "Tom", "Fletcher", "Louis", "Rick","Jacob","Andrew","Samuel","Alexis", "Vladimir", "Javier", "Mateo", "Andres", "Simon", "David", "Arnold", "Martin", "Joe", "Donald", "Ronald", "George"));
        ArrayList<String>apellidos=new ArrayList<>(Arrays.asList("Sevil", "Johnson", "Smith", "Perez", "De Paul", "Alvarez", "Gutierrez", "Fernandez", "Orban", "Nuñez","Garcia","Riquelme","Martinez","Sanchez", "Rios", "Plaza", "Mateos", "Ramirez", "Reede", "Saravia", "Gonzalez", "Zapata", "Lopez", "Cordoba", "Palermo", "Torres"));
        Collections.shuffle(apellidos);
        Collections.shuffle(nombres);
        
        
        
 */
