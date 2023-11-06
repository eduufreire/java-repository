package org.example.figuraFunc;

public abstract class Figura {

    private String cor;
    private Integer espessura;

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public abstract Double calcularArea();

    @Override
    public String toString() {
        return "cor='" + cor + '\'' +
                ", espessura=" + espessura + ", ";
    }
}
