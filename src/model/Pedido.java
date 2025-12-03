package model;

public class Pedido {

    protected double valorBruto;
    protected double valorFinal;
    protected double valorFrete = 0.0;

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
