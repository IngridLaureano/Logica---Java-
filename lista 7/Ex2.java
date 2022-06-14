import java.util.Scanner;

public class Ex2 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int mes;

       System.out.println("Informe o mes :");
       mes = in.nextInt();
       switch (mes) {
           case 1,3,5,7,8,10,12:
           System.out.println("Esse mes possui 31 dias");
           break;
           case 4,6,9,11:
           System.out.println("Esse mes possui 30 dias");
           break;
           case 2:
            System.out.println("Esse mes possui 28 dias e 29 em anos Bissextos");
            break;
           default:
           System.out.println("Mes invalido !!!");
               break;
       }
   } 
}
