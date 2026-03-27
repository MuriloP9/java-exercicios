package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        int[] num = new int[n];

         for (int i=0; i<num.length; i++){
             System.out.println("Digite um número: ");
             num[i] = sc.nextInt();
         }

        System.out.println("NÚMEROS NEGATIVOS: ");

         for (int i=0; i< num.length; i++){
            if (num[i] < 0){
                System.out.println(num[i]);
            }
         }

        sc.close();

    }
}
