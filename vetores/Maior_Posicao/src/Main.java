import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        //o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        //considerando a primeira posição como 0 (zero).

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i++){
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        int posicaoMaior = 0;
        double maior = vet[0];
        for (int i = 1; i < vet.length; i++){
            if (vet[i] > maior){
                maior = vet[i];
                posicaoMaior = i;
            }
        }
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);
    }
}