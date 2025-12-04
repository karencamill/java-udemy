package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

import static java.util.Locale.US;

public class Program {
    public static void main(String[] args) {

        // Define o padrão numérico para formato americano (usa ponto ao invés de vírgula)
        Locale.setDefault(US);

        // Scanner para ler dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Cria um objeto Product utilizando o construtor padrão
        Product product = new Product();

        // Entrada de dados do usuário
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();
        // Lendo o nome do produto e armazenando no atributo name

        System.out.print("Price: ");
        product.price = sc.nextDouble();
        // Lendo o preço do produto

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        // Lendo a quantidade inicial do produto no estoque

        System.out.println();
        // Mostra os dados usando o método toString() da classe Product
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        // Quantidade que será adicionada ao estoque

        product.addProdutcs(quantity);
        // Chamando o método que soma esta quantidade ao estoque atual

        System.out.println();
        System.out.println("Update data: " + product);
        // Mostra o produto após adicionar unidades

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        // Quantidade que será removida do estoque

        product.removeProdutcs(quantity);
        // Chamando o método que subtrai esta quantidade do estoque

        System.out.println();
        System.out.println("Update data: " + product);
        // Mostra o produto após remover unidades

        // Fecha o Scanner
        sc.close();
    }

}
