package org.example.funcAbs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {

    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFunc(Funcionario func){
        if(!Objects.isNull(func)){
            funcionarios.add(func);
        }
    }

    public void exibeTodos(){
        for(Funcionario f : funcionarios){
            System.out.println(f);
        }
    }

    public void exibeTotalSalario(){
        Double totalSalario = 0.0;
        for(Funcionario f : funcionarios){
            totalSalario += f.calcularSalario();
        }
        System.out.println(totalSalario);
    }

}
