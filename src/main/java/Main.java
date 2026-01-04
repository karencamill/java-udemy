import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
      //  System.out.println("Se eu não desistir o que será que acontece?");
      //  System.out.println("Eu não desisti ainda porque tem gente esperando eu vencer para vencer também :( ");

        /* Validação de senha
Peça ao usuário uma senha numérica.
Enquanto a senha digitada for diferente de 1234, o programa deve pedir a senha novamente.
Quando a senha correta for digitada, mostre uma mensagem de acesso permitido.
        */

        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        int senhaValida = 1234;

        System.out.print("Digite uma senha númerica: ");
        int senha = sc.nextInt();

        while (senha != senhaValida) {
            System.out.print("Digite a senha novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!!");

        sc.close();

    }
}

