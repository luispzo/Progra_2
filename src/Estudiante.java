public class Estudiante {
    private String nombre;
    private String banner;
    private String semestre;

    public Estudiante (String nombre){
        this.nombre=nombre;
    }
    public Estudiante(String nombre, String banner){
        this(nombre);
        this.banner = banner;
    }
    public Estudiante(String nombre, String banner, String semestre){
        this(nombre,banner);
        this.semestre;
    }

    }
}
