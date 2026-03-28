import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();

        double[] vet = new double[n];


        for (int i = 0; i < vet.length; i++){
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < vet.length; i++){
            soma += vet[i];
        }

        double media = soma / n;

        System.out.printf("MEDIA DO VETOR: %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");


    for (int i = 0; i < vet.length; i++){
        if (vet[i] < media){
            System.out.printf("%.1f\n", vet[i]);
        }
    }

        sc.close();
    }
}