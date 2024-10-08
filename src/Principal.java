//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Automovil2  bmw = new Automovil2("BMW");

        //bmw.setMarca("BMW");
        bmw.setModelo("i22");
        bmw.setColor("Negro");
        bmw.setCilindraje("2");

        System.out.println("bmw = " + bmw.verDetalle());
        //cada objeto aunque tenga las mismas caracteristicas, son diferentes

        //bmw.equals(bmw2) para compracacion
        Automovil2 bmw2 = new Automovil2("Mercedes","ML200");
        //bmw2.setMarca("BMW");
        //bmw2.setModelo("i22");
        bmw2.setColor("Negro");
        bmw2.setCilindraje("2");
        System.out.println("bmw = " + bmw2.verDetalle());
        }
    }