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

    public void adicionarDVD(){
        System.out.println(">> Iniciando cadastro do DVD");

        System.out.print("Informe o código do DVD:");
        int codigo = leitorNum.nextInt();

        System.out.print("Informe o Preço de Custo do DVD:");
        double precoCusto = leitorNum.nextDouble();

        System.out.print("Informe o nome do DVD:");
        String nome = leitorTxt.next();

        System.out.print("Informe a gravadora do DVD:");
        String autor = leitorTxt.next();

        DVD dvd = new DVD(codigo, precoCusto, nome, autor);
        carrinho.adicionaVendavel(dvd);
    }

    public void adicionarServico(){
        System.out.println(">> Iniciando cadastro do Serviço");

        System.out.print("Informe o código do serviço:");
        int codigo = leitorNum.nextInt();

        System.out.print("Informe a descrição do serviço:");
        String descricao = leitorTxt.next();

        System.out.print("Informe a Quantidade de Horas do Serviço:");
        int qtdeHoras = leitorNum.nextInt();

        System.out.print("Informe o Valor/Hora do serviço:");
        double valorHora = leitorNum.nextDouble();

        Servico servico = new Servico(descricao, codigo, qtdeHoras, valorHora);
        carrinho.adicionaVendavel(servico);
    }

    public void exibirItensCarrinho(){
        carrinho.exibeItensCarrinho();
    }

    public void exibirTotalVendas(){
        System.out.println(
                String.format("Total das vendas: %.2f", carrinho.calculaTotalVenda())
        );
    }

}
