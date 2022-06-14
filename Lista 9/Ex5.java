import java.util.Scanner;
import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random aleat = new Random();

        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleat.nextInt(10);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i >= 0 && j > i) {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* Criar um algoritmo que inicie de maneira randômica os elementos de uma matriz
inteira 10 x 10 e escreva somente os elementos abaixo da diagonal principal. */
