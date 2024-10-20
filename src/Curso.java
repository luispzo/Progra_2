public class Curso {
    private String nombreCurso;
    private String nota;

    public Curso(String nombreCurso, String nota) {
        this.nombreCurso = nombreCurso;
        this.nota = nota;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getNota() {
        return nota;
    }

    public String mostrarInformacion() {
        return "Materia: " + nombreCurso + ", Nota: " + nota;
    }
}
