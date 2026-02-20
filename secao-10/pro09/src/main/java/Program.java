/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. 20/02/2026 */

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanntas pessoas você vai digitar: ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maiorIdade = idades[0];
        int posicaoMaior = 0;

        for (int i = 0; i<n; i++) {
            if (idades[i] > maiorIdade){
                posicaoMaior = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " +nomes[posicaoMaior]);

        sc.close();

    }
}
