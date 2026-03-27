import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um numero:");
            vet[i] = sc.nextInt();
        }


        double soma = 0;
        int contador = 0;
        double media = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                soma += vet[i];
                contador++;
            }

        }

        if (contador == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = soma / contador;
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }


        sc.close();
    }
}