import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Olá Mundo");
        // System.out.println("Karen aqui!!!");
        
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        // Entrada de dados

        double A, B , C;
        double delta, x1, x2  ;
        System.out.println("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        C = sc.nextDouble();

        System.out.println();

        // Achar o valor de delta
        delta = Math.pow(B, 2) - 4 * A * C;
        System.out.println("O valor de Delta é : " + delta);

        System.out.println();

        // Calcular as raizes
        x1 = (-B + Math.sqrt(delta)) / 2 * A;
        System.out.println(x1);

        x2 = (-B - Math.sqrt(delta)) / 2 * A;
        System.out.println(x2);

        
    }
}