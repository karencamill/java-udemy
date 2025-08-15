import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Ternario {
    public static void main(String[] args) {
        // System.out.println("Olá Mundo");
        // System.out.println("Karen aqui!!!")

        Locale.setDefault(US);
        double preco = 34.5;
        double desconto;

        desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);

        /*
        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
        System.out.println(desconto);*/

    }
}