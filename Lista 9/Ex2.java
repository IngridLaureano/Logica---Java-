import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int tam, matQuadrada[][];

    System.out.println("Informe o tamanho da matriz: ");
    tam = in.nextInt();
    matQuadrada = new int[tam][tam];

    for (int i = 0; i < matQuadrada.length; i++) {
        
        for (int j = 0; j < matQuadrada[i].length; j++) {
          if (i%2==0 && j%2==1) {
            matQuadrada[i][j] = 1;
          }
          else if (i%2==1 && j%2==0) {
            matQuadrada[i][j] = 1;
          }
        }
    }

    for (int i = 0; i < matQuadrada.length; i++) {
        
        for (int j = 0; j < matQuadrada[i].length; j++) {
          System.out.print(matQuadrada[i][j]+" ");
        }
        System.out.println();
    }

  }  
}
/*Crie um programa que leia o tamanho de uma matriz quadrada e apresente um
padrão de tabuleiro de xadrez alternando entre 0’s e 1’s. Por exemplo, caso o
usuário digite 4. A seguinte matriz deve ser criada automaticamente: */