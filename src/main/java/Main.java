import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Olá Mundo");
        // System.out.println("Karen aqui!!!");

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
    }
}