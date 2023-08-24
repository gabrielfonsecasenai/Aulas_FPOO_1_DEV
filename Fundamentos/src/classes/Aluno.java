package classes;

public class Aluno {
    private String nome;
    private String email;
    private int ra;
    private int atividadesEntregues;
    private int faltas;

    public Aluno(String nome, String email, int ra) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.atividadesEntregues = 0;
        this.faltas = 0;
    }

    public void entregarAtividade(){
        this.atividadesEntregues += 1;
    }
    
    public void faltas(int faltas){
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Aluno: \n" + "Nome = " + nome + ", Email = " + email + ", Ra = " + ra + ", Atividades Entregues = " + atividadesEntregues + ", Faltas = " + faltas;
    }
    
}
