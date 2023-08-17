package Enumeracao.Atividades.atividade02;

public class Livros {
    private String descricao;
    private String livros;

    public Livros(String descricao, String livros) {
        this.descricao = descricao;
        this.livros = livros;
    }

    public void setLivros(String livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return descricao + livros;
    }
    
}
