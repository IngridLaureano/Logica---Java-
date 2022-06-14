import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] candidatos = new int[5];
        int voto = 0;
        while (voto >= 0) {
            System.out.println("Informe seu voto: ");
            voto = in.nextInt();

            switch (voto) {
                case 1:
                    candidatos[0] += 1;
                    break;
                case 2:
                    candidatos[1] += 1;
                    break;
                case 3:
                    candidatos[2] += 1;
                    break;
                case 4:
                    candidatos[3] += 1;
                    break;
                case 5:
                    candidatos[4] += 1;
                    break;

            }

        }
        System.out.println("RESULTADO");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("CANDIDATO " + (i + 1) + " : " + candidatos[i]);
        }

    }
}
