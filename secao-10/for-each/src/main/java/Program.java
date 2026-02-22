/*Laço "for each" 22/02/2026
Leitura: "para cada objeto 'obj' contido em vect, faça:"
* */

public class Program {
    public static void main(String[] args) {

        String[] vetor = new String[] {"Maria", "João", "Bob"};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("----------------------------");

        for (String obj : vetor) {
            System.out.println(obj);
        }

    }
}
