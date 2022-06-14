import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] v1, v2;
        v1 = new int[10];
        v2 = new int[10];

        System.out.println("Informe os valores: ");
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Posicao: " + i);
            v1[i] = in.nextInt();
        }
        System.out.println("AQUI");
        for (int i = 1; i < v2.length; i++) {
            v2[0] = v1[0];
            v2[i] = v1[i] + v2[(i - 1)];
        }

        System.out.println("RESULTADO: ");
        for (int i = 0; i < v2.length; i++) {
            System.out.println("V2(" + i + ") = " + v2[i]);
        }
    }
}
