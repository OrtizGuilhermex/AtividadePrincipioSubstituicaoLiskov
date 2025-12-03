package service;

import model.Pedido;

public interface EstrategiaDeFrete {

    void calcularValorFinal(Pedido pedido);
}
