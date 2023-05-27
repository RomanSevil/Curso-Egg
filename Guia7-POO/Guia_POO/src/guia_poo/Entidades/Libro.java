/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Entidades;

import java.util.Scanner;


public class Libro {
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int nPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int nPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
    }

    public void cargarDatos(){
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese ISBN");
        ISBN=sc.nextInt();
        System.out.println("Ingrese titulo");
        titulo = sc.next();
        System.out.println("Ingrese autor");
        autor = sc.next();
        System.out.println("Ingrese numero de paginas");
        nPaginas = sc.nextInt();
    }
    
    public void mostrarDatos(){
        System.out.println("ISBN " + ISBN + " Titulo " + titulo + " Autor " + autor +" Numero de paginas " + nPaginas);
}
    
    /*public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getnPaginas() {
        return nPaginas;
    }*/
    
    
    
    
}
