import java.util.Scanner;

public class B1040 {

    public static void main(String[] args) {

        float a, b, c, d;

        Scanner valor = new Scanner(System.in);

        a = valor.nextFloat();
        b = valor.nextFloat();
        c = valor.nextFloat();
        d = valor.nextFloat();

        float media = ((a * 2) + (b * 3) + (c * 4) + (d * 1)) / 10;

        if (media >= 7) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        } else {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");

            float exame = valor.nextFloat();
            media = (media + exame) / 2;

            System.out.printf("Nota do exame: %.1f%n", exame);
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", media);

            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", media);
            }

        }
        valor.close();
    }

}
