package udla.lpozo.exceptions1;
                                    // tambien podemos poner runtime exception
public class DivisionPorCeroException extends Exception {
    public DivisionPorCeroException(String mensaje){
        super(mensaje);
    }
}
