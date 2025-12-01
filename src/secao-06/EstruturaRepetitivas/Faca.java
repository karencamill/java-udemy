import java.util.Scanner;

import static java.util.Locale.US;

public class Faca {
    public static void main(String[] args) {

        // Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente Fahrenheit.
        // Perguntar se o usuário deseja repetir(s/n). Caso o usuário digite"s",repetir o programa.
        // Fórmula: F = 9.0 * C / 5.0 + 32.0;
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = 9.0 * C / 5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
        System.out.print("Deseja repetir (s/n)?");
        char resp = sc.next().charAt(0);

        while (resp != 'n') {
            System.out.print("Digite a temperatura em Celsius: ");
            C = sc.nextDouble();
            F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        }

        sc.close();

        // Melhorado






            }
    }