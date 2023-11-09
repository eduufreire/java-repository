package org.example.case1;

public class Vestuario extends Produto{

    private String tamanho;
    private String cor;
    private Boolean whiteLabel;

    public Vestuario() {}

    public Vestuario(Integer id, String nome, Double precoBase, String tamanho, String cor, Boolean whiteLabel) {
        super(id, nome, precoBase);
        this.tamanho = tamanho;
        this.cor = cor;
        this.whiteLabel = whiteLabel;
    }

    @Override
    public Double calcularImposto() {
        return getPrecoBase() * 0.10;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getWhiteLabel() {
        return whiteLabel;
    }

    public void setWhiteLabel(Boolean whiteLabel) {
        this.whiteLabel = whiteLabel;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vestuario{");
        sb.append("tamanho='").append(tamanho).append('\'');
        sb.append(", cor='").append(cor).append('\'');
        sb.append(", whiteLabel=").append(whiteLabel);
        sb.append(", calcularImposto='").append(calcularImposto()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
