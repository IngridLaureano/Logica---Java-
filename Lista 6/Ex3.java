import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   
   float peso, altura, imc, pAbaixo=0, pNormal=0, pSobrepeso=0, pObesidade1=0, pObesidade2=0, pObesidade3=0;

   do {
       System.out.println("Informe sua altura: ");
       altura = in.nextFloat();
       if (altura==0) 
       break;
       System.out.println("Informe seu peso: ");
       peso = in.nextFloat();

       imc = peso/(altura*altura);

       if (imc<18.5) {
           pAbaixo++;
       } else if (imc>=18.5f && imc<=24.9f){
           pNormal++;
       } else if (imc>=25 && imc<=29.9f){
           pSobrepeso++;
       } else if (imc>=30 && imc<=34.9f){
           pObesidade1++;
        }else if (imc>=35 && imc<=39.9f){
           pObesidade2++;
        }else if (imc>=40){
          pObesidade3++; 
    }
   } while (altura>0);

   System.out.printf("%.0f pessoas abaixo do peso\n", pAbaixo);
   System.out.printf(" %.0f pessoas com peso normal\n", pNormal);
   System.out.printf(" %.0f pessoas com sobrepeso\n", pSobrepeso);
   System.out.printf(" %.0f pessoas com obesidade grau 1\n", pObesidade1);
   System.out.printf(" %.0f pessoas com obesidade grau 2\n", pObesidade2);
   System.out.printf(" %.0f pessoas com obesidade grau 3\n", pObesidade3);

  }
}
