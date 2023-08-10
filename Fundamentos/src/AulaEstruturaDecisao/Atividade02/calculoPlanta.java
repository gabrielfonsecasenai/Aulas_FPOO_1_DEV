package AulaEstruturaDecisao.Atividade02;

import java.util.Scanner;

public class calculoPlanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a Largura terreno");
        double largura = scanner.nextDouble();
        System.out.println("Digite o Comprimento do terreno");
        double comprimento = scanner.nextDouble();
        double area = largura * comprimento;
        
        if (area <= 250.00) {
            double totalAPagar = area * 8.50;
            System.out.println("A area do terreno e de: " + area);
            System.out.println("O total a pagar e: " + totalAPagar);
        } else if (area <= 350.00) {
            double totalAPagar = area * 9.50;
            System.out.println("A area do terreno e de: " + area);
            System.out.println("O total a pagar e: " + totalAPagar);
        } else if (area > 350.00) {
            double totalAPagar = area * 11.50;
            System.out.println("A area do terreno e de: " + area);
            System.out.println("O total a pagar e: R$" + totalAPagar);
        }
    }
}
