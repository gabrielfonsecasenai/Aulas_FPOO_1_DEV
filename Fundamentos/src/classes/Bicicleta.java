package classes;

public class Bicicleta {
    // Atributos (características da bicicleta)
    private int qtdeRodas;
    private boolean temMarchas;
    private int qtdeMarchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situacao;
    private int velocidade;
    
    // Construtor sem argumentos
    public Bicicleta() {
    }
    
    // Contrutor com argumentos
    public Bicicleta(int qtdeRodas, boolean temMarchas, int qtdeMarchas, String modelo, boolean freio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.temMarchas = temMarchas;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.temFreio = freio;
        this.cor = cor;
        this.situacao = "Parada";
        this.velocidade = 0;
    }
    
    // Métodos (Ações da bicicleta)
    public void andar(int velocidade) {
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }
    
    public void freiar() {
        this.situacao = "Freiando";
        this.velocidade -= 1;
    }
    
    public boolean verificarFreio() {
        return this.temFreio;
    }

    @Override
    public String toString() {
        return "Bicicleta: \n" + "Modelo = " + modelo + ", Quantidade de Rodas = " + qtdeRodas + ", Possui Marchas = " + temMarchas + ", Quantidade Marchas = " + qtdeMarchas + ", Tem Freio = " + temFreio + ", Cor = " + cor + "Situacao = " + situacao + ", Velocidade = " + velocidade;
    }
    
}
