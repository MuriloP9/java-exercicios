import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar?");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];


        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            sc.nextLine();
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

        }

        double maiorIdade = idade[0];
        int indiceMaisVelho = 0;

        for (int i = 1; i < n; i++){
            if (idade[i] > maiorIdade){
                maiorIdade = idade[i];
                indiceMaisVelho = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nome[indiceMaisVelho]);

        sc.close();

    }
}