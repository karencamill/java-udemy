import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int n = sc.nextInt();

        if (n > 0 && n <= 10) {

            int[] vect = new int[n];

            for (int i = 0; i < vect.length; i++) {
                System.out.print("Digite um número: ");
                vect[i] = sc.nextInt();
            }

            System.out.println("NÚMEROS NEGATIVOS: ");

            int quantidade = 0;

            for (int i = 0; i < vect.length; i++) {
                if (vect[i] < 0) {
                    System.out.println(vect[i]);
                    quantidade++;
                }
            }

            System.out.println("A quantidade de números negativos: " + quantidade);

        }
        else {
            System.out.println("OPÇÃO INVÁLIDA!!");
        }

        sc.close();

    }
}
