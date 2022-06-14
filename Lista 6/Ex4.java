import java.util.Scanner;

public class Ex4 {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 
 float num, E=1;

 System.out.println("Informe o numeor de N");
 num = in.nextFloat();

 while (num>0) {
     E = E+(1/num);
     num--; 
 }
    System.out.println("E = "+E);
 }   
}
