package org.example.interfaces;

public class PagamentoCartao implements EstrategiaPagemento{

    private String numeroCartao;
    private String codigo;
    private String titular;

    public PagamentoCartao(String numeroCartao, String codigo, String titular) {
        this.numeroCartao = numeroCartao;
        this.codigo = codigo;
        this.titular = titular;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via cartão");
        System.out.println("Titular: " + this.titular);
        System.out.println("Valor: " + valor);
    }
}
