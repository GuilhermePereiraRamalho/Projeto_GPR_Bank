//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Bem-Vindo ao GPR Bank!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Dados iniciais do Cliente");
        System.out.println();
        System.out.println("Nome: Guilherme Pereira Ramalho");
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo inicial: R$ 2.500,00");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        int controle = 0;
        double saldoCliente = 2500.0;

        while(controle != 4) {
            double novaTransferencia = 0.0;
            System.out.println("OPERAÇÕES");
            System.out.println();
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada: ");
            controle = leitura.nextInt();
            switch (controle) {
                case 1:
                    System.out.println("Seu saldo atual: R$ " + saldoCliente);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    novaTransferencia = leitura.nextDouble();
                    saldoCliente += novaTransferencia;
                    System.out.println("Saldo atualizado: R$ " + saldoCliente);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    novaTransferencia = leitura.nextDouble();
                    if (novaTransferencia > saldoCliente) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência!");
                    } else {
                        saldoCliente -= novaTransferencia;
                        System.out.println("Saldo atualizado: R$" + saldoCliente);
                    }
                    break;
                case 4:
                    System.out.println("Muito obrigado por utilizar o GPR Bank");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }

    }
}
