public class Casting {
    public static void main(String[] args) {

        int a, b; // Valores inteiros
        double resultado; // resultado aceita números com ponto flutuante
        double resultado2;

        a = 5;
        b = 2;

        resultado = a / b; // Divisão de dois números inteiros não aceita ponto flutuante
        resultado2 = (double) a / b; // Com o uso de "Casting", eu converto o resultado para double

        System.out.println(resultado); // => 2.0
        System.out.println(resultado2); // => 2.5

    }
}