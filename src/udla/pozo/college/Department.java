package udla.pozo.college;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Professor> professors;
    private Professor director;

    // Constructor
    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    // Métodos para manejar profesores
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setDirector(Professor director) {
        this.director = director;
    }

    public Professor getDirector() {
        return director;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
