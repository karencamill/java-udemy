import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Exe {
    public static void main(String[] args) {


        /*Exercio 1
        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
        Scanner sc = new Scanner(System.in);

        int num1;
        num1 = sc.nextInt();

        if (num1 >= 0) {
            System.out.println("NÃO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }

        sc.close();


        /*Exercicio 2
        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */
        Scanner sc = new Scanner(System.in);

        int num1;
        num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("ÍMPAR");
        }

        sc.close();


        /*Exercicio 3
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente.*/
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("São Multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }

        sc.close();


        /*Exercicio 4
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        duracao = horaFinal - horaInicial;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " horas");


        sc.close();


        /*Exercicio 5
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar. */
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidade;
        double total;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigo == 1){
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        } else if (codigo == 4) {
            total = quantidade * 2.0;
        } else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f", total);

        sc.close();



        /*Exercicio 6
        Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes
        intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
        nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        if (num >= 0.0 && num <= 25.0){
            System.out.println("Intervalo (0,25)");
        }
        else if (num > 25.0 && num <= 50.0) {
            System.out.println("Intervalo (25,50)");
        }
        else if (num > 50.0 && num <= 75.0) {
            System.out.println("Intervalo (50,75)");
        } else if (num > 75.0 && num <= 100.0) {
            System.out.println("Intervalo (75,100)");
        } else {
            System.out.println("Fora de Intervalo");
        }

        sc.close();


        /*Exercicio 7
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

        Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.*/


    }
}