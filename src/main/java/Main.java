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
        double delta;
        double x, x1, x2;
        System.out.println("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        C = sc.nextDouble();

        System.out.println();

        if (A == 0) {
            System.out.println("Não existe equação do 2º grau, A não pode ser igual a 0.");
        } else {

            // Achar o valor de delta
            delta = Math.pow(B, 2) - 4 * A * C;
            System.out.println("O valor de Delta é : " + delta);

            System.out.println();

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais");
            } else if (delta == 0) {
                x = - B / 2 * A;
                System.out.println("A equação possui duas raízes iguais: x = " + x);
            } else {
                x1 = (-B + Math.sqrt(delta)) / (2 * A);
                x2 = (-B - Math.sqrt(delta)) / (2 * A);
                System.out.println("A equação possui duas raízes reais:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            }
        }

        sc.close();
        
    }
}