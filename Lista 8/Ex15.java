import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[20];
        int valor, achou = 0;

        System.out.println("Informe os valores do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
        }
        System.out.println("Informe um valor: ");
        valor = in.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                System.out.println("Numero encontrado na posicao : " + i);
                achou++;
            }
        }
        if (achou == 0) {
            System.out.println("Não foi encontrado nenhum numero!!");
        }
    }
}
