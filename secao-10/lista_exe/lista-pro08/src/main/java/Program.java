/* Mostrar posição de um número 25/02/2026
Ler 5 números
uardar na lista
Pedir um número
Mostrar a posição dele na lista*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Digite 5 números: ");

        for (int i = 0; i < 5; i++ ) {
            int n = sc.nextInt();
            list.add(n);
        }

        System.out.print("\nDigite um número para procurar: ");
        int numero = sc.nextInt();

        int posicao = list.indexOf(numero);

        if (posicao != -1) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Número não encontrado.");
        }


        sc.close();

    }
}
