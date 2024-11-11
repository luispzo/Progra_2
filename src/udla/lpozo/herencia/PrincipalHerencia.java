package udla.lpozo.herencia;

public class PrincipalHerencia {
    public static void main(String[] args) {
        Persona persona = new Persona();

        //Persona alumno = new Alumno();
        //esto se puedo ya que estamos con 'extends'

        Alumno alumno = new Alumno();
        alumno.setNombre("Julio");
        alumno.setApellido("Jaramillo");
        alumno.setCarrera("Ing. Software");
        alumno.setEdad(22);
        alumno.setNotap1(7D);
        System.out.println("Datos de alumno");
        System.out.println("Nombre y Apellido: " + alumno.getNombre() + "  " + alumno.getApellido());

        AlumnoInt alumnoint = new AlumnoInt();
        alumnoint.setCiudad("oda");
        Profesor profesor = new Profesor();


    }
}
