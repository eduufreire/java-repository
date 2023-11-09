package org.example.interfaces;

public class PagamentoPix implements EstrategiaPagemento{

    private String chave;

    public PagamentoPix(String chave) {
        this.chave = chave;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via PIX, chave: " + chave);
    }

}
