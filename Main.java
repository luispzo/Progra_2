public static void main(String[] args) {
    // en vez de jugadores de futbol, estamos haciendo jugadores de basquet
    Jugador jugador1 = new Jugador("Sara Chiriboga","base (armador)",26,"Leos",19,"Ecuador");
    Jugador jugador2 = new Jugador("Marti Damian","escolta (tirador)",6,"Escorpios",18,"Ecuador");
    Jugador jugador3 = new Jugador("Dome Teran","alero (delantero)",28,"Leos",30,"Mexico");
    Jugador jugador4 = new Jugador("Tony Llanos","Ala-pívot",18,"Escorpios",19,"Ecuador");
    Jugador jugador5 = new Jugador("Luis Pozo","Pívot",31,"Leos",23,"Ecuador");
    Jugador jugador6 = new Jugador("Johann Vasquez","Ala-Pívot",21,"Leos",20,"Ecuador");

    System.out.println(" Alineación jugador1=" + jugador1.verAlineamiento());
    System.out.println(" Alineación jugador2=" + jugador2.verAlineamiento());
    System.out.println(" Alineación jugador3=" + jugador3.verAlineamiento());
    System.out.println(" Alineación jugador4=" + jugador4.verAlineamiento());
    System.out.println(" Alineación jugador5=" + jugador5.verAlineamiento());
    System.out.println(" Alineación jugador6=" + jugador6.verAlineamiento());


}
