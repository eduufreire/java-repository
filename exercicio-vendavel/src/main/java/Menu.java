import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Menu {

    Carrinho carrinho = new Carrinho();

    Scanner leitorNum = new Scanner(System.in);
    Scanner leitorTxt = new Scanner(System.in);
    public void exibirOpcoes(){
        System.out.println("""
                §==============================§
                | SELECIONE UMA OPÇÃO          |
                §==============================§
                | 1 -Adicionar livro           |
                | 2 - Adicionar DVD            |
                | 3 - Adicionar Servico        |
                | 4 - Exibir itens do carrinho |
                | 5 - Exibir total de venda    |
                | 0 - Sair                     |
                §==============================§ """);
    }

    public int solicitarOpcao(){
        return leitorNum.nextInt();
    }

    public void adicionarLivro(){
        System.out.println(">> Iniciando cadastro do livro");

        System.out.print("Informe o código do livro:");
        int codigo = leitorNum.nextInt();

        System.out.print("Informe o Preço de Custo do livro:");
        double precoCusto = leitorNum.nextDouble();

        System.out.print("Informe o nome do livro:");
        String nome = leitorTxt.next();

        System.out.print("Informe o autor do livro:");
        String autor = leitorTxt.next();

        System.out.print("Informe o isbn do livro:");
        String isbn = leitorTxt.next();

        Livro livro = new Livro(codigo, precoCusto, nome, autor, isbn);
        carrinho.adicionaVendavel(livro);
    }

}
