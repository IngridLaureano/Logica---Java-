import java.util.Scanner;

public class Ex2 {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int num=0, num2=1;
 String resposta="";
 
 do {
  System.out.println("Informe um numero: ");
  num = in.nextInt();
  while (num<0) {
    System.out.println("Informe novamente o numero");
    num = in.nextInt();
  }  
  while (num2<num) {
    if (num2%2==0) {
      System.out.println("Numero: "+num2);
    }
    num2++;
  }
  num2 = 1;
  System.out.println("Deseja continuar? sim ou nao.");
  resposta = in.next();
  
 } while (resposta.equals("sim"));
 }   
}
