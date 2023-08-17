package Enumeracao.Atividades.atividade02;

public enum LivrosEnum {
    ACAO("Acao"),
    AVENTURA("Aventura"),
    COMEDIA("Comedia"),
    ROMANCE("Romance"),
    FICCAO("Ficcao");
    
    private String categoria;

    private LivrosEnum(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
    
}
