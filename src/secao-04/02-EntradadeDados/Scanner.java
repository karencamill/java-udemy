
import java.util.Scanner;
// faça sc.close() quando não precisar mais do objeto sc
public class Scanner {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declarando variáveis
        String x;
        int y;
        double z;
        char zx;

        // Trabalhando com strings
        System.out.print("Digite alguma frase: ");
        x = teclado.nextLine();
        System.out.println("Você digitou: " + x); // Concatenação

        // Trabalhando com inteiros
        System.out.print("Agora digite algum número inteiro: ");
        y = teclado.nextInt();
        System.out.print("Você digitou: ");
        System.out.println(y); // Devolvendo a variavel na mesma linha

        // Trabalhando com double
        System.out.print("Agora um Double: "); // Se o estiver programado para o Locale BR, só é aceito , com separador de casas decimais
        z = teclado.nextDouble();
        System.out.printf("Você digitou: %.2f%n", z); // Formatando em duas cas flutuantes

        // Trabalhando com caracteres
        System.out.print("Digite qualquer caracter: ");
        zx = teclado.next().charAt(0); // Qualquer tecla e frase, mas apenas o primeiro caractere
        System.out.println("Pegamos apenas o primeiro caracter hehehe: " + zx);

        // Trabalhando com vários tipos
        System.out.println("Digite uma string, um inteiro e um double por linha:"); // Tudo na mesma linha
        x = teclado.next(); //  string
        y = teclado.nextInt(); //  inteiro
        z = teclado.nextDouble(); //  double
        System.out.print("Você digitou: " + x + ", " + y + ", " + z + ".");

        teclado.close(); // Descarta o objeto do tipo Scanner

        /* OUTRO EXEMPLO

                Scanner sc = new Scanner(System.in);
                System.out.println("Digite algumas coisas por linha:");

                sc.nextLine(); // O nextLine consome um espaço vazio, por isso estou deixando aqui, no caso de haver um string vazio
                String s1 = sc.nextLine(); // nextLine aceita dados até a quebra de linha
                String s2 = sc.nextLine(); // Pode ser um string vazio
                String s3 = sc.nextLine();

                System.out.println("DADOS DIGITADOS:");
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);

                sc.close();
            }
        }
        */

    }

}