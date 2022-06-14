import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[6];
        int x, y, soma;

        System.out.println("Informe os valores do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
        }

        do {
            System.out.println("Informe duas posicoes do vetor: ");
            x = in.nextInt();
            y = in.nextInt();
            if (x == -1 || y == -1)
                break;

            soma = vetor[x] + vetor[y];
            System.out.println("A SOMA EH: " + soma);

        } while (true);

    }
}
