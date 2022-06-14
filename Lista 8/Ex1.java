import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetorNum = new int[5];

        for (int i = 0; i < vetorNum.length; i++) {
            System.out.println(" Informe os valores do vetor: ");
            vetorNum[i] = in.nextInt();
        }

        System.out.println(" Valores invertidos: ");

        for (int i = vetorNum.length - 1; i >= 0; i--) {
            System.out.println(vetorNum[i] + " ");
        }
    }
}
