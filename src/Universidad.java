public class Universidad {
    private String nombreUniversidad;
    private String ubicacion;

    public Universidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public Universidad(String nombreUniversidad, String ubicacion) {
        this(nombreUniversidad); // Llama al primer constructor
        this.ubicacion = ubicacion;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
