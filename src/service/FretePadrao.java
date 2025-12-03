package service;

import model.Pedido;

/**
 * Classe concreta com a regra de negócio para o calculo de frete padrão
 * @author Luiz guilherme
 * @version 1.0
 * @since 03-12-2025
 * @see EstrategiaDeFrete
 * */
public class FretePadrao implements EstrategiaDeFrete{

    /**
     * Método construtor que verifica se frete não é negativo
     * */
    public FretePadrao(Pedido pedido) {
        if(pedido.getValorFrete() < 0){
            throw new IllegalArgumentException("Valor do frete não pode ser negativa!");
        }
    }

    /**
     * implementação do método genérico de  estratégia de frete
     * @param pedido
     * @return {@code pedido.getValorBruto()} + {@code pedido.getValorFrete}
     * */
    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto() + pedido.getValorFrete();
    }
}
