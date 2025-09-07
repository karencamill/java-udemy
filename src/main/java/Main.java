import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Olá Mundo");
       // System.out.println("Karen aqui!!!")

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            soma = soma + x;
            // > mesma coisa que >> soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}

