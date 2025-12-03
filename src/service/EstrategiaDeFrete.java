package service;

import model.Pedido;
/**
 * Interface com a estratégia de comportamento para o calculo do frete
 * @author Luiz guilherme
 * @version 1.0
 * @since 03-12-2025
 * */
public interface EstrategiaDeFrete {

    /**
     * Método genérico que calcula e retorna o valor do frete com base na regra de frete
     * @param pedido recebe a entidade e utiliza getter para buscar o valor
     * @return O valor final do frete calculado
     * */
    double calcularValorFinal(Pedido pedido);
}
