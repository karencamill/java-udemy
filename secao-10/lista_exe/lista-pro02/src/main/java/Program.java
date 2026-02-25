/*2️⃣ Soma de Números
Peça ao usuário 5 números.
Armazene em uma List<Integer>.
Mostre:
A soma dos números
A média*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            list.add(num);
        }

        int soma = 0;
        for (int num : list) {
            soma = soma + num;
        }


        double media = (double) soma / list.size();

        System.out.println("------------------------------");
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        sc.close();

    }
}
