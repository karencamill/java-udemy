/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
<<<<<<< HEAD
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

        String[] nome = new String[n];
        int [] idade = new int[n];
        double[] altura = new double[n];

        double alturaTotal = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            alturaTotal = alturaTotal + altura[i];
        }

        double alturaMedia = alturaTotal / n;
        System.out.println();
        System.out.printf("Altura média: %.2f\n" , alturaMedia);

        int menores = 0;

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                menores++;
            }
        }

        double percentualMenores = (double) menores * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }

        sc.close();

    }
}

