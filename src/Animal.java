import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String nombre; // El nombre del animal (por ejemplo, "Perro" o "Gato").
    private List<String> sonidos; // Una lista donde guardaremos los sonidos del animal.

    // **Constructor**: Cuando creamos un animal, necesitamos darle un nombre.
    public Animal(String nombre) {
        this.nombre = nombre; // Guardamos el nombre.
        this.sonidos = new ArrayList<>(); // Creamos una lista vacía de sonidos.
    }

    //Método para agregar sonidos**: Permite añadir un sonido a la lista.
    public void addSound(String sonido) {
        sonidos.add(sonido); // Agrega el sonido a la lista.
    }

    // **Método para imprimir sonidos**: Muestra todos los sonidos que hace el animal.
    public void printSounds() {
        System.out.println("Sonidos de " + nombre + ":"); // Encabezado.
        for (String sonido : sonidos) { // Recorremos la lista de sonidos.
            System.out.println("- " + sonido); // Imprimimos cada sonido.
        }
    }
}

