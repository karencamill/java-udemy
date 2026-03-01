import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        System.out.println();

        int[][] mat = new int[linha][coluna];

        for (int i = 0; i< mat.length; i++) {
            for (int j = 0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matriz digitada:");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); // pula linha ao final de cada linha
        }

        int num = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == num) {
                    System.out.println("Position " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();

    }
}
