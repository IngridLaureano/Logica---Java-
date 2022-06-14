import java.util.Scanner;

public class Ex11 {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

    int lin, col;

    System.out.println("Informe as linhas: ");
    lin = in.nextInt();
    System.out.println("Informe as colunas: ");
    col = in.nextInt();

    for ( int i=0 ; i <col; i++) {
        System.out.printf(" -");       
     }
     System.out.println("\n"); 
     for ( int j =0 ; j <lin; j++) {
        System.out.println("|\t|"); 
     } 
     for ( int i=0 ; i <col; i++) {
      System.out.printf(" -");        
   }
   
   } 
}