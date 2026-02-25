/* Ler 5 números 25/02/2026
Somar somente os que forem maiores que 10
Mostrar a soma*/

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

        int soma = 0;
        // USANDO FOR EACH
        for (int n : list) {
            if (n > 10) {
                soma = soma + n;
            }
        }
        System.out.println("A sooooomaaa é ===== " + soma);


        soma = 0;
        // USANDO FOR NORMAL
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 10) {
                soma = soma + list.get(i);
            }
        }
        System.out.println("A SOMA É = " + soma);

        System.out.println("---------------------------");
        System.out.println("MOSTRAR LISTA - FOR EACH");

        for (int n : list){
            System.out.println(n);
        }

        System.out.println("---------------------------");
        System.out.println("MOSTRAR LISTA - FOR NORMAL");

        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }


        sc.close();

    }
}
