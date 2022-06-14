import java.util.Scanner;

public class Ex5 {
 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   
   float ex=1, numX, X, numDiv=1;

   System.out.println("Informe X");
   numX = in.nextFloat();
    X = numX;

 for (int i = 0; i < 10; i++) {
    ex = ex+(numX/numDiv);
     numX = numX*X;
     numDiv++;
 }
   System.out.println("Ex = "+ex);
 }   
}
