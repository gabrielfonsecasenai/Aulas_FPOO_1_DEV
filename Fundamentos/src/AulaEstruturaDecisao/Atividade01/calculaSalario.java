package AulaEstruturaDecisao.Atividade01;

import java.util.Scanner;

public class calculaSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o cargo do funcionario (Gerente, Supervisor, Tecnico ou Auxiliar):");
        String cargo = scanner.nextLine();
         switch (cargo) {
            case "Gerente":
                double salarioGerente = 5590.00;
                double inssGerente = 0.08;
                double descontoInssGerente = salarioGerente * inssGerente;
                double convenioGerente = 289.00;
                double descontosTotalGerente = convenioGerente + descontoInssGerente; 
                double salarioTotalGerente = salarioGerente - descontosTotalGerente;
                System.out.println("O salario com os descontos do(a) " + cargo + " e igual a: " + salarioTotalGerente);
                break;
            case "Supervisor":
                double salarioSupervisor = 4128.00;
                double inssSupervisor = 0.07;
                double descontoInssSupervisor = salarioSupervisor * inssSupervisor;
                double convenioSupervisor = 239.00;
                double descontosTotalSupervisor = convenioSupervisor + descontoInssSupervisor;
                double salarioTotalSupervisor = salarioSupervisor - descontosTotalSupervisor;
                System.out.println("O salario com os descontos do(a) " + cargo + " e igual a: " + salarioTotalSupervisor);
                break;
            case "Tecnico":
                double salarioTecnico = 3789.00;
                double inssTecnico = 0.04;
                double descontoInssTecnico = salarioTecnico * inssTecnico;
                double convenioTecnico = 189.00;
                double descontosTotalTecnico = convenioTecnico + descontoInssTecnico;
                double salarioTotalTecnico = salarioTecnico - descontosTotalTecnico;
                System.out.println("O salario com os descontos do(a) " + cargo + " e igual a: " + salarioTotalTecnico);
                break;
            case "Auxiliar":
                double salarioAuxiliar = 2345.00;
                double inssAuxiliar = 0.02;
                double descontoInssAuxiliar = salarioAuxiliar * inssAuxiliar;
                double convenioAuxiliar = 156.00;
                double descontosTotalAuxiliar = convenioAuxiliar + descontoInssAuxiliar;
                double salarioTotalAuxiliar = salarioAuxiliar - descontosTotalAuxiliar;
                System.out.println("O salario com os descontos do(a) " + cargo + " e igual a: " + salarioTotalAuxiliar);
                break;
            default:
                throw new AssertionError();
        }
        
        
        }
    }
