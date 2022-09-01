package test;

import dominio.*;
import libros_enums.Editoriales;

public class TestLibro {

    public static void main(String[] args) {
        
        Libro libro01 = new Libro("Rubens", "No alcanzo a leer", libros_enums.Editoriales.KONEMANN);
        //System.out.println("libro01 = " + libro01);
        Libro libro02 = new Libro("Rubens", "No alcanzo a leer", libros_enums.Editoriales.KONEMANN);
        //System.out.println("libro02 = " + libro02);
        
        LibroScala scala01 = new LibroScala("Renacimiento", 158);;
        //System.out.println("scala01 = " + scala01);
        
        if (libro01==libro02) {
            System.out.println("tienen la misma referencia en memoria");
        } else {
            System.out.println("tienen distinta referencia en memoria");
            System.out.println("porque el operador 'new' asigna diferentes referencias en memoria");
        }
        System.out.println("");
        if (libro01.equals(libro02)) {
            System.out.println("los objetos tienen exactamente el mismo contenido");
        } else {
            System.out.println("los objetos tienen diferente contenido");
        }
        System.out.println("");
        if (libro01.hashCode() == libro02.hashCode()) {
            System.out.println("tienen el mismo hashCode");
            System.out.println("cuando equals es verdadero entonces hashCode tambien debe serlo");
            System.out.println("hashCode para libro 01 es " + libro01.hashCode());
        } else {
            System.out.println("los objetos tienen distinto hashCode");
        }
        
        
    }

    
}
