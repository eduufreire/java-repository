public class TesteCarrinho {
    public static void main(String[] args) {

        Menu menu = new Menu();

        int opcaoEscolhida = 0;
        do{

            menu.exibirOpcoes();
            opcaoEscolhida = menu.solicitarOpcao();

            switch (opcaoEscolhida){
                case 1:
                    menu.adicionarLivro();
                    break;

                case 2:
                    menu.adicionarDVD();
                    break;

                case 3:
                    menu.adicionarServico();
                    break;

                case 4:
                    menu.exibirItensCarrinho();
                    break;

                case 5:
                    menu.exibirTotalVendas();
                    break;

                case 0:
                    System.out.println(">> Até logo!");
                    break;

                default:
                    System.out.println(">> Opção inválida");

            }

        }while(opcaoEscolhida != 0);

    }
}
