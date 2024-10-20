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
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}