/*Objetivo: 25/02/2026
Ler 5 números ; Mostrar apenas os números pares*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Digite 5 números: ");

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            list.add(n);
        }

        System.out.println("----------------------------");
        System.out.println("LISTA");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("----------------------------");
        System.out.println("LISTA APENAS DOS PARES"); // USANDO FOR EACH
        for (int n : list) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }

        System.out.println("----------------------------");
        System.out.println("\nNúmeros pares:"); // USANDO FOR NORMAL
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i));
            }
        }

        sc.close();

    }
}
