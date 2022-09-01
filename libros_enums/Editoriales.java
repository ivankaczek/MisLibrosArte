package libros_enums;
public enum Editoriales {

SCALA("Scala"),
FOLIO("Folio"),
KONEMANN("Könemann");

// definimos un atributo para la enumeracion

protected final String nombreParaMostrar;

// definimos un constructor

    private Editoriales(String nombreParaMostrar) {
        this.nombreParaMostrar = nombreParaMostrar;
    }

    public String getNombreParaMostrar() {
        return nombreParaMostrar;
    }
    
    


}
