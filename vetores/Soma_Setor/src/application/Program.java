package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma, media;

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double[n];
        for (int i = 0; i < vet.length; i++){
            System.out.println("Digite um numero:");
            vet[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < vet.length; i++){
            soma = soma + vet[i];
        }

        media = soma / vet.length;

        System.out.print("VALORES = ");

        for (int i = 0; i < vet.length; i++){
            System.out.printf("%.1f  ", vet[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();


    }
}
