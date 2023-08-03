package Atividade5;

public class CalcularPassagem {
    private double distancia;
    private double preco;

    public CalcularPassagem(double distancia) {
        this.distancia = distancia;
        calcularPreco();
    }

    private void calcularPreco() {
        if (distancia <= 200) {
            preco = distancia * 0.50;
        } else {
            preco = distancia * 0.45;
        }
    }

    public double getPreco() {
        return preco;
    }
}