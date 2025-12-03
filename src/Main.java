import model.Pedido;
import service.EstrategiaDeFrete;
import service.FreteGratis;
import service.FretePadrao;
import service.ProcessadorDePagamento;


/**
 * Classe principal que inicia o sistema
 * @author Luiz guilherme
 * @version 1.0
 * @since 03-12-2025
 * */
public class Main {
    public static void main(String[] args) {

        ProcessadorDePagamento processadorDePagamento = new ProcessadorDePagamento();
        Pedido pedidoBase = new Pedido(100.0);

        EstrategiaDeFrete fretePadrao = new FretePadrao(pedidoBase);
        processadorDePagamento.processar(pedidoBase, fretePadrao);

        EstrategiaDeFrete freteGratis = new FreteGratis();
        processadorDePagamento.processar(pedidoBase,freteGratis);


    }
}