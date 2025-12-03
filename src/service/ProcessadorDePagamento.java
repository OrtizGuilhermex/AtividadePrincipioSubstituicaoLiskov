package service;

import model.Pedido;

/**
 * Classe responsável por processar o pagamento e frete
 * @author Luiz guilherme
 * @version 1.0
 * @since 03-12-2025
 * */
public class ProcessadorDePagamento {

    /**
     * Método responsável por processar o pagamento
     * @param pedido
     * @param estrategiaDeFrete
     * @exception IllegalArgumentException
     * @return valorFinal
     * */
    public double processar(Pedido pedido, EstrategiaDeFrete estrategiaDeFrete) {
        double valorFinal = estrategiaDeFrete.calcularValorFinal(pedido);

        if (valorFinal < pedido.getValorBruto()) {
            throw new IllegalArgumentException("Erro de contrato: O valor final não pode ser menor que o valor bruto após a aplicação do frete.");
        }

        System.out.println("Pedido processado. Valor Bruto: " + pedido.getValorBruto() + " | Valor Final: " + valorFinal + " | usando estratégia: " + estrategiaDeFrete.getClass().getSimpleName());

        return valorFinal;
    }

}
