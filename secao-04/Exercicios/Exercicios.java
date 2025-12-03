import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Exercicios {
    public static void main(String[] args) {

        //Exercicio teste
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        double largura ;
        double comprimento;
        double metroQuadrado;
        double area, preco ;

        System.out.println("Digite a largura: ");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento: ");
        comprimento = sc.nextDouble();
        System.out.println("Digite o metro quadrado: ");
        metroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = metroQuadrado * area;

        System.out.println();
        System.out.printf("A area é %.2f%n", area);
        System.out.printf("O preço é %.2f%n", preco);


        /* Exercicio 1
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.*/
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int soma;

        System.out.println("Digite o primeiro valor: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        num2 = sc.nextInt();

        soma = num1 + num2;
        System.out.println("SOMA = " + soma);

        sc.close();


        /* Exercicio 2
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.

        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159*/
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        double raio;
        double pi = 3.14159;
        double area;

        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2.0);
        System.out.printf("A = %.4f%n", area);


        /* Exercico 3
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do
        produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = A * B - C * D ;

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();

        /* Exercicio 4
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.*/
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario;
        numFuncionario = sc.nextInt();
        double horasTrabalhadas;
        horasTrabalhadas = sc.nextDouble();
        double valorHoras;
        valorHoras = sc.nextDouble();
        double salario = horasTrabalhadas * valorHoras;

        System.out.println();

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n ", salario);

        sc.close();


        /*Exercicio 5
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        double codigo1;
        double numero1;
        double valorUni1;

        double codigo2;
        double numero2;
        double valorUni2;

        codigo1 = sc.nextDouble();
        // System.out.println("Código da peça " + codigo1);
        numero1 = sc.nextDouble();
        // System.out.println("Número de peças " + numero1);
        valorUni1 = sc.nextDouble();
        // System.out.println("Valor da peça " + valorUni1);

        double valor1 = numero1 * valorUni1;

        codigo2 = sc.nextDouble();
        // System.out.println("Código da peça " + codigo2);
        numero2 = sc.nextDouble();
        // System.out.println("Número de peças " + numero2);
        valorUni2 = sc.nextDouble();
        // System.out.println("Valor da peça " + valorUni2);

        double valor2 = numero2 * valorUni2;

        double valorTotal = valor1 + valor2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n ", valorTotal);

        sc.close();


        /* Exercicio 6
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B */
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);


        double A, B, C;
        double pi = 3.14159;
        double areaTriangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTriangulo = (A * C) / 2 ;
        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        areaCirculo = pi * Math.pow(C,2);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        areaTrapezio = (A + B) * C / 2;
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        areaQuadrado = B * B;
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        areaRetangulo = A * B;
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        sc.close();

         }
    }