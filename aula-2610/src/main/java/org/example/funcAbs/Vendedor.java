package org.example.funcAbs;

public class Vendedor extends Funcionario{
    private Double vendas;
    private Double taxa;

    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public Double calcularSalario() {
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() +
                "vendas=" + vendas +
                ", taxa=" + taxa +
                '}';
    }

}
