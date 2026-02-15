/*Faça um programa que leia N números reais e armazene-os em um vetor.
Em seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a média dos elementos do vetor */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        //ENTRADA DE DADOS
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        //MOSTRAR VALORES
        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor [i] + "  ");
        }

        //SOMA
        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }

        //MÉDIA
        double media = soma / n;

        System.out.printf("\nSOMA = %.2f%n" , soma);
        System.out.printf("MEDIA = %.2f%n" , media);


        sc.close();

    }
}
