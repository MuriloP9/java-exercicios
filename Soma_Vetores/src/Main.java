import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor?");

        int n = sc.nextInt();

        int[] vet_a = new int[n];
        int[] vet_b = new int[n];
        int[] vet_c = new int[n];

        System.out.println("Digite os valores do vetor A:");

        for (int i = 0; i < vet_a.length; i++){
           vet_a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vet_b.length; i++){
            vet_b[i] = sc.nextInt();
        }


        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vet_c.length; i++){
            vet_c[i] = vet_a[i] + vet_b[i];
            System.out.println(vet_c[i]);
        }
    }
}