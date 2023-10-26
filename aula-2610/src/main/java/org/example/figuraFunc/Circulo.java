package org.example.figuraFunc;

public class Circulo extends Figura{

    private Double raio;

    public Circulo(String cor, Integer espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                super.toString() +
                "raio=" + raio +
                '}';
    }
}
