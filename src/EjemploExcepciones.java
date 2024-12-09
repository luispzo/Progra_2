import udla.lpozo.exceptions1.Calculadora;
import udla.lpozo.exceptions1.DivisionPorCeroException;
import udla.lpozo.exceptions1.LetrasException;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjemploExcepciones {
    public static void main(String[] args) {
            // lo de abajo no da error porque no esta adentro del catch
        //int divisor = Integer.parseInt(valor);
        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un número");
        int denominador= Integer.parseInt(valor);
       // double division = cal.dividir(10,denominador);
        try{
            //divisor=Integer.parseInt(valor);
            //int division = 10/0;
            //int division = 10/divisor;
            double division = cal.dividir(10,denominador);
            System.out.println(division);
        } catch(DivisionPorCeroException dpce){
            System.out.println("Captura el error en tiempo de ejecucion: " + dpce.getMessage());
            main(args);
        }catch(LetrasException le){
            System.out.println("Captura el segundo error de ingreso de letras" + le.getMessage());
            main(args);
        }
        //finally{
          //  System.out.println("Es opcional y se ejecuta siempre ...");
       // }

        System.out.println("Continuamos con el flujo de aplicación: ");
        //hay excepciones que son genericas y unas directa

    }
}