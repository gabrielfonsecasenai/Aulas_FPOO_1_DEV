package Enumeracao.Atividades.atividade03;

public class Produtos {
    private String descricao;
    private String produto;

    public Produtos(String descricao, String produto) {
        this.descricao = descricao;
        this.produto = produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return descricao + produto;
    }
    
}
