/*1️⃣ Lista de Nomes
Crie um programa que:
Peça para o usuário quantos nomes deseja inserir.
Armazene os nomes em uma List<String>.
Mostre todos os nomes digitados.
Depois, mostre também:
Quantos nomes têm mais de 5 letras.*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos nomes você quer inserir na lista? ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("DIgite um nome: ");
            String nome = sc.next();
            list.add(nome);
        }

        System.out.println();
        System.out.println("----- LISTA -----");
        for (String nome : list) {
            System.out.println(nome);
        }

        int contador = 0;
        for (String nome : list) {
            if (nome.length() > 5) {
                contador++;
            }
        }

        System.out.println("\nQuantidade de nomes com mais de 5 letras: " + contador);

        sc.close();

    }
}
