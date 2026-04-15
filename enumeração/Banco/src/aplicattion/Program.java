package aplicattion;

import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("Murilo", 1000);

        int opc;

        do {
           mostrarMenu();
           opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Digite o valor para depósito: ");
                    conta.depositar(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Valor para saque: ");
                    double saque = sc.nextDouble();
                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Erro no saque!");
                    }
                    break;
                case 3:
                    exibirDados(conta);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opc != 4);

        sc.close();

        }
        public static  void mostrarMenu(){
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
        }

        public static void exibirDados(ContaBancaria conta){
            System.out.println("Titular: " + conta.getTitular());
            System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
    }
}

