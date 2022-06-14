import java.util.Scanner;

public class Ex16 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] v1, v2, v3;
    v1 = new int[5];
    v2 = new int[5];
    v3 = new int[10];

    System.out.println("VETOR 1");
    for (int i = 0; i < v1.length; i++) {
      System.out.println("valor: ");
      v1[i] = in.nextInt();  
    }    
    System.out.println("VETOR 2");
    for (int i = 0; i < v2.length; i++) {
        System.out.println("valor: ");
        v2[i] = in.nextInt();  
      }
      
      for (int i = 0; i < v1.length; i++) {
        v3[i*2] = v1[i];
      }
      for (int i = 0; i < v2.length; i++) {
        v3[i*2+1] = v2[i];
      }

      for (int i = 0; i < v3.length; i++) {
        System.out.print(v3[i]+" - ");
      }
   } 
}
/*Dado dois vetores de tamanho 5 e com valores ordenados, criar um vetor de
tamanho 10 com todos elementos ordenados. O programa deve receber 5 valores do
primeiro vetor, 5 valores do segundo vetor e, finalmente, mostrar o vetor final com 10
posições com os valores ordenados. Ex: v1 = [1, 3, 5, 7, 9] e v2 = [2, 4, 6, 8, 10]. O
programa deverá mostrar o vetor [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] */ 
