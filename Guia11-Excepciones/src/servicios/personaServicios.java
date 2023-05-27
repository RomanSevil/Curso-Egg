/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class personaServicios {
     private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona() {
        int dia,mes,anio;
        
        
        Persona p1=new Persona();
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        
        //System.out.println("Ingrese la fecha de nacimiento de la persona: / /");
        //fecha=leer.next();
        //SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Ingrese el dia");
        dia=leer.nextInt();
        System.out.println("Ingrese el mes");
        mes=leer.nextInt();
        System.out.println("Ingrese el año");
        anio=leer.nextInt();
        Date fechaNac=new Date(anio-1900,mes-1,dia);
        System.out.println(fechaNac);
       
        
        //Date fechaNac=df.parse(fecha);
        p1.setFechaNacimiento(fechaNac);
        //String imprimirFecha=df.format(fechaNac);
        //System.out.println(imprimirFecha);
        
        /*System.out.println("Ingrese el sexo de la persona");
        p1.setSexo(leer.next());
        System.out.println("Ingrese el peso de la persona");
        p1.setPeso(leer.nextInt());
        System.out.println("Ingrese la altura de la persona");
        p1.setAltura(leer.nextInt());*/
        
        return p1;
    }
    public int calcularIMC(Persona p1){
        int altura=p1.getAltura();
        int peso=p1.getPeso();
        
        int IMC=(peso*100*100)/(altura*altura);
        if(IMC<20){
            return -1;
        }else if(IMC >=20 && IMC <=25){
            return 0;
        }else{
            return 1;
        }
        
    }
    
    public void calcularEdad(Date fechaNac){
      Date hoy=new Date();
      int dias=(int) ((hoy.getTime()-fechaNac.getTime()) / 86400000);
        System.out.println("Nacio hace " + dias+ " dias. " + " Entonces tiene " + (int) dias/365 + " años ");
    }
    
    public boolean esMayorDeEdad (Persona p1)throws Exception{
        if(p1==null){
            throw new Exception("La persona no tiene edad");
        }
        boolean mayor;
        if(p1.getEdad()>=18){
            mayor=true;
        }else{
            mayor=false;
        }
        return mayor;
    }
    
    public boolean menorQue(int edad,Date fechaNac){
        boolean menor;
        Date hoy=new Date();
        int años =((int) ((hoy.getTime()-fechaNac.getTime()) / 86400000))/365;
        //System.out.println(años);
        if(años>edad){
            menor=true;
        }else{
            menor=false;
        }
        return menor;
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println("Nombre: " + p1.getNombre() + ", Fecha de nacimiento: " + p1.getFechaNacimiento()); 
    }
    
}
