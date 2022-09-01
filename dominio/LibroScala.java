package dominio;
public class LibroScala extends Libro { 
    
    private int idLibroScala;
    private static int contadorLibroScala;
    private int cantImagenes;
    // en otro momento agregar un array de objetos tipo 'Imagen en libro de arte'
    
    
    public LibroScala(){
        /*
        para poder crear un objeto 'hijo' tiene que existir un constructor
        vacio en el objeto 'padre' porque si no te da error
        porque de hecho lo esta llamando impicitamente
        */
        
        LibroScala.contadorLibroScala++;
        this.idLibroScala = LibroScala.contadorLibroScala;
        this.editorial = libros_enums.Editoriales.SCALA;
        this.autor = "Visual Encyclopedia of Art, various authors";
    }
    
    public LibroScala(String nombre, int cantImagenes){
        this();
        this.cantImagenes = cantImagenes;
        this.nombre = nombre;
       
    }

    public int getIdLibroScala() {
        return idLibroScala;
    }

    public void setIdLibroScala(int idLibroScala) {
        this.idLibroScala = idLibroScala;
    }

    public static int getContadorLibroScala() {
        return contadorLibroScala;
    }

    public static void setContadorLibroScala(int contadorLibroScala) {
        LibroScala.contadorLibroScala = contadorLibroScala;
    }

    public int getCantImagenes() {
        return cantImagenes;
    }

    public void setCantImagenes(int cantImagenes) {
        this.cantImagenes = cantImagenes;
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
    
    
    
    
    
}
