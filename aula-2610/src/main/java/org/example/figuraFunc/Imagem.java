package org.example.figuraFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Imagem {
    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    public void adicionarFigura(Figura fig){
        if(!Objects.isNull(fig)){
            figuras.add(fig);
        }
    }

    public void exibeFiguras(){
        for(Figura figAtual : figuras){
            System.out.println(figAtual);
        }
    }

    public void exibeSomaArea(){
        Double somaArea = 0.0;
        for(Figura figAtual : figuras){
            somaArea += figAtual.calcularArea();
        }
        System.out.println(somaArea);
    }

    public void exibeFiguraAreaMaior20(){
        for(Figura figAtual : figuras){
            if(figAtual.calcularArea() > 20){
                System.out.println(figAtual);
            }
        }
    }

    public void exibeQuadrado(){
        for(Figura figAtual : figuras){
            if(figAtual instanceof Quadrado){
                System.out.println(figAtual);
            }
        }
    }

}
