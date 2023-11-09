package org.example.case1;

public class Eletronico extends Produto{

    private Integer tensao;
    private String fabricante;

    public Eletronico() {}


    public Eletronico(Integer id, String nome, Double precoBase, Integer tensao, String fabricante) {
        super(id, nome, precoBase);
        this.tensao = tensao;
        this.fabricante = fabricante;
    }

    @Override
    public Double calcularImposto() {
        return getPrecoBase() * 0.15;
    }

    public Integer getTensao() {
        return tensao;
    }

    public void setTensao(Integer tensao) {
        this.tensao = tensao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Eletronico{");
        sb.append("tensao=").append(tensao);
        sb.append(", fabricante='").append(fabricante).append('\'');
        sb.append(", calcularImposto='").append(calcularImposto()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
