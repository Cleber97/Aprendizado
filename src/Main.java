import java.util.Scanner;

public class Main {

    public static int duracaoh = 24;
    public static int duracaom;

    public static void teste(int minutofim, int minutoin) {

        if (minutofim == minutoin) {
            duracaoh = 24;
            duracaom = 0;
        }

       else  if (minutofim > minutoin) {
            duracaom = minutofim - minutoin;

        } else {
            duracaoh = duracaoh - 1;
            duracaom = 60 - (minutoin - minutofim);
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio, minutoin, fim, minutofim;
        inicio = input.nextInt();
        minutoin = input.nextInt();
        fim = input.nextInt();
        minutofim = input.nextInt();

        if (inicio == fim && minutofim == minutoin) {
            duracaoh = 24 - inicio + fim;
        }
        if (fim > inicio && minutofim > minutoin) {
            duracaoh = 24 + inicio - fim;
            duracaom = minutofim - minutoin;
            teste(minutofim, minutoin);

        }

        else {

            duracaoh =   fim - inicio;
            duracaom = minutoin - minutofim;
            teste(minutofim, minutoin);

        }

        System.out.println("O JOGO DUROU " + duracaoh + " HORA(S) E " + duracaom + " MINUTO(S)");

    }

}
