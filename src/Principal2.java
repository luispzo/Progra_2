
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal2 {
    public static void main(String[] args)throws IOException /*esto es para ver errores y capturarlos*/ {
        //esto es un constructor
        //el primer constructor es de la clase object
        Automovil3  bmw = new Automovil3("BMW");
       //puedo asignar valores con el set y por medio del constructor,
        //Automovil3 bmw = new Automovil3(marca: "BMW", modelo: "i30", color: "Negro", cilindraje 3);
        //algunas veces si hacemos esto, no cumple con los principios de programacion
        //bmw.setMarca("BMW");

        //como se lee? insytanciando el objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //(verificar que se importen las librerias )
        //esta cosa solo lee strings
        //para que lea otras cosas hacemos lo siguiente:
        String var1;
        System.out.print("Modelo: ");
        var1= br.readLine();
        System.out.println(".");
        bmw.setModelo(var1);
        System.out.println("modelo: " + var1);

        int var2;
        System.out.println("Cilindraje: ");
        var2= Integer.parseInt(br.readLine());
        System.out.println(" ");
        bmw.setModelo(String.valueOf((var2)));
        System.out.println("Cilindraje " + var2);
        //para la ventanita
        //JOptionPane.showInputDialog("Marca");
        //hay que llegar a las propiedades por medio de los metodos
        String var4 = JOptionPane.showInputDialog("Marca");

        String var3;
        System.out.println("Color");
        var3 = br.readLine();
        bmw.setColor(var3);



        bmw.setModelo("i22");
        bmw.setColor("Negro");
        bmw.setCilindraje("2");

        System.out.println("bmw = " + bmw.verDetalle());
        //cada objeto aunque tenga las mismas caracteristicas, son diferentes

        //bmw.equals(bmw2) para compracacion
        Automovil3 bmw2 = new Automovil3("Mercedes","ML200");
        //bmw2.setMarca("BMW");
        //bmw2.setModelo("i22");
        bmw2.setColor("Negro");
        bmw2.setCilindraje("2");
        System.out.println("bmw = " + bmw2.verDetalle());
    }
}