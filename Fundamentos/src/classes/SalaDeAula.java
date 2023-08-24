package classes;

public class SalaDeAula {
    public static void main(String[] args) {
        Aluno heimmer = new Aluno("Heimmer", "heimer@gmail.com", 4863);
        System.out.println(heimmer);
        
        heimmer.entregarAtividade();
        heimmer.entregarAtividade();
        heimmer.faltas(0);
        System.out.println(heimmer);
    }
}
