package service;

import model.Pedido;

public class FretePadrao implements EstrategiaDeFrete{

    public FretePadrao(Pedido pedido) {
        if(pedido.getValorFrete() < 0){
            throw new IllegalArgumentException("Valor do frete não pode ser negativa!");
        }
    }

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto() + pedido.getValorFrete();
    }
}
