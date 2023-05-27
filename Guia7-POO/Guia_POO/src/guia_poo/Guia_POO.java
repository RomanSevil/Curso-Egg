/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo;

import guia_poo.Entidades.Ahorcado;
import guia_poo.Entidades.Anio;
import guia_poo.Entidades.Cadena;
import guia_poo.Entidades.Cafetera;
import guia_poo.Entidades.Cancion;
import guia_poo.Entidades.Circunferencia;
import guia_poo.Entidades.Cuenta;
import guia_poo.Entidades.Libro;
import guia_poo.Entidades.Matematica;
import guia_poo.Entidades.NIF;
import guia_poo.Entidades.Operacion;
import guia_poo.Entidades.Persona;
import guia_poo.Entidades.Puntos;
import guia_poo.Entidades.Raices;
import guia_poo.Entidades.Rectangulo;
import guia_poo.Entidades.Tiempo;
import guia_poo.Entidades.sopaLetras;
import guia_poo.Servicios.ahorcadoServicios;
import guia_poo.Servicios.cadenaServicios;
import guia_poo.Servicios.matematicaServicios;
import guia_poo.Servicios.nifServicios;
import guia_poo.Servicios.personaServicios;
import guia_poo.Servicios.puntoServicios;
import guia_poo.Servicios.raicesServicios;
import guia_poo.Servicios.sopaLetrasServicios;
import guia_poo.Servicios.tiempoServicios;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Guia_POO {

    //eje1
    /*public static void main(String[] args) {
        //Scanner leer=new Scanner(System.in);
        Libro l1=new Libro();
        l1.cargarDatos();
        l1.mostrarDatos();
    }*/
    //eje2
    /*public static void main(String[] args) {
        Circunferencia c1=new Circunferencia();
        c1.crearCircunferencia();
        c1.area();
        c1.perimetro();
    }*/
    //eje3
    /*public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();
        System.out.println("El resultado de la suma es " + op.sumar());
        System.out.println("El resultado de la resta es " + op.restar());
        if (op.multiplicar() != 0) {
            System.out.println("El resultado de la multiplicacion es " + op.multiplicar());
            
        }else{
            System.out.println("Error! Multiplicacion por cero ");
        }
        
        if (op.division()!= 0) {
            System.out.println("El resultado de la division es " + op.division());
            
        }else{
            System.out.println("Error! División por cero ");
        }
    }*/
    //eje4
    /*public static void main(String[] args) {
        Rectangulo r1=new Rectangulo();
        r1.crearRectangulo();
        r1.dibujarRectangulo();
        
    }*/
    //eje5
    /*public static void main(String[] args) {
        Cuenta c1=new Cuenta();
        c1.crearCuenta();
        c1.consultarSaldo();
        c1.ingresar();
        c1.extraccionRapida();
        c1.retirar();
        c1.consultarSaldo();
        c1.consultarDatos();
       
        
    }*/
    //eje6
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cafetera c1=new Cafetera();
        c1.llenarCafetera();
        System.out.println("Ingrese el tamaño de la taza");
        c1.servirTaza(sc.nextInt());
        //c1.vaciarCafetera();
        System.out.println("Agregue una cantidad de cafe a la cafetera");
        c1.agregarCafe(sc.nextInt());
    }*/
    //eje7
    /*public static void main(String[] args) {
        personaServicios service=new personaServicios();
        Persona P1=service.crearPersona();
        Persona P2=service.crearPersona();
        Persona P3=service.crearPersona();
        Persona P4=service.crearPersona();
        int [] pesos= new int [4];
        boolean [] edades=new boolean[4];
        int peso1,peso2,peso3,peso4;
        boolean edad1,edad2,edad3,edad4;
        int ideal,sobrepeso,bajo;
        int mayor=0;
        int menor=0;
        ideal=0;
        sobrepeso=0;
        bajo=0;
        //int p;
        //Scanner leer=new Scanner(System.in);
        
        
                peso1=service.calcularIMC(P1);
                pesos[0]=peso1;
                if(peso1==0){
                    System.out.println(P1.getNombre() + " esta en su peso ideal ");
                }else if(peso1==1){
                    System.out.println(P1.getNombre() + " tiene sobrepeso");
                }else{
                    System.out.println(P1.getNombre() + " esta debajo de su peso");
                } 
                edad1=service.esMayorDeEdad(P1);
                edades[0]=edad1;
                if(edad1){
                    System.out.println( P1.getNombre() + " es mayor de edad ");
                }
           
                peso2=service.calcularIMC(P2);
                pesos[1]=peso2;
                if(peso2==0){
                    System.out.println(P2.getNombre() + " esta en su peso ideal ");
                }else if(peso2==1){
                    System.out.println(P2.getNombre() + " tiene sobrepeso");
                }else{
                    System.out.println(P2.getNombre() + " esta debajo de su peso");
                } 
                edad2=service.esMayorDeEdad(P2);
                edades[1]=edad2;
                if(edad2){
                    System.out.println( P2.getNombre() + " es mayor de edad ");
                }
            
                peso3=service.calcularIMC(P3);
                pesos[2]=peso3;
                if(peso3==0){
                    System.out.println(P3.getNombre() + " esta en su peso ideal ");
                }else if(peso3==1){
                    System.out.println(P3.getNombre() + " tiene sobrepeso");
                }else{
                    System.out.println(P3.getNombre() + " esta debajo de su peso");
                } 
                edad3=service.esMayorDeEdad(P3);
                edades[2]=edad3;
                if(edad3){
                    System.out.println( P3.getNombre() + " es mayor de edad ");
                }
            
                peso4=service.calcularIMC(P4);
                pesos[3]=peso4;
                if(peso4==0){
                    System.out.println(P4.getNombre() + " esta en su peso ideal ");
                }else if(peso4==1){
                    System.out.println(P4.getNombre() + " tiene sobrepeso");
                }else{
                    System.out.println(P4.getNombre() + " esta debajo de su peso");
                } 
                edad4=service.esMayorDeEdad(P4);
                edades[3]=edad4;
                if(edad4){
                    System.out.println( P4.getNombre() + " es mayor de edad ");
                }else{
                    System.out.println(P4.getNombre() + " es menor de edad ");
                }
        
                for(int i=0;i<pesos.length;i++){
                    if(pesos[i]==0){
                        ideal++;
                    }else if(pesos[i]==1){
                        sobrepeso++;
                    }else{
                        bajo++;
                    }
                }
                
                System.out.println("El porcentaje de las personas con baso peso es de " + bajo*100/4 + "%");
                System.out.println("El porcentaje de las personas con peso ideal es de " + ideal*100/4 +"%");
                System.out.println("El porcentaje de las personas con sobrepeso es de " + sobrepeso*100/4 +"%");
                
                for(int i=0;i<edades.length;i++){
                    if(edades[i]){
                        mayor++;
                    }else{
                        menor++;
                    }
                }
                
                System.out.println("El porcentaje de personas mayores de edad es de " + mayor*100/4 +"%");
                System.out.println("El porcentaje de personas menores de edad es de " + menor*100/4 + "%");
                
    }*/
    //eje8
    /*public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String nuevaFrase;
        cadenaServicios service = new cadenaServicios();
        Cadena c1 = new Cadena();
        System.out.println("Ingrese una frase ");
        c1.setFrase(read.next());
        c1.setLongitud(c1.getFrase().length());

        System.out.println(" Cantidad de vocales de " + c1.getFrase() + ": " + service.mostrarVocales(c1));

        service.invertirFrase(c1);
        System.out.println("Ingrese un caracter para ver cuantas veces se repite:");

        String letra;
        do {
            letra = read.next();
        } while (letra.length() != 1);
        System.out.println("El caracter se repite " + service.vecesRepetido(letra, c1) + " veces");

        System.out.println("Ingrese una frase para comparar la longitud");
        nuevaFrase = read.next();

        if (service.compararLongitud(nuevaFrase, c1)) {
            System.out.println("La longitud de la frase ingresada es igual a la frase que compone la clase");
        } else {
            System.out.println("La longitud de las frases son diferentes");
        }

        service.unirFrases(nuevaFrase, c1);

        System.out.println(
                "Ingrese una letra para reemplazar a las letras a");
        service.reemplazar(read.next(), c1);

        if (service.contiene(read.next(), c1)) {
            System.out.println("La frase contiene la letra ingresada");
        } else {
            System.out.println("No se encontro la letra en la frasehol");
        }

    }*/

//eje9
/*public static void main(String[] args) {
        
        matematicaServicios service=new matematicaServicios();
        Matematica m=new Matematica();
        m.setNum1(Math.random()*100);
        m.setNum2(Math.random()*100);
        System.out.println("El numero mayor es " + Math.round(service.devolverMayor(m)));
        service.calcularPotencia(m);
        service.calcularRaiz(m);
    }*/
//eje10
/*public static void main(String[] args) {
        Double arregloA[]=new Double[50];
        Double arregloB[]=new Double[20];
        Double aux[]=new Double[10];
        Double num;
        for(int i=0;i<arregloA.length;i++){
            arregloA[i]=Math.random()*100;
            System.out.print(Math.round(arregloA[i]) + " ");
        }
        System.out.println(" ");
        System.out.println("Array B ");
        
        for(int i=0;i<arregloB.length;i++){
            arregloB[i]=Math.random()*100;
            System.out.print(Math.round(arregloB[i]) + " ");
        }
        System.out.println(" ");
        
        Arrays.sort(arregloA);
        System.out.println("Array A ordenado:");
         for(int i=0;i<arregloA.length;i++){
            System.out.print(Math.round(arregloA[i]) + " ");
        }
        
         
             
             for(int j=0;j<10;j++){
             num=arregloA[j];    
             arregloB[j]=num;
             //Arrays.fill(aux,0,10,num);
            //Arrays.fill(arregloB,10,20,num);
         
    }
         Arrays.fill(arregloB,10,20,0.5);
         
         System.out.println(" ");
         System.out.println("Array combinado ");
         for(int i=0;i<arregloB.length;i++){
            System.out.print((arregloB[i]) + " ");
        }
    }*/
//eje11
/*public static void main(String[] args) {
        int dia,mes,anio;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un dia");
        dia=leer.nextInt();
        System.out.println("Ingrese un mes");
        mes=leer.nextInt();
        System.out.println("Ingrese un año");
        anio=leer.nextInt();
        Date fecha=new Date(anio,mes,dia);
        Date fechaActual=new Date();
        
       //System.out.println(fechaActual.getYear());
     
        System.out.println("Hay " + (fechaActual.getYear()+1900-fecha.getYear()) + " años de diferencia");
    }*/
//eje12
/*public static void main(String[] args) throws ParseException {
        personaServicios service=new personaServicios();
        Persona p1=service.crearPersona();
        service.calcularEdad(p1.getFechaNacimiento());
        if(service.menorQue(14, p1.getFechaNacimiento())){
            System.out.println("Es menor que " + p1.getNombre());
        }else{
            System.out.println("Es mayor que " + p1.getNombre());
        }
        service.mostrarPersona(p1);
        
    }*/
//eje 1 Extra
/*public static void main(String[] args) {
        Cancion c1=new Cancion("Proud Mary","John Fogerty");
        System.out.println("La cancion es " + c1.getTitulo() + " y el autor es " + c1.getAutor());
    }*/
//eje 2 Extra
/*public static void main(String[] args) {
        puntoServicios service=new puntoServicios();
        Puntos p1=service.crearPuntos();
        Puntos p2=service.crearPuntos();
        System.out.println("La distancia entre los puntos es " + service.calcularDistancia(p1, p2));
    }*/
//eje3 Extra
/*public static void main(String[] args) {
        raicesServicios service=new raicesServicios();
        Raices r1=service.ingresarCoeficientes();
        double disc=service.getDiscriminante(r1);
        System.out.println("Discriminante " + disc);
        service.calcular(disc, r1);
        
    }*/
//eje4 Extra
/*public static void main(String[] args) {
        nifServicios servicios=new nifServicios();
        NIF n1=servicios.crearNif();
        servicios.mostrar(n1);
    }*/
//eje5 Extra
/*public static void main(String[] args) {
        Anio a1=new Anio();
        Scanner leer=new Scanner(System.in);
        String nombre;
        String meses[]=new String[12];
        
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";
        meses[4]="mayo";
        meses[5]="junio";
        meses[6]="julio";
        meses[7]="agosto";
        meses[8]="septiembre";
        meses[9]="octubre";
        meses[10]="noviembre";
        meses[11]="diciembre";
        a1.setMes(meses);
        a1.setMesSecreto(meses[9]);
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        nombre=leer.next();
        while(!nombre.equalsIgnoreCase(a1.getMesSecreto())){
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            nombre=leer.next();
            
        }
        if(nombre.equals(a1.getMesSecreto())){
                System.out.println("¡Ha acertado!");
            }
        
    }*/
//eje6 Extra
/*public static void main(String[] args) {
         
        ahorcadoServicios service=new ahorcadoServicios();
        Ahorcado a1=service.crearJuego();
        service.juego(a1);
    }*/
    
    /*public static void main(String[] args) {
        sopaLetrasServicios service=new sopaLetrasServicios();
        sopaLetras sopa1=service.crearSopa();
        service.imprimirSopa(sopa1);
        service.buscarPalabra(sopa1);
    }*/
    
    /*public static void main(String[] args) {
        tiempoServicios service=new tiempoServicios();
        Tiempo t1=service.imprimirHoraCompleta();
        System.out.println(t1.toString());
    }*/
    
}
