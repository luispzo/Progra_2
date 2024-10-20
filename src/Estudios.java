import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Estudios {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nombrepersona;
        String universidadpersona;
        String ubicacionuniversidad;
        String bannerpersona;
        String cursopersona;
        String notasmaterias;
        String continuar;
        String continuarMaterias;

        StringBuilder infoFinal = new StringBuilder(); // Acumula la información para mostrar al final

        do {

            System.out.println("Universidad: ");
            universidadpersona = br.readLine();

            System.out.println("Ubicación de la Universidad: ");
            ubicacionuniversidad = br.readLine();


            System.out.println("Nombre del Estudiante: ");
            nombrepersona = br.readLine();

            System.out.println("Banner: ");
            bannerpersona = br.readLine();

            System.out.println("Semestre: ");
            cursopersona = br.readLine();


            Estudiante estudianteECU = new Estudiante(nombrepersona, bannerpersona, cursopersona);


            Universidad universidadesECU = new Universidad(universidadpersona, ubicacionuniversidad);


            StringBuilder materiasInfo = new StringBuilder();
            do {
                System.out.println("Ingrese la materia: ");
                cursopersona = br.readLine();

                System.out.println("Ingrese la nota de la materia: ");
                notasmaterias = br.readLine();

                Curso cursoECU = new Curso(cursopersona, notasmaterias);
                materiasInfo.append(cursoECU.mostrarInformacion()).append("\n");

                System.out.println("¿Agregar otra materia? (si/no): ");
                continuarMaterias = br.readLine();

            } while (continuarMaterias.equalsIgnoreCase("si"));

            infoFinal.append("Universidad: ").append(universidadesECU.getNombreUniversidad()).append("\n");
            infoFinal.append("Ubicación de la Universidad: ").append(universidadesECU.getUbicacion()).append("\n");
            infoFinal.append("Nombre del Estudiante: ").append(estudianteECU.getNombre()).append("\n");
            infoFinal.append("Banner: ").append(estudianteECU.getBanner()).append("\n");
            infoFinal.append("Semestre: ").append(estudianteECU.getSemestre()).append("\n");
            infoFinal.append("Materias y Notas:\n").append(materiasInfo).append("\n");

            System.out.println("¿Otro estudiante? (si/no): ");
            continuar = br.readLine();

        } while (continuar.equalsIgnoreCase("si"));

        // Mostrar toda la información acumulada
        System.out.println("Ingreso de estudiantes terminado\n");
        System.out.println("Información ingresada:\n" + infoFinal.toString());
    }
}

