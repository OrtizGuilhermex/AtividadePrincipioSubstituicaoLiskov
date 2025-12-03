package service;

import model.Pedido;

public class ProcessadorDePagamento {
    public double processar(Pedido pedido, EstrategiaDeFrete estrategiaDeFrete) {

        double valorFinal = estrategiaDeFrete.calcularValorFinal(pedido);

        if (valorFinal < pedido.getValorBruto()) {
            throw new IllegalStateException("Erro de contrato: O valor final não pode ser menor que o valor bruto após a aplicação do frete.");
        }

        System.out.println("Pedido processado. Valor Bruto: " + pedido.getValorBruto() + " | Valor Final: " + valorFinal + " | usando estratégia: " + estrategiaDeFrete.getClass().getSimpleName());

        return valorFinal;
    }

}
