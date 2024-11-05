import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListaArreglos {
    public static void main(String[] args){
        //Creacion de un Arraylist
        List<String> listaColores = new ArrayList<>();

        //Creacion medante la clase Arrays
        String[] nombres = {"Arturo","Daniel","Pamela"}; //creo un arreglo y luego le paso a una lista
        List<String> listaNombres = Array.asList(nombres);

        //Adicion de elementos individuales
        listaColores.add("Verde");
        listaColores.add("Amarillo");

        //Construir lista a partir de otra lista
        List<String> listaElementos = new ArrayList<>(listaColores);
    }
}
