package service;

import model.Pedido;

/**
 * Classe concreta com a regra de negócio para o calculo de frete grátis
 * @author Luiz guilherme
 * @version 1.0
 * @since 03-12-2025
 * @see EstrategiaDeFrete
 * */
public class FreteGratis implements EstrategiaDeFrete{

    /**
     * implementação do método genérico de  estratégia de frete
     * @param pedido
     * @return pedido.getValorBruto()
     * */
    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto();
    }
}
