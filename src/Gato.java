public class Gato extends Animal { // Hereda de Animal
    public Gato(String nombre) {
        super(nombre); // Llama al constructor de Animal para guardar el nombre.
        addSound("Miau"); // Agrega un sonido específico de gato.
        addSound("Ronroneo"); // Agrega otro sonido.
    }
}
