public class Main {
    public static void main(String[] args) {
        Plantas rosas = new Plantas();
        Plantas orquideas = new Plantas();
        Plantas claveles = new Plantas();

        rosas.setNombre("Rosas");
        rosas.setEdadplanta("3 meses");
        rosas.setTamaño("3 cm");
        rosas.setRegión("Sierra Ecuatoriana");
        rosas.setColor("rojo sangre");
        

        claveles.setNombre("Claveles");
        claveles.setEdadplanta("4 meses");
        claveles.setTamaño("5 cm");
        claveles.setRegión("Costa Mediterranea");
        claveles.setColor("rojizo ");


        orquideas.setNombre("orquideas");
        orquideas.setEdadplanta("3 años");
        orquideas.setTamaño("20 cm");
        orquideas.setRegión("Amazonía");
        orquideas.setColor("rojizo ");

        System.out.println(rosas.infoPlantas());
        System.out.println(claveles.infoPlantas());
        System.out.println(orquideas.infoPlantas());



    }
}