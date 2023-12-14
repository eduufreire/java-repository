package school.sptech;

public class Calculadora {

    public Integer somar(Integer valor1, Integer valor2){

        if(valor1 == null || valor2 == null){
            throw new IllegalArgumentException("Valores não podem ser nulos");
        }

        return valor1 + valor2;
    }

}
