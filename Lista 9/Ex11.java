import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[][] vendas = new float[12][4];
        float totalM=0, total=0;

        System.out.println("Informe os valores:");
        for (int i = 0; i < vendas.length; i++) {
            System.out.println("Mes :"+(i+1));
            for (int j = 0; j < vendas[i].length; j++) {
                vendas[i][j] = in.nextFloat();

            }
        }
        int opcao;
        do {
          System.out.println("  Opcoes  ");  
          System.out.println("1 - Total vendido em cada mês do ano| 2 - Total vendido em cada semana durante todo o ano | 3 - Total vendido no ano. ");
          opcao = in.nextInt();
          if (opcao == 1) {
            for (int i = 0; i < vendas.length; i++) {
                for (int j = 0; j < vendas[i].length; j++) {
                    totalM+=vendas[i][j];
                }
                System.out.println("O TOTAL DE VENDAS NO MES "+(i+1)+" : "+totalM);
                totalM = 0;
            }  
          }
          if (opcao == 2) {
            for (int i = 0; i < vendas.length; i++) {
                for (int j = 0; j < vendas[i].length; j++) {
                System.out.println("O TOTAL DE VENDAS NA SEMANA "+(j+1)+" do mes"+(i+1)+" : "+vendas[i][j]);
                    
                }
            }  
          }
          if (opcao == 3) {
            for (int i = 0; i < vendas.length; i++) {
                for (int j = 0; j < vendas[i].length; j++) {
                    total += vendas[i][j];
                }
            }
            System.out.println("Total de vendas no ano: "+total);
          }
        } while (opcao>0);

    }
}
/* Criar um algoritmo que carregue uma matriz 12 x 4 com os valores das vendas de
uma loja, em que cada linha represente um mês do ano, e cada coluna, uma
semana do mês. Para fins de simplificação considere que cada mês possui somente
4 semanas. Calcule e imprima:
- Total vendido em cada mês do ano;
- Total vendido em cada semana durante todo o ano;
- Total vendido no ano. */