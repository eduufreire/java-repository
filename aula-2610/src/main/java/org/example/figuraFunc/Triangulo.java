package org.example.figuraFunc;

public class Triangulo extends Figura{

    private Double base;
    private Double altura;

    public Triangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                super.toString() +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
