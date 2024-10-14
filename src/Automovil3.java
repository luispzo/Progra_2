public class Automovil3 {
    //1. atributos - propiedades - estado
    private String marca;
    private String modelo;
    private String color;
    private String cilindraje;
    //la clase papá de java se llama Object, y es un clase que no se ve, pero es fundamental para la POO
    //el byte code no es programa fuente y tampoco es objeto, es lo que hay en el intermedio
    //tipo de clase STATIC es una que nunca va a cambiar el atributo, no importa si se declaran varios objetos
    static String tipo = "SUV"; // esto es un atributo de tipo statico


    //2. constructores

    /*los constructores tiene el mismo nombre de la clase y empieza con mayuscula
    puede recibir parametros. En los constructores un void esta implicito. No puede retornar cosas, pero si recibe
     */
    //este es otro formato para poder hacer lo de this
    //public Automovil3(String marca, String color, String modelo) {
      //  this(marca,color,modelo);
    //}

    public Automovil3(String marca) {
        // aqui tenemos dos constructores con el mismo nombre
        // esto se llama :polimorfismo y sobrecarga
        //si utilizamos el constructor con parametros, no es necesario el set, pero si solo es para el espacio de memoria, si
        this.marca = marca;
    }

    public Automovil3(String marca, String modelo) {
        //this.marca = marca; es una opcion, pero lo otro que estamos haciendo tambien funciona
        this(marca);
        this.modelo = modelo;
    }
    public Automovil3(String marca, String color, String modelo){
        this(marca,modelo);
        this.color = color;
    }
    public Automovil3(String marca, String color, String modelo, String cilindraje){
        this(marca,color,modelo);
        this.cilindraje=cilindraje;
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
                "El cilindraje es ->" + getCilindraje() + "\n" +
                "El tipo de auto es ->" + Automovil3.tipo + "\n" ; //cuando es STATIC no hay como poner this. porque es perteneciente de la clase

        return dv;
    }

    //5. modificación de métodos nativos
}