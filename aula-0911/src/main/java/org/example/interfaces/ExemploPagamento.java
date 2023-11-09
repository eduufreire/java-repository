package org.example.interfaces;

public class ExemploPagamento {

    public static void main(String[] args) {

        PagamentoPix pix = new PagamentoPix("Dudu");
        PagamentoCartao cartao = new PagamentoCartao("1111111", "533", "Dudu Neymar");

        Checkout check = new Checkout();
        check.processarPagamento(pix, 65);
        check.processarPagamento(cartao, 150);




    }


}
