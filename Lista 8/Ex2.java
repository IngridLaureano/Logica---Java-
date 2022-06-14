import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe a quantidades de vezes que caiu o lado " + (i + 1));
            numeros[i] = in.nextInt();
        }

        System.out.println("Resultado: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("lado " + (i + 1) + ": " + numeros[i] + " vezes");
        }

    }
}
