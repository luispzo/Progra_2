public class Jugador {
    private String nombre;
    private String posicion;
    private int numerojug;
    private String equipo;
    private int edad;
    private String pais;

    //aqui ponemos el constructor para los atributos
    public Jugador(String nombre, String posicion, int numerojug, String equipo, int edad, String pais) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numerojug = numerojug;
        this.equipo = equipo;
        this.edad = edad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumerojug() {
        return numerojug;
    }

    public void setNumerojug(int numerojug) {
        this.numerojug = numerojug;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String verAlineamiento(){
        String dv ="El nombre es: " + this.nombre + "\n" +
                "La posición del jugador es: " + this.posicion + "\n" +
                "El numero del jugador es: " + this.numerojug + "\n" +
                "El equipo del jugador es: " + this.equipo + "\n" +
                "La edad del jugador es: " + this.edad + "\n" +
                "El país del jugador es: " + this.pais + "\n";
        return dv;
    }
}
