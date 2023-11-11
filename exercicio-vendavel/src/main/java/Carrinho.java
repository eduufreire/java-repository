import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carrinho {

    private List<Vendavel> vendaveis;

    public Carrinho() {
        this.vendaveis = new ArrayList<>();
    }

    public void adicionaVendavel(Vendavel vend){
        if(!Objects.isNull(vend)){
            vendaveis.add(vend);
        }else{
            System.out.println("Objeto inválido.");
        }
    }

    public double calculaTotalVenda(){
        double totalVenda = 0.0;
        for(Vendavel vendAtual : vendaveis){
            totalVenda += vendAtual.getValorVenda();
        }
        return totalVenda;
    }

    public void exibeItensCarrinho(){
        for(Vendavel vendAtual : vendaveis){
            System.out.println(vendAtual);
        }
    }


}
