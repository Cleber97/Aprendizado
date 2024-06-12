import java.util.Scanner;

public class B1046 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio, fim;
        inicio = input.nextInt();
        fim = input.nextInt();

        if (inicio == fim) {

            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (inicio > fim) {
            System.out.println("O JOGO DUROU " + (24 - inicio + fim) + " HORA(S)");

        } else {
            System.out.println("O JOGO DUROU " + (fim - inicio) + " HORA(S)");
        }

        input.close();
    }
}
