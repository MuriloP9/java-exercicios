import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos números voce vai digitar?");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++){
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vet.length; i++){
            if (vet[i] % 2 == 0 ){
                System.out.print(vet[i]+ " ");
            }
        }

        int cont = 0;
        for (int i = 0; i < vet.length; i++){
            if (vet[i] % 2 == 0){
                cont++;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES = " + cont);




    }
}
