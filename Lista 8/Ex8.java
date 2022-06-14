import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] valores = new int[10];
        int nEscolhido;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Informe um valor: ");
            valores[i] = in.nextInt();
        }
        System.out.println("Escolha um elemento: ");
        nEscolhido = in.nextInt();

        System.out.println(" ");

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > nEscolhido) {
                System.out.println("MAIORES : " + valores[i]);
            }
        }
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < nEscolhido) {
                System.out.println("MENORES : " + valores[i]);
            }
        }
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == nEscolhido) {
                System.out.println("IGUAIS : " + valores[i]);
            }
        }
    }
}
