package Enumeracao.Atividades.atividade01;

public class Meses {
    private String descricao;
    private String mes;

    public Meses(String descricao, String mes) {
        this.descricao = descricao;
        this.mes = mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return descricao + mes ;
    }
    
    
}
