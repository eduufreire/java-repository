package org.example.case1;

public abstract class Produto {

    private Integer id;
    private String nome;
    private Double precoBase;

    public Produto() {}

    public Produto(Integer id, String nome, Double precoBase) {
        this.id = id;
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract Double calcularImposto();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }
}
