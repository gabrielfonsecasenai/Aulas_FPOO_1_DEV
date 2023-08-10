package AulaEstruturaDecisao.Atividade03;

import java.util.Scanner;

public class almoco {
    public static void main(String[] args) {
        System.out.println("Opcao 1: Arroz, Feijao, Bife acebolado \n"
                + "Opcao 2: Arroz, feijao, file de frango \n"
                + "Opcao 3: Arroz, feijao, brajola");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opcao:");
        int escolha = scanner.nextInt();
        System.out.println("Escolha a quantidade:");
        int qntde = scanner.nextInt();
        
        if (escolha == 1) {
            double totalAPagar = qntde * 19.99;
            System.out.println("O total a pagar sera: R$" + totalAPagar);
        } else if (escolha == 2) {
            double totalAPagar = qntde * 18.99;
            System.out.println("O total a pagar sera: R$" + totalAPagar);
        } else if (escolha == 3) {
            double totalAPagar = qntde * 23.99;
            System.out.println("O total a pagar sera: R$" + totalAPagar);
        }
    }
}
