import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] v1 = { 1, 2, 3, 4, 5 };
        int[] v2 = new int[5];
        int condicao;

        do {
            for (int i = 0; i < v1.length; i++) {
                System.out.println("Informe os valores: ");
                v2[i] = in.nextInt();
            }

            condicao = 5;
            for (int i = 0; i < v1.length; i++) {
                if (v1[i] == v2[i]) {
                } else if (v1[i] != v2[i]) {
                    condicao -= 1;
                    System.out.println("ERRO: " + v2[i] + "  devia ser: " + v1[i]);
                }
            }

        } while (condicao != 5);
    }
}
