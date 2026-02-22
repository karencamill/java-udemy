/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. 22/02/2026 */

package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            System.out.println();

            // Criando e armazenando o objeto
            pessoas[i] = new Pessoa(name, age, height);
        }

        int nMenores = 0;
        double alturaTotal = 0.0;
        for (int i = 0; i < n; i++) {

            if (pessoas[i].getAge() < 16) {
                nMenores++;
            }

            alturaTotal = alturaTotal + pessoas[i]. getHeight();
        }

        double alturaMedia = alturaTotal / n;
        double percentualMenores = ((double) nMenores / n) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (pessoas[i].getAge() < 16) {
                System.out.println(pessoas[i].getName());
            }
        }

        sc.close();

    }
}
