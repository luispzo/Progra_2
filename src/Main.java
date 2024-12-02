import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Crear el animal según el tipo que el usuario elija
        System.out.println("Por favor, ingresa el tipo de animal (Perro o Gato):");
        String tipo = scan.nextLine();

        Animal animal; // Creamos una variable para el animal.

        if (tipo.equalsIgnoreCase("Perro")) {
            animal = new Perro("Perro");
        } else if (tipo.equalsIgnoreCase("Gato")) {
            animal = new Gato("Gato");
        } else {
            System.out.println("Tipo de animal no reconocido. Creando un animal genérico.");
            animal = new Animal("Animal Genérico");
        }

        // 2. Mostrar sonidos iniciales
        System.out.println("\nSonidos actuales del " + tipo + ":");
        animal.printSounds();

        // 3. Mantener el programa activo con un bucle
        String respuesta; // Para guardar la respuesta del usuario.
        do {
            System.out.println("\n¿Quieres agregar un sonido al " + tipo + "? (Sí/No)");
            respuesta = scan.nextLine();

            if (respuesta.equalsIgnoreCase("Sí")) {
                System.out.println("Ingresa el sonido:");
                String nuevoSonido = scan.nextLine();
                animal.addSound(nuevoSonido); // Agregar sonido.
                System.out.println("Sonido añadido con éxito.");
            }

            System.out.println("\nSonidos actualizados del " + tipo + ":");
            animal.printSounds(); // Mostrar los sonidos actuales.

        } while (respuesta.equalsIgnoreCase("Sí")); // Mientras el usuario diga "Sí", sigue el bucle.

        System.out.println("\nPrograma finalizado. ¡Gracias por participar!");
    }
}
