package org.example.figuraFunc;

public class MainTeste {
    public static void main(String[] args) {

        Figura fig1 = new Quadrado("Vermelho", 5, 2.5);
        Figura fig2 = new Triangulo("Roxo", 4, 1.5, 2.0);
        Figura fig3 = new Retangulo("Branco", 6, 2.5, 3.0);
        Figura fig4 = new Circulo("Preto", 2, 7.5);

        Imagem img = new Imagem();
        img.adicionarFigura(fig1);
        img.adicionarFigura(fig2);
        img.adicionarFigura(fig3);
        img.adicionarFigura(fig4);

        img.exibeFiguras();
        System.out.println("-".repeat(10));
        img.exibeSomaArea();
        System.out.println("-".repeat(10));
        img.exibeFiguraAreaMaior20();
        System.out.println("-".repeat(10));
        img.exibeQuadrado();

    }
}
