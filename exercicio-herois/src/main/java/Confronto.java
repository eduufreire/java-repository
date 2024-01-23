public class Confronto {

    public void lutar(Heroi heroi, Vilao vilao){

        Double poderHeroi = heroi.getForcaTotal();
        Double poderVilao = vilao.getForcaTotal();

        if(poderHeroi > poderVilao){
            System.out.println(
                    String.format("O Herói %s foi o vencedor da batalha!!", heroi.getNome())
            );

        }else if(poderHeroi == poderVilao){
            System.out.println(
                    String.format("O  %s e o %s empataram!!", heroi.getNome(), vilao.getNome())
            );

        }else{
            System.out.println(
                    String.format("O  Vilão %s foi o vencedor da batalha!!", vilao.getNome())
            );
        }

    }

}
