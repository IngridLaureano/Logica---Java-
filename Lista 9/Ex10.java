import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] mat, mat1, mat2, mat3;
        mat = new int[6][6];
        mat1 = new int[6][6];
        mat2 = new int[6][6];
        mat3 = new int[6][6];

        System.out.println("Informe os valores da matriz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                mat1[i][j] = mat[i][j];
                mat2[i][j] = mat[i][j];
                mat3[i][j] = mat[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            mat1[1][i] = mat[5][i];
            mat1[5][i] = mat[1][i];
        }
        for (int i = 0; i < mat2.length; i++) {
            mat2[i][2] = mat[i][5];
            mat2[i][5] = mat[i][2];
        }
        for (int i = 0; i < mat3.length; i++) {
            mat3[i][i] = mat[i][5 - i];
            mat3[i][5 - i] = mat[i][i];
        }
        int op;
        do {
        System.out.println("Escolha uma modificacao: 1 - 2 - 3");
        op = in.nextInt();
        if (op == 1) {
            System.out.println("MATRIZ 1 MODIFICACAO");
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println();
            }
        }

        if (op == 2) {
            System.out.println("MATRIZ 2 MODIFICACAO");
            for (int i = 0; i < mat2.length; i++) {
                for (int j = 0; j < mat2[i].length; j++) {
                    System.out.print(mat2[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (op == 3) {
            System.out.println("MATRIZ 3 MODIFICACAO");
            for (int i = 0; i < mat3.length; i++) {
                for (int j = 0; j < mat3[i].length; j++) {
                    System.out.print(mat3[i][j] + " ");
                }
                System.out.println();
            } 
        }
    }while (op>0);
    
    }
}
/* Criar um algoritmo que leia e armazene os elementos de uma matriz inteira M 10x10
e a imprime na tela. Troque, na ordem a seguir mostrando a nova matriz a cada
interação:
- a segunda linha pela oitava linha;
- a quarta coluna pela décima coluna;
- a diagonal principal pela diagonal secundária.
 */
