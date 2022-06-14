import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char posicao;
        boolean sair = false;
        int[][] mat = new int[10][10];
        int lin = 4, col = 5;
        mat[lin][col] = 8;
        
        while (!sair) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                   System.out.print(mat[i][j]+" "); 
                }
                System.out.println();
            }   
            System.out.println("W - PARA CIMA | S - PARA BAIXO | F - PARA SAIR");
            System.out.println("A - PARA ESQUERDA | D - PARA DIREITA ");
            posicao = in.next().charAt(0);

            switch (posicao) {
                case 'W':
                    if (lin > 0) {
                        mat[lin][col] = 0;
                        lin--;
                        mat[lin][col] = 8;
                    } else {
                        System.out.println("Movimento invalido!!");
                    }
                    break;
                case 'S':
                    if (lin < 9) {
                        mat[lin][col] = 0;
                        lin++;
                        mat[lin][col] = 8;
                    } else {
                        System.out.println("Movimento invalido!!");
                    }
                    break;
                case 'A':
                    if (col > 0) {
                        mat[lin][col] = 0;
                        col--;
                        mat[lin][col] = 8;
                    } else {
                        System.out.println("Movimento invalido!!");
                    }
                    break;
                case 'D':
                    if (col < 9) {
                        mat[lin][col] = 0;
                        col++;
                        mat[lin][col] = 8;
                    } else {
                        System.out.println("Movimento invalido!!");
                    }
                    break;
                case 'F':
                    sair = true;
                    break;
                default:
                    System.out.println("Comando errado !! ");
            }

        }

    }
}
/* Crie uma matriz 10 x10 e coloque o valor 5 na posição [4][5]. A partir daí, permita
que o usuário utilize as teclas W A S D para movimentar o número 5 e mostrando a
matriz a cada movimento. */