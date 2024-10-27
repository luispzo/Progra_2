public class Plantas {
    private String nombre;
    private String edadplanta;
    private String tamaño;
    private String región;
    private String color;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdadplanta() {
        return edadplanta;
    }

    public void setEdadplanta(String edadplanta) {
        this.edadplanta = edadplanta;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getRegión() {
        return región;
    }

    public void setRegión(String región) {
        this.región = región;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String infoPlantas(){
        String dv = "\n" +
                "Que planta es?:  " + this.nombre + "\n" +
                "Cual es la edad de la planta?: " + this.edadplanta + "\n" +
                "Cual es el tamaño de la planta?: " + this.tamaño + "\n" +
                "De que región es la planta? : " + this.región + "\n" +
                "De que color es la planta?: " + this.color + "\n";
        return dv;
    }
}
