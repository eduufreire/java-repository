package Exception;

public class Calculadora {
    public Integer dividir(int n1, int n2) throws DivisaoPorZeroException{
        try{
            return n1 / n2;
        }catch(ArithmeticException e){
            throw new DivisaoPorZeroException(e);
        }
    }
}
