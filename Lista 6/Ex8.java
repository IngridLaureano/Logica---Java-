import java.util.Scanner;

public class Ex8 {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  
int num=0, num1;
 do {
     num1 = num;
     System.out.println("Informe um numero");
     num = in.nextInt();
     if (num>(num1*2) && num1>0) {
       System.out.println("Fim");
       num=0;  
     }  
     
     
 } while (num>0);

 }   
}
