import java.util.Scanner;

public class Ex10 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int numX, numY, numZ;
    System.out.println("Informe o n linhas");
    numX = in.nextInt();
    for (numY = 1; numY<=numX; numY++) {
        
        for (numZ = 1; numZ<=numY; numZ=numZ+1) {
            System.out.printf("*");
            System.out.printf("\n");

        }
    }
   } 
}
