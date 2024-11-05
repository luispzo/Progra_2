import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListaArreglos {
    public static void main(String[] args){
        //Creacion de un Arraylist
        List<String> listaColores = new ArrayList<>();

        //Creacion medante la clase Arrays
        //aqui es metiendo un vector a una lista
        String[] nombres = {"Arturo","Daniel","Pamela"}; //creo un arreglo y luego le paso a una lista
        List<String> listaNombres = Array.asList(nombres);

        //Adicion de elementos individuales
        //metodo add añade manualmente
        //hay un metodo llamado addall
        //hay un metodo llamado remove
        listaColores.add("Verde");
        listaColores.add("Amarillo");

        //Construir lista a partir de otra lista
        List<String> listaElementos = new ArrayList<>(listaColores);

        //adicion de elementos a otra coleccón
        listaElementos.addAll(listaNombres);

        //despluegue de elementos de la lista
        System.out.println("Lista Nombre");
        listaNombres.forEach();
    }
}
