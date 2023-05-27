/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Servicios;

import guia_poo.Entidades.Tiempo;
import java.util.Scanner;

/*
Ejercicio 2
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
*/

public class tiempoServicios {
    Scanner sc=new Scanner(System.in).useDelimiter("\n");
    public Tiempo imprimirHoraCompleta(){
        System.out.println("Ingrese las horas que desea: ");
        int Hora=sc.nextInt();
        while(Hora>23 || Hora<0){
            System.out.println("Hora incorrecta");
            Hora=sc.nextInt();
        }
        System.out.println("Ingrese los minutos que desea: ");
        int minutos=sc.nextInt();
        while(minutos>59 || minutos<0){
            System.out.println("Minutos incorrectos");
            minutos=sc.nextInt();
        }
        System.out.println("Ingrese los segundos que desea: ");
        int segundos=sc.nextInt();
        while(segundos>59 || segundos<0){
            System.out.println("Segundos incorrectos");
            segundos=sc.nextInt();
        }
        Tiempo t1=new Tiempo(Hora,minutos,segundos);
        /*t1.setHora(Hora);
        t1.setMinutos(minutos);
        t1.setSegundos(segundos);*/
        
        return t1;
        
       
    }
}
