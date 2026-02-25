import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        /*3️⃣ Maior e Menor Número

Leia N números.
Armazene em uma lista.
Mostre:
O maior número

O menor número

A posição de cada um*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int numero = sc.nextInt();
            list.add(numero);
        }

        int maior = list.get(0);
        int menor = list.get(0);
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) > maior) {
                maior = list.get(i);
                posMaior = i;
            }

            if (list.get(i) < menor) {
                menor = list.get(i);
                posMenor = i;
            }

        }

        System.out.println("\nMaior número: " + maior);
        System.out.println("Posição do maior: " + posMaior);

        System.out.println("\nMenor número: " + menor);
        System.out.println("Posição do menor: " + posMenor);

        sc.close();

    }
}
