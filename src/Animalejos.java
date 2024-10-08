public class Animalejos {
    public Animalejos() {
    }

    public static void main(String[] args) {
        Animales perro = new Animales();
        perro.setTipo("Perro");
        perro.setPeso(5.0);
        perro.setEdad(3);
        perro.setEnfermedades("Ninguna");
        System.out.println(perro.detallesAnimales());
        Animales gato = new Animales();
        gato.setTipo("Gato");
        gato.setPeso(6.0);
        gato.setEdad(5);
        gato.setEnfermedades("Patita rota");
        System.out.println(gato.detallesAnimales());
        Animales serpiente = new Animales();
        serpiente.setTipo("Serpiente");
        serpiente.setPeso(14.0);
        serpiente.setEdad(9);
        serpiente.setEnfermedades("Ninguna :)");
        System.out.println(serpiente.detallesAnimales());
    }
}