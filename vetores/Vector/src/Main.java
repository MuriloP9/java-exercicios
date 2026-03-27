import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Aprendendo sobre vetores
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double [] vect = new double[n];// Instanciando vetor
        for (int i=0; i<n; i++){// Laço para definir a posição dos valores do vetor
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;// variável da média
        for (int i=0; i<n; i++){// Calcular a média de altura dado no vetor
            sum+= vect[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT:  %.2f%n",  avg);

        sc.close();

        }
    }
