import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    float[] valores = new float[10];
    float media = 0;

    for (int i = 0; i < valores.length; i++) {
      System.out.println("Informe os valores: ");
      valores[i] = in.nextFloat();
      media = valores[i] + media;

    }
    media = media / 10;

    System.out.println("A MEDIA EH: " + media);
  }
}
