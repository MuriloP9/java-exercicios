import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double mediaAlturaF, somaF, menorAltura, maiorAltura;

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++){
            System.out.print("Altura da "+ (i+1) + "a pessoa: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            genero[i] = sc.nextLine().charAt(0);
        }

         menorAltura = altura[0];
        for (int i = 1; i < n; i++){
            if (altura[i] < menorAltura){
                menorAltura = altura[i];
            }
        }
        System.out.printf("Menor altura = %.2f\n", menorAltura);

         maiorAltura = altura[0];
        for (int i = 1; i < n; i++){
            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
        }
        System.out.printf("Maior altura = %.2f\n", maiorAltura);

        somaF = 0;
        int contadorF = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'F') {
                somaF += altura[i];
                contadorF++;
            }
        }
        if (contadorF == 0) {
            System.out.println("Media das alturas das mulheres = 0");
        }else{
            mediaAlturaF = somaF / contadorF;
            System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaF);
        }

        int contadorM = 0;
        for (int i = 0; i < n; i++){
            if (genero[i] == 'M'){
                contadorM++;
            }
        }
        System.out.println("Numero de homens = " + contadorM);
    }
}