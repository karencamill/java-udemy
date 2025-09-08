import java.util.Scanner;

import static java.util.Locale.US;

public class Para {
    public static void main(String[] args) {

        /*TESTE*/
        //CONTAGEM
        for (int i=0; i<5; i++){
            System.out.print(i);
        }

        System.out.println("");

        //CONTAGEM REGRESSIVA
        for (int i=4; i>=0; i--){
            System.out.print(i);
        }

        /*Fazer um programa que lê um valor inteiro N e depois N números inteiros. Ao final, mostra a soma dos N números
        lidos*/
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for (int i=0; i<N; i++){
            int x = sc.nextInt();
            soma += x; //soma = soma + x;
        }

        System.out.println(soma);
        sc.close();

        /*Exercício*/


        }
    }