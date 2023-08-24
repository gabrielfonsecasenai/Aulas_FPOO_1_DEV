package classes;

public class Carro {
    private String modelo;
    private String marca;
    private CorEnum cor;
    private int ano;
    private boolean temRodas;
    private String situacao;
    private int velocidade;
    private int marcha;
    private boolean estaEmRe;

    public Carro(String modelo, String marca, CorEnum cor, int ano, boolean temRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.temRodas = temRodas;
        this.situacao = "Parado";
        this.velocidade = 0;
    }
    
    public void trocarMarcha(MarchaEnum novaMarcha) {
        int diferenca = novaMarcha.getNumeroMarcha() - this.marcha;
        
        if (diferenca == 1) {
            this.marcha = novaMarcha.getNumeroMarcha();
        } else {
            System.out.println("Voce nao pode pular a marcha");
        }
    }
    
    public void engatarRe(boolean  re) {
        this.estaEmRe = re;
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
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", temRodas=" + temRodas + ", situacao=" + situacao + ", velocidade=" + velocidade + ", marcha=" + marcha + '}';
    }

    
    
    
    
}
