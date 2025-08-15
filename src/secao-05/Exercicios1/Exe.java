import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;


public class Exe {
    public static void main(String[] args) {


        /*TESTE*/
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
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        double x, y;
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        }
        else if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo y");
        }else {
            System.out.println("Eixo x");
        }

        sc.close();


        /*Exercicio 8
       Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
       que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
       qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

       Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
       mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

       Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
       salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
       de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total.*/

        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        double salario;
        double imposto = 0.0;

        salario = sc.nextDouble();

        if (salario <= 2000.0) {
            System.out.println("Isento");
            return;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        System.out.printf("R$ %.2f", imposto);

        sc.close();

    }
}