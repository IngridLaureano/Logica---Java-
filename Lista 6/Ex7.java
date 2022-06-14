import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float salario, salarioMM = 0, salarioMF = 0, mediaM = 0, mediaF = 0, pF = 0, pM = 0;
        String sexo, maiorM="", maiorF="", nome;

        do {
            System.out.println("Para finalizar escreva 'SAIR'");
            System.out.println("Nome:");
            nome = in.next();
            if (nome.equals("SAIR"))
                break;
            System.out.println("Sexo: ");
            sexo = in.next();
            System.out.println("Salario: ");
            salario = in.nextFloat();

            if (sexo.equals("F")) {
                pF++;
                mediaF = salario + mediaF;
                if (salario > salarioMF) {
                    salarioMF = salario;
                    maiorF = nome;
                }

            } else if (sexo.equals("M")) {
                pM++;
                mediaM = mediaM + salario;
                if (salario > salarioMM) {
                    salarioMM = salario;
                    maiorM = nome;
                }
            }
        } while (!nome.equals("SAIR"));

        mediaF = mediaF/pF;
        mediaM = mediaM/pM;

        System.out.println("MAIOR SALARIO MASC. : "+salarioMM);
        System.out.println("NOME : "+maiorM);
        System.out.println("MAIOR SALARIO FEM. : "+salarioMF);
        System.out.println("NOME : "+maiorF);
        System.out.println("MEDIA SALARIO MASC. : "+mediaM);
        System.out.println("MEDIA SALARIO FEM. : "+mediaF);

    }
}
