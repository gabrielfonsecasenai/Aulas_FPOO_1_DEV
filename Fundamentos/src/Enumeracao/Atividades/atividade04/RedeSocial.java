package Enumeracao.Atividades.atividade04;

public class RedeSocial {
    private String descricao;
    private String redeSocial;

    public RedeSocial(String descricao, String redeSocial) {
        this.descricao = descricao;
        this.redeSocial = redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    @Override
    public String toString() {
        return descricao + redeSocial;
    }
    
}
