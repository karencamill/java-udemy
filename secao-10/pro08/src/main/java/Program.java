/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" 19/02/2026*/

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        int soma = 0;
        int quantidade = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                soma = soma + vetor[i];
                quantidade++;
            }
        }

        if (quantidade == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        }
        else {
            double media = (double)soma / quantidade;
            System.out.println("MEDIA DOS PARES = " + media);
        }

        sc.close();

    }
}
