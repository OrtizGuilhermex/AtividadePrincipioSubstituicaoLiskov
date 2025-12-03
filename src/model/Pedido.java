package model;
/**
 * Entidade principal do sistema (aberta para extensão e fechada para modificação)
 * A classe pedido não contem mais herança nem a lógica de frete
 * @author Luiz guilherme
 * @version 1.0
 * @since 03-12-2025
 * */
public class Pedido {

    protected double valorBruto;
    protected double valorFinal;
    protected double valorFrete = 25.00;

    public Pedido(double valorBruto) {
        this.valorBruto = valorBruto;
        this.valorFinal = valorBruto;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }
}
