package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppExcep {
    public static void main(String[] args){


        Scanner leitor = new Scanner(System.in);

        try{
            System.out.println("Digite um número de 0 a 10: ");
            Integer numero = leitor.nextInt();

            if(numero < 0 || numero > 10){
                throw new NumeroForaIntervaloException("São aceitos números entre 0 e 10");
            }

            System.out.println("Digite outro número:");
            Integer numero2 = leitor.nextInt();

            System.out.println("Resultado da divisão: " + numero / numero2);

        }catch (InputMismatchException | NumeroForaIntervaloException e){
            System.out.println("Número inválido.");
            if(e.getMessage() != null){
                System.out.println(e.getMessage());
            }

        }catch (ArithmeticException e){
            System.out.println("Divisão por 0 inválida");

        }catch (Exception e){
            System.out.println("Ocorreu um erro durante a execução do programa");
        }

        Calculadora calc = new Calculadora();

        try{
            System.out.println(calc.dividir(10, 5));
        }catch (DivisaoPorZeroException e){
            e.printStackTrace();
        }


    }
}
