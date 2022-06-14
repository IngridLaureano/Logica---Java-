import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, div, soma = 0;

        for (i = 1; i <= 1000; i++) {
        for (div = 1, soma = 0; div <= (i / 2); div++) {
            if (i % div == 0) {
            soma = soma + div;
            }

        }
        if (soma == i) {
            System.out.println("Numero perfeito: " + i);
           }

        }

    }

}