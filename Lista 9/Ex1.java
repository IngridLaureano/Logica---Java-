import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] m1, m2, m3;
        m1 = new int[3][3];
        m2 = new int[3][3];
        m3 = new int[3][3];

        for (int i = 0; i < m1.length; i++) {

            for (int j = 0; j < m1[i].length; j++) {
                System.out.println("Informe os valores da matriz 1: ");
                m1[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < m2.length; i++) {

            for (int j = 0; j < m2[i].length; j++) {
                System.out.println("Informe os valores da matriz 2: ");
                m2[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < m3.length; i++) {

            for (int j = 0; j < m3[i].length; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("RESUTADO: ");
        for (int i = 0; i < m3.length; i++) {

            for (int j = 0; j < m3[i].length; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*Faça um programa que leia duas matrizes 3x3 e apresente o resultado na tela. A
soma de matrizes é feita utilizando a seguinte regra */