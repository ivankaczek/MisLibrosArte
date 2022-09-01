package dominio;

import java.util.Objects;

public class Libro {
    
    protected String nombre;
    protected String autor;
    protected Enum editorial;
    
    public Libro(){
        
    }

    public Libro(String nombre, String autor, Enum editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Enum getEditorial() {
        return editorial;
    }

    public void setEditorial(Enum editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

    @Override
    /*
    la idea de un hashCode es generar un valor lo mas unico posible
    con los valores de los atributos de este objeto
    */
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.autor);
        hash = 59 * hash + Objects.hashCode(this.editorial);
        return hash;
    }

    @Override
    /*
    el metodo .equals hace comparaciones y devuleve un booleano
    lo primero que hace es comparar los 'this', o sea, la referencia
    en memoria, si fuese la misma, ya ni se preocupa por controlar lo demas
    es obvio que se trata del mismo objeto
    luego compara que el objeto no sea nulo
    luego compara que sean de la misma clase, si no son iguales no va a tomarse
    el trabajo de comparar lo otro
    despues castea el objeto a la clase que estamos utilizando
    y por ultimo compara los valores de los objetos
    */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (this.editorial != other.editorial) {
            return false;
        }
        return true;
    }
    
    
    
    
}
