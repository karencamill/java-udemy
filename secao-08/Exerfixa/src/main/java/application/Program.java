package application;

import util.CurrencyConverter;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter currency = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        currency.price = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        currency.quanti = sc.nextDouble();

        System.out.println();

        System.out.printf("Amount to be paid in reais = %.2f%n" , currency.resultado());
        sc.close();
    }



}
