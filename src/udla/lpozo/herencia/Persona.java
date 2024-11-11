package udla.lpozo.herencia;

public /*final <- es para prevenir herencia*/ class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    //primera forma de acceder a alumno y profesor es cambiando de private a protected


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
