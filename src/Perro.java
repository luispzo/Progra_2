public class Perro extends Animal { // Hereda de Animal
    public Perro(String nombre) {
        super(nombre); // Llama al constructor de Animal para guardar el nombre.
        addSound("Guau"); // Agrega un sonido específico de perro.
        addSound("Ladrido"); // Agrega otro sonido.
    }
}
