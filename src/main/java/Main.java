import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
      //  System.out.println("Se eu não desistir o que será que acontece?");
      //  System.out.println("Eu não desisti ainda porque tem gente esperando eu vencer para vencer também :( ");


        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int maior = num;
        int menor = num;

        while(num != 0) {

            if (num > maior) {
                maior = num;
            }
            else if (num < menor) {
                menor = num;
            }

            System.out.print("Digite outro número: ");
            num = sc.nextInt();
        }

        if (num == 0) {
            System.out.println("Nenhum número válido digitado.");
        }

        System.out.println();
        System.out.println("O maior número é: " + maior);

        System.out.println();
        System.out.println("O menor número é: " + menor);

        sc.close();

    }
}

