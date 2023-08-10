package AulaEstruturaDecisao.Atividade04;

import java.util.Scanner;

public class calculoEconomia {
    public static void main(String[] args) {
        System.out.println("Produto 1: Notebook Lenovo Valor: R$3299.00 \n"
                + "Produto 2: Celular MotoG22 R$1789.00 \n"
                + "Produto 3: Carro Hb20 R$68000.00 \n"
                + "Produto 4: Apartamento R$180000.00");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opcao:");
        int escolha = scanner.nextInt();
        
        if (escolha == 1) {
            double valorEconomizar = 3299.00 / (3299.00 * 0.05);
            System.out.println("O total de meses a se economizar e de: " + valorEconomizar);
        } else if (escolha == 2) {
            double valorEconomizar = 1789.00 / (1789.00 * 0.10);
            System.out.println("O total de meses a se economizar e de: " + valorEconomizar);
        } else if (escolha == 3) {
            double valorEconomizar = 68000.00 / (68000.00 * 0.02);
            System.out.println("O total de meses a se economizar e de: " + valorEconomizar);
        } else if (escolha == 4) {
            double valorEconomizar = 180000.00 / (180000.00 * 0.02);
            System.out.println("O total de meses a se economizar e de: " + valorEconomizar);
        }
    }
}
