public class Main {
    public static void main(String[] args) {

        Heroi heroi1 = new Heroi("Spider", "Spider-Man");
        heroi1.adicionarPoder("Soltar teia", 4);
        heroi1.adicionarPoder("Andar em paredes", 2);
        heroi1.adicionarPoder("Sentido aranha", 6);

        Heroi heroi2 = new Heroi("Morcego", "Batman");
        heroi2.adicionarPoder("Intelecto de gênio", 10);
        heroi2.adicionarPoder("Dinheiro", 9);


        Vilao vilao1 = new Vilao("Gazozo", "Duende Verde");
        vilao1.adicionarPoder("Força", 6);
        vilao1.adicionarPoder("Explosivos", 3);

        Vilao vilao2 = new Vilao("Coringa", "Coringa");
        vilao2.adicionarPoder("Gás do riso", 8);


        Confronto luta = new Confronto();
        luta.lutar(heroi1, vilao1);
        luta.lutar(heroi2, vilao2);

    }

}
