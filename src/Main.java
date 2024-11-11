import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //declaracion de arreglos
        //int[3] numeros = new int [3][2];
        int[] numeros = new int[3];

        System.out.println(numeros[0]);

        //inicializacion de arreglos
        numeros[0]=1;
        numeros[1]=2;
        //numeros[1]=Integer.valueOf("2"); //convierte un caracter 2 a un entero
        //numeros[1]=(int) 2L; //convierte un nativo directamente, el 2L es long int, convierte un long a un entero
        //numeros[2]=3;

        numeros[2]=-1;

        //revisar grabacion
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        //int k = numeros[numero.length-1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("numeros[0] = " + numeros[0]);//da igual, contenido con tipo de variable

        //vectores: son estaticos porque yo le pongo el valor
        //listas son dinamicas
        String[] productos = new String[3];
        productos[0]="Memoria";
        productos[1]="Samsung S2-3";
        productos[2]="MacBook Air";

        Arrays.sort(productos); //ordena un vector
        for(int p=0; p<3; p++) {
            System.out.println("productos[i] = " + productos[p]);
        }


    }
}