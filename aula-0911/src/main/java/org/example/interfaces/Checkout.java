package org.example.interfaces;

public class Checkout {

    public void processarPagamento(EstrategiaPagemento pagamento, double valor){
        pagamento.pagar(valor);
    }


}
