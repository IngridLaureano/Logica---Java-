import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("valores: ");
            valores[i] = in.nextInt();
        }

        System.out.println(" ");
        for (int j = 0; j < valores.length; j++) {
            if (valores[j] % 2 == 0) {
                System.out.println(valores[j] + " PAR");
            }
        }
        for (int j = 0; j < valores.length; j++) {
            if (valores[j] % 2 == 1) {
                System.out.println(valores[j] + " IMPAR");
            }
        }

    }
}
