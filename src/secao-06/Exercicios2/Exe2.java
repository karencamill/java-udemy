import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Exe2 {
    public static void main(String[] args) {


        /*Exercício 1
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
        inclusive o X, se for o caso.*/
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i=1; i<=x; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();


        /*Exercício 2
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        */


    }
}