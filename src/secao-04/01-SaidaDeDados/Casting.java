public class Casting {
    public static void main(String[] args) {

        // Exemplo 1
        int a, b; // Valores inteiros
        double resultado; // resultado aceita números com ponto flutuante
        double resultado2;

        a = 5;
        b = 2;

        resultado = a / b; // Divisão de dois números inteiros não aceita ponto flutuante
        resultado2 = (double) a / b; // Com o uso de "Casting", eu converto o resultado para double

        System.out.println(resultado); // => 2.0
        System.out.println(resultado2); // => 2.5


        // Exemplo 2
        double a; // Valor com ponto flutuante
        int b; // Valor inteiro

        a = 5.0;
        b = (int) a; // Para converter de double para int tem que usar "Casting"

        System.out.println(b);


    }
}