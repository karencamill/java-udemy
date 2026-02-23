//Aprendendo lista 23/02/2026

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria"); // adicionei
        list.add("Alex"); // adicionei
        list.add("Bob"); // adicionei
        list.add("Anna"); // adicionei
        list.add(2, "Marco"); // adicionei na posição 2
        list.add("Karen");
        list.add(1, "Pedro");
        list.add("Joao");
        list.add("Kemilly");
        list.add("Kahena");

        System.out.println("LISTA: ");
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------------");
        System.out.println("TAMANHO DA LISTA: " + list.size()); // mostra o tamanho da lista

        System.out.println("-----------------------------");
        list.remove("Anna"); // remove pela String
        list.remove(1); // remove pela posição

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); // remove da lista nome que começa com M

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); //mostra a posição que o elemento está na lista
        System.out.println("Index of Bob: " + list.indexOf("Karen"));

        System.out.println("-----------------------------");
        // mostra apenas as pessoas que começa com a letra K
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'K').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-----------------------------");
        // encontra o primeiro elemento com a letra K
        String name = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
        System.out.println(name);

    }
}
