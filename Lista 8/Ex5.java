import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor, v1, v2;
        vetor = new int[20];
        v1 = new int[10];
        v2 = new int[10];
        int posi = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valores: ");
            vetor[i] = in.nextInt();
        }

        System.out.println("AQUI !!");

        for (int i = 0; i < v1.length; i++) {
            v1[i] = vetor[i + 10];
        }
        for (int i = 0; i < v2.length; i++) {
            v2[i] = vetor[i];
        }

        System.out.println("RESPOSTA: ");

        for (int i = 0; i < v1.length; i++) {
            System.out.println(i + " Posicao = " + v1[i]);
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.println(i + 10 + " Posicao = " + v2[i]);
        }

    }
}
