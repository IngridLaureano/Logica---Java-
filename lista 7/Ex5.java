import java.util.Scanner;

public class Ex5 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    float anuidade, juros, meses=0;

    System.out.println("Informe o valor da anuidade: ");
    anuidade = in.nextFloat();

    System.out.println("Informe os meses de atraso: ");
    meses = in.nextFloat();

    while (meses>0) {
     juros = anuidade*0.05f;
     anuidade = anuidade + juros;
     meses--;   
    }

    System.out.printf("Valor a pagar: %.2f",anuidade);
   } 
}
