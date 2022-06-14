import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    char[] letra = new char[3];
    // Palavra 'amo'

    for (int i = 0; i < letra.length; i++) {
      System.out.println("Informe as letras da palavra");
      letra[i] = in.next().charAt(0);
    }

    for (int i = 0; i < letra.length; i++) {
      System.out.print(letra[i]);
    }

  }
}
