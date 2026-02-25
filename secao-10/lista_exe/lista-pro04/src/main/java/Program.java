/* Mostrar elementos da lista 25/02/2026
Objetivo: Ler 3 números ; Guardar na lista ; Mostrar um por um (usando for normal)*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Digite 3 números: ");
        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();
            list.add(n);
        }

        System.out.println("-----------------------");

        System.out.println("LISTA"); // USANDO FOR EACH
        for (int n : list) {
            System.out.println(n);
        }

        System.out.println("-----------------------");

        System.out.println("LISTA"); // USANDO FOR NORMAL

        for (int i = 0; i < list.size(); i++){
            System.out.println("Posição " + i + ": " + list.get(i));
        }

        sc.close();

    }
}
