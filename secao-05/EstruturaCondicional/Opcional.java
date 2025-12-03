import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Opcional {
    public static void main(String[] args) {

        // USANDO IF - ELSE
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        int diaSemana;

        System.out.println("Digite um dia da semana: ");
        diaSemana = sc.nextInt();

        if (diaSemana == 1) {
            System.out.println("Domingo");
        }
        else if (diaSemana == 2) {
            System.out.println("Segunda-feira");
        }
        else if (diaSemana == 3) {
            System.out.println("Terça-feira");
        }
        else if (diaSemana == 4) {
            System.out.println("Quarta-feira");
        }
        else if (diaSemana == 5) {
            System.out.println("Quinta-feira");
        } else if (diaSemana == 6) {
            System.out.println("Sexta-feira");
        } else if (diaSemana == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Inválido");
        }

        sc.close();

        // USANDO SWITCH - CASE
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um dia da semana: ");
        int x = sc.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Inválido";
                break;
        }

        System.out.println(dia);

        sc.close();

    }
}