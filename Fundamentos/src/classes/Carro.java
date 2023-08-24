package classes;

public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private boolean temRodas;
    private String situacao;
    private int velocidade;

    public Carro(String modelo, String marca, String cor, int ano, boolean temRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.temRodas = temRodas;
        this.situacao = "Parado";
        this.velocidade = 0;
    }

    public void andar(int velocidade) {
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }
    
    public void freiar() {
        this.situacao = "Freiando";
        this.velocidade -= 1;
    }

    @Override
    public String toString() {
        return "Carro: \n" + "Modelo = " + modelo + ", Marca = " + marca + ", Cor = " + cor + ", Ano = " + ano + ", Tem Rodas = " + temRodas + ", Situacao = " + situacao + ", Velocidade = " + velocidade;
    }
    
    
    
}
