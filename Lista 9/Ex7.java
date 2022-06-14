import java.util.Scanner;

public class Ex7 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int[][] matriz = new int[5][5];

      for (int i = 0; i < matriz.length; i++) {
         System.out.println("Informe os valores: ");
         for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = in.nextInt();
         }
      }
      System.out.println("Escolha um valor: ");
      int valor = in.nextInt();

      int soma = 0, achou = 0;
      System.out.println("RESULTADO: ");
      for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz.length; j++) {
            soma = soma+matriz[i][j];
         }
         if (soma == valor) {
            System.out.println("Valor encontrado na L " + i);
            achou++;
         } 
         soma = 0;
      }
         if (achou==0) {
            System.out.println("Nenhuma linha de soma encontrada !!");
         }
   }
}
/* Desenvolva um programa que leia uma matriz de tamanho 5x5. A partir daí o
programa deve perguntar ao usuário um valor X qualquer e o programa deve
informar se a soma dos elementos de alguma das linhas resulta neste valor X. */
