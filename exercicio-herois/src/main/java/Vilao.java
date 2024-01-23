public class Vilao extends Personagem{

    public Vilao(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        Double soma = 0.0;
        for(SuperPoder poderAtual : super.getPoderes()){
            soma += poderAtual.getCategoria();
        }
        return soma;
    }
}
