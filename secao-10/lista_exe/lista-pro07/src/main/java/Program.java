import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        /*Descobrir se um número está na lista

Ler 5 números
Depois pedir um número
Verificar se ele existe na lista
Mostrar: "Encontrado" ou "Não encontrado"*/


        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Digite 5 números: ");
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            list.add(n);
        }

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        // USANDO FOR , JEITO LÓGICO
        boolean encontrado = false;

        for (int n : list) {
            if (n == numero) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Encontrado!");
        } else {
            System.out.println("Não encontrado!");
        }

        // USANDO MÉTODO DA CLASSE LIST
        if (list.contains(numero)) {
            System.out.println("ENCONTRADO");
        }
        else {
            System.out.println("NÃO ENCONTRADO");
        }

        sc.close();

    }
}
