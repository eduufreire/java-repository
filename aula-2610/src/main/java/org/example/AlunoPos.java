package org.example;

public class AlunoPos extends Aluno{
    private Double monografia;


    public AlunoPos(String ra, String nome, Double monografia) {
        super(ra, nome);
        this.monografia = monografia;
    }

    @Override
    public Double calcularMedia() {
        return this.monografia;
    }



}
