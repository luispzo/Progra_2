public class Automovil3 {
    //1. atributos - propiedades - estado
    private String marca;
    private String modelo;
    private String color;
    private String cilindraje;
    //la clase papá de java se llama Object, y es un clase que no se ve, pero es fundamental para la POO
    //el byte code no es programa fuente y tampoco es objeto, es lo que hay en el intermedio


    //2. constructores

    /*los constructores tiene el mismo nombre de la clase y empieza con mayuscula
    puede recibir parametros. En los constructores un void esta implicito. No puede retornar cosas, pero si recibe
     */
    public Automovil3() {

    }

    public Automovil3(String marca) {
        // aqui tenemos dos constructores con el mismo nombre
        // esto se llama :polimorfismo y sobrecarga
        //si utilizamos el constructor con parametros, no es necesario el set, pero si solo es para el espacio de memoria, si
        this.marca = marca;
    }

    public Automovil3(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //3. metodos Set y Get

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    //4. metodos propios y de cálculo
    public String verDetalle(){
        String dv = "La marca es -> " + this.marca + "\n" +
                "El modelo es ->" + getModelo() + "\n" +
                "el color es ->" + this.color + "\n" +
                "El cilindraje es ->" + getCilindraje();

        return dv;
    }

    //5. modificación de métodos nativos
}