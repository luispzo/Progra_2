public class Animales {
    private String tipo;
    private double peso;
    private int edad;
    private String enfermedades;

    public Animales() {
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEnfermedades() {
        return this.enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String detallesAnimales() {
        String var10000 = this.getTipo();
        String tipanim = "El tipo de animal es ->" + var10000 + "\nEl peso es ->" + this.getPeso() + "La edad del animalejo -> " + this.getEdad() + "\nLas enfermedades ->" + this.getEnfermedades();
        return tipanim;
    }
}