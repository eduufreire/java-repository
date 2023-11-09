package org.example.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Teste teste1 = new Teste();
        Teste teste2 = new Teste();
        System.out.println(Teste.NOME);
        System.out.println(Teste.somar(1, 1));
        final int idade = 10; */

        ExemploInterface interfaceExe1 = new ExemploInterface();
        ExemploInterface interfaceExe2 = new ExemploInterface();
        interfaceExe1.exibir();
        interfaceExe2.exibir();

        List<TesteInterface> objetos = new ArrayList<>();
        objetos.add(interfaceExe1);
        objetos.add(interfaceExe2);

    }
}