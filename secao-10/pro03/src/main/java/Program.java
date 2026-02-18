/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. 16/02/2026 */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        int [] idades = new int[n];
        double[] alturas = new double[n];

        double alturaTotal = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            alturaTotal = alturaTotal + alturas[i];
        }

        double alturaMedia = alturaTotal / n;
        System.out.println();
        System.out.printf("Altura média: %.2f\n" , alturaMedia);

        int menores = 0;

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                menores++;
            }
        }

        double percentualMenores = (double) menores * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();

    }
}
