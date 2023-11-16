package enumeradores;

import java.util.Scanner;

public class AppEnum {
    public static void main(String[] args) {

        DiaSemanaEnum[] valoresEnum = DiaSemanaEnum.values();
        for(DiaSemanaEnum enumerador : valoresEnum){
            System.out.println(enumerador);
        }

        Scanner in = new Scanner(System.in);
        String dia = in.nextLine();
        DiaSemanaEnum encontrado =  DiaSemanaEnum.valueOf(dia);
        System.out.println(encontrado);
    }
}
