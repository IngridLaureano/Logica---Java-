import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] idades = new int[10];
    int maior = 0, menor = 0;

    for (int i = 0; i < idades.length; i++) {
      System.out.println("Informe a idade: ");
      idades[i] = in.nextInt();
    }

    for (int i = 0; i < idades.length; i++) {
      if (idades[i] >= 18) {
        maior++;
      } else if (idades[i] < 18) {
        menor++;
      }
    }
    System.out.println("Maiores de idade: " + maior);
    System.out.println("Menores de idade: " + menor);

  }
}
