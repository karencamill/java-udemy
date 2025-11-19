import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Olá Mundo");
       // System.out.println("Karen aqui!!!";

                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();

                int in = 0;
                int out = 0;

                for (int i=0; i<n; i++){
                    int x = sc.nextInt();
                    if (x >= 10 && x <= 20){
                        in = in + 1;
                    }
                    else {
                        out = out + 1;
                    }
                }

                System.out.println();
                System.out.println(in + " in");
                System.out.println(out + " out");

                sc.close();
            }
        }

