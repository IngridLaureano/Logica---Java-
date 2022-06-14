import java.util.Scanner;

public class Ex4 {
   public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   
   int idade, valor=0;
   System.out.println("Informe a idade: ");
   idade = in.nextInt();

    if (idade<10) {
      valor = 100+80;   
    } else if (idade>=10 && idade<=39) {
      valor = 100+50;  
    } else if (idade>=40 && idade<=60) {
      valor = 100+95;  
    } else if (idade>60) {
      valor = 100+130;  
    }

    System.out.println("O valor a pagar eh: "+valor+" R$");
   } 
}
