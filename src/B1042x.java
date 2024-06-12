import java.util.Scanner;

public class B1042x {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int vetor[] = { a, c, b };

        vetor [0] = a;
        vetor [1] = b;
        vetor [2] = c;

        int aux;

        for (int i = 0; i < vetor.length; ++i) {
            for (int j = 0; j < vetor.length - 1; ++j) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < vetor.length; ++i) {
            System.out.println(vetor[i] + "");
        }

        System.out.println("");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        input.close();
    }
}