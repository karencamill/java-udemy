public class casting {
    public static void main(String[] args) {

        int a, b; // Valores inteiros
        double resulto; // resultado aceita números com ponto flutuante
        double resulto2;

        a = 5;
        b = 2;

        resulto = a / b; // Divisão de dois números inteiros não aceita ponto flutuante
        resulto2 = (double) a / b; // Com o uso de "Casting", eu converto o resultado para double

        System.out.println(resulto); // => 2.0
        System.out.println(resulto2); // => 2.5

    }
}