package org.example.funcAbs;

import java.lang.reflect.Field;

public class MainTeste {

    public static void main(String[] args) {


        Funcionario fun1 = new Vendedor("123", "Edu", 15.500, 1.5);
        Funcionario fun2 = new Vendedor("321", "Breno", 20.800, 0.8);

        Funcionario fun3 = new Horista("456", "Bifon", 18, 15.5);
        Funcionario fun4 = new Horista("654", "Dudu Neymar", 25, 26.8);

        Empresa e = new Empresa();
        e.adicionarFunc(fun1);
        e.adicionarFunc(fun2);
        e.adicionarFunc(fun3);
        e.adicionarFunc(fun4);

        e.exibeTodos();

        e.exibeTotalSalario();


    }
}
