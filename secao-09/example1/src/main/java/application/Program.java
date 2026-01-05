package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Enter account number: ");
        product.number = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        product.holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        product.opc = sc.next().charAt(0);

        System.out.print("Enter initial deposit value: ");
        product.initialValue = sc.nextDouble();
        System.out.println();

        System.out.println("Account data:");
        System.out.println(product);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double initialValue = sc.nextDouble();
        product.addMoney(initialValue);

        System.out.println("Update account data:");
        System.out.println(product);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        initialValue = sc.nextDouble();
        product.removeMoney(initialValue);

        System.out.println("Update account data:");
        System.out.println(product);
        System.out.println();


        sc.close();

    }
}
