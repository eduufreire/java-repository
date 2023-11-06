package org.example.funcAbs;

public class Horista extends Funcionario{

    private Integer qtdeHora;
    private Double valorHora;

    public Horista(String cpf, String nome, Integer qtdeHora, Double valorHora) {
        super(cpf, nome);
        this.qtdeHora = qtdeHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularSalario() {
        return qtdeHora * valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" +
                super.toString() +
                "qtdeHora=" + qtdeHora +
                ", valorHora=" + valorHora +
                '}';
    }
}
