package udla.lpozo.exceptions1;

public class Calculadora {
    public double dividir(int dividendo, int divisor) throws DivisionPorCeroException{
        if(divisor==0){
            throw new DivisionPorCeroException("No es posible dividir por cero!!!");

        }
        return dividendo/(double)divisor;
    }
    public double dividir(String dividendo, String divisor)throws LetrasException{
        try{
            int divid = Integer.parseInt(dividendo);
            int divos = Integer.parseInt(divisor);
        }catch(LetrasException le){
            throw new LetrasException("Debe ingresar un número en el numerador y denominador");
        }
        return this.dividir(divid,divos);
    }
}
