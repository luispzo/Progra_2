package udla.pozo;

public class principalHer {
    public static void main(String[] args){

        Flores descripcion = new Flores();

        descripcion.setNombre("Tulipan");
        descripcion.setRegion("Costa");
        descripcion.setAlturanm("34");
        descripcion.setEdadplanta("3 años");
        descripcion.setPais("Ecuador");
        descripcion.setTamaño("3cm");
        descripcion.setColor("Verde");

        System.out.println("Datos de plantas ");
        System.out.println("Nombre y Region = " + descripcion.getNombre()+ "" +descripcion.getRegion());

        Sierra region = new Sierra();
        Costa region2 = new Costa();
        Amazonia region3 = new Amazonia();
        




    }
}
