public class FuncaoMath {
    public static void main(String[] args) {

        // Atribuição de valores
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C ;

        //Assim que se calcular a raiz quadrada
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        //Resultados das raizes
        System.out.println("A raiz quadrada de " + x + " = " + A);
        System.out.println("A raiz quadrada de " + y + " = " + B);
        System.out.println("A raiz quadrada de 25 = " + C);

        System.out.println();

        // Calcular a potencia
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);


        //Resultados das potencia
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado a 2.0 = " + B);
        System.out.println("5.0 elevado a 2.0 = " + C);

        System.out.println();

        //Valor absoluto tirar o sinal negativo caso exista
        A = Math.abs(y);
        B = Math.abs(z);

        //Resultados dos valores absolutos
        System.out.println("O valor absoluto de " + y + " = " + A);
        System.out.println("O valor absoluto de " + z + " = " + B);


    }
}