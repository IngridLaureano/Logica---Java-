import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("L" + i);
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == i) {
                matriz[i][j] = 0;
                }
            }
        }
        System.out.println("Resultado: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
/* Criar um algoritmo que leia os elementos de uma matriz inteira 10 x 10 e escreva
todos os elementos, exceto os elementos da diagonal principal */