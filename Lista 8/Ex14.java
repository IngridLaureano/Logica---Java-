import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = { 10, 5, 2, -2, -5, 15 };
        int pX, pY, x, y;

        do {
            System.out.println("Informe as posicoes a serem trocadas: (0 - 5) ");
            pX = in.nextInt();
            pY = in.nextInt();
            System.out.println("Informe o valor das posicoes: ");
            x = in.nextInt();
            y = in.nextInt();

            vetor[pX] = x;
            vetor[pY] = y;

            System.out.println("Novo vetor: ");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Posicao n " + i + ": " + vetor[i]);
            }
        } while (true);

    }
}
