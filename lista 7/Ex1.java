import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   
   int dia;

   System.out.println("Informe o dia :");
   dia = in.nextInt();

   switch (dia) {
       case 1,7:
         System.out.println("Fim de semana");  
           break;
        case 2, 3, 4, 5, 6:
          System.out.println("Dia util !");
            break;
       default:
        System.out.println("Dia invalido");
           break;
   }
  }  
}
