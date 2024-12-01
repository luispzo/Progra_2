package udla.pozo.college;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainCollege {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        College college = new College("UDLA", "Av. Universitaria", "123-456-789");
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Agregar departamento");
            System.out.println("5. Mostrar departamentos");
            System.out.println("6. Agregar asignatura");
            System.out.println("7. Eliminar asignatura");
            System.out.println("8. Mostrar asignaturas");
            System.out.println("9. Salir");
            System.out.print("Selecciona una opción: ");
            String opcion = br.readLine();

            switch (opcion) {
                case "1": // Agregar estudiante
                    System.out.print("Ingresa el nombre del estudiante: ");
                    String nombreEstudiante = br.readLine();
                    System.out.print("Ingresa el ID del estudiante: ");
                    String studentId = br.readLine();
                    college.addStudent(new Student(nombreEstudiante, studentId));
                    System.out.println("Estudiante agregado con éxito.");
                    break;

                case "2": // Eliminar estudiante
                    System.out.print("Ingresa el ID del estudiante a eliminar: ");
                    String idEliminarEstudiante = br.readLine();
                    if (college.deleteStudent(idEliminarEstudiante)) {
                        System.out.println("Estudiante eliminado con éxito.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case "3": // Mostrar estudiantes
                    System.out.println("Lista de estudiantes:");
                    if (college.getStudents().isEmpty()) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        for (Student s : college.getStudents()) {
                            System.out.println("- " + s.getName() + " (ID: " + s.getStudentId() + ")");
                        }
                    }
                    break;

                case "4": // Agregar departamento
                    System.out.print("Ingresa el nombre del departamento: ");
                    String nombreDepartamento = br.readLine();
                    college.addDepartment(new Department(nombreDepartamento));
                    System.out.println("Departamento agregado con éxito.");
                    break;

                case "5": // Mostrar departamentos
                    System.out.println("Lista de departamentos:");
                    if (college.getDepartments().isEmpty()) {
                        System.out.println("No hay departamentos registrados.");
                    } else {
                        for (Department d : college.getDepartments()) {
                            System.out.println("- " + d.getName());
                        }
                    }
                    break;

                case "6": // Agregar asignatura
                    System.out.print("Ingresa el nombre de la asignatura: ");
                    String nombreAsignatura = br.readLine();
                    System.out.print("Ingresa el ID de la asignatura: ");
                    String subjectId = br.readLine();
                    college.addSubject(new Subject(nombreAsignatura, subjectId));
                    System.out.println("Asignatura agregada con éxito.");
                    break;

                case "7": // Eliminar asignatura
                    System.out.print("Ingresa el ID de la asignatura a eliminar: ");
                    String idEliminarAsignatura = br.readLine();
                    if (college.deleteSubject(idEliminarAsignatura)) {
                        System.out.println("Asignatura eliminada con éxito.");
                    } else {
                        System.out.println("Asignatura no encontrada.");
                    }
                    break;

                case "8": // Mostrar asignaturas
                    System.out.println("Lista de asignaturas:");
                    if (college.getSubjects().isEmpty()) {
                        System.out.println("No hay asignaturas registradas.");
                    } else {
                        for (Subject sub : college.getSubjects()) {
                            System.out.println("- " + sub.getName() + " (ID: " + sub.getSubjectId() + ")");
                        }
                    }
                    break;

                case "9": // Salir
                    System.out.println("Saliendo del sistema...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }
}
