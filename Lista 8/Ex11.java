import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] v1, v2, vResultado;
        int tamanho;

        System.out.println("Informe o tamanho do vetor: ");
        tamanho = in.nextInt();
        v1 = new int[tamanho];
        v2 = new int[tamanho];
        vResultado = new int[tamanho];

        System.out.println("Valores do vetor 1: ");
        for (int i = 0; i < v1.length; i++) {
            v1[i] = in.nextInt();
        }
        System.out.println("Valores do vetor 2: ");
        for (int i = 0; i < v2.length; i++) {
            v2[i] = in.nextInt();
        }

        for (int i = 0; i < vResultado.length; i++) {
            vResultado[i] = v1[i] + v2[i];
        }

        System.out.println("Resultado da soma dos vetores: ");
        for (int i = 0; i < vResultado.length; i++) {
            System.out.println(i + 1 + " : " + vResultado[i]);
        }

    }
}
