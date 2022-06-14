import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lin, col, soma = 0, total, falhou = 0, tam, mat[][];

        System.out.println("Informe o tamanho da matriz: ");
        tam = in.nextInt();
        mat = new int[tam][tam];

        System.out.println("Valores da matriz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        // Soma da diagonal Principal
        for (lin = 0; lin < tam; lin++) {
            soma += mat[lin][lin];
        }
        System.out.println("Diagonal principal: " + soma);
        total = soma;
        soma = 0;
        // Soma da diagonal Segundaria
        for (lin = 0; lin < tam; lin++) {
            soma += mat[lin][tam - 1 - lin];
        }
        System.out.println("Diagonal Segundaria: " + soma);
        // Soma das linhas
        if (total != soma) {
            System.out.println("Diagonal segudaria diferente");
            falhou = 1;
        }
        for (lin = 0; lin < tam; lin++) {
            soma = 0;
            for (col = 0; col < tam; col++) {
                soma += mat[lin][col];
            }
            System.out.println("Soma da Lin " + lin + " : " + soma);
            if (total != soma) {
                System.out.println("A linha " + lin + " eh diferente");
                falhou = 1;
            }
        }
        // Soma das colunas
        for (col = 0; col < tam; col++) {
            soma = 0;
            for (lin = 0; lin < tam; lin++) {
                soma += mat[lin][col];
            }
            System.out.println("Soma da Col " + col + " : " + soma);
            if (total != soma) {
                System.out.println("A coluna " + col + " eh diferente");
                falhou = 1;
            }
        }

        if (falhou == 0) {
            System.out.println("A matriz eh um quadrado magico!");
        } else {
            System.out.println("A matriz nao eh um quadrado magico!");
        }
    }
}

/* Dizemos que uma matriz quadrada inteira é um quadrado mágico se a soma dos
elementos de cada linha, a soma dos elementos de cada coluna e a soma dos
elementos das diagonais principal e secundária são todas iguais. */
