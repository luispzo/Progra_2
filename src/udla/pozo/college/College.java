package udla.pozo.college;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
    private String address;
    private String phone;
    private List<Student> students;
    private List<Department> departments;
    private List<Subject> subjects; // Nueva lista de asignaturas

    // Constructor
    public College(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.students = new ArrayList<>();
        this.departments = new ArrayList<>();
        this.subjects = new ArrayList<>(); // Inicializamos la lista de asignaturas
    }

    // Métodos para manejar estudiantes
    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean deleteStudent(String studentId) {
        return students.removeIf(s -> s.getStudentId().equals(studentId));
    }

    public List<Student> getStudents() {
        return students;
    }

    // Métodos para manejar departamentos
    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    // Métodos para manejar asignaturas
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public boolean deleteSubject(String subjectId) {
        return subjects.removeIf(s -> s.getSubjectId().equals(subjectId));
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    // Getters y setters generales
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
