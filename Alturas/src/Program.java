import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double mediaAlturas, soma, porcentagem;


        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();

        double [] vet = new double[n];
        String[] nome = new String[n];
        int [] idade = new int[n];
        double [] altura = new double[n];

        for (int i = 0; i < vet.length; i++){
            System.out.println("Dados da " + (i+1) +"a pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura [i] = sc.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < vet.length; i++){
            soma += altura[i];
        }

        mediaAlturas = soma / n;

        System.out.printf("Altura média: %.2f\n", mediaAlturas);


        int contador = 0 ;
       for (int i = 0; i < idade.length; i++){
           if (idade[i] < 16){
               contador++;
           }else{
               System.out.print("");
           }
       }

       porcentagem = (contador * 100.00) / idade.length;

       System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

       for (int i = 0; i < vet.length; i++){
           if (idade[i] < 16){
               System.out.println(nome[i]);
           }
        }


        sc.close();
    }
}
