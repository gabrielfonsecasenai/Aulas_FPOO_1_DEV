package AulaEstruturaDecisao;

public class ifelse2 {
    public static void main(String[] args) {
        int temperatura = 15;
        
        if (temperatura == 15) {
            System.out.println("Esta ficando frio");
        }    else if (temperatura == 20) {
            System.out.println("Esta ficando agradavel");
        }    else if (temperatura == 30) {
            System.out.println("Esta ficando calor");
        }
        switch (temperatura) {
            case 15:
                System.out.println("Está ficando frio");
                break;
            case 20:
                System.out.println("Está ficando agradavel");
                break;
            default:
                System.out.println("Nao identifiquei a temperatura");
                break;
        }
    }
}