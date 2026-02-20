/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. 20/02/2026 */

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            generos[i] = sc.next().charAt(0);
        }

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];

        for (int i = 0; i < n; i++) {
            if (alturas[i] < menorAltura){
                menorAltura = alturas[i];
            }
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
        }

        double alturaFemTotal = 0.0;
        int quantidadeHomem = 0;
        int quantidadeMulher = 0;

        for (int i = 0; i < n; i++) {
            if (generos[i] == 'M' || generos[i] == 'm') {
                quantidadeHomem++;
            }
            else if (generos[i] == 'F' || generos[i] == 'f') {
                quantidadeMulher++;
                alturaFemTotal = alturaFemTotal + alturas[i];
            }
            else {
                System.out.println("GÊNERO NÃO IDENTIFICADO");
            }
        }

        System.out.print("Menor altura = " + menorAltura);
        System.out.print("\nMaior altura = " + maiorAltura);

        if (quantidadeMulher > 0) {
            double alturaMedia = alturaFemTotal / quantidadeMulher;
            System.out.printf("\nMedia das alturas das mulheres = %.2f" , alturaMedia);
        }
        else {
            System.out.print("\nNÃO TEM MULHER");
        }

        System.out.print("\nNúmeros de homens = " + quantidadeHomem);

        sc.close();

    }
}
