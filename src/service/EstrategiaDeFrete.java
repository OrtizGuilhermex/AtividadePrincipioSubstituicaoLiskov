package service;

import model.Pedido;

public interface EstrategiaDeFrete {

    double calcularValorFinal(Pedido pedido);
}
