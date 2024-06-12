import java.util.Scanner;

public class B1047 {

    public static int duracaoh;
    public static int duracaom;

    public static void teste (int minutofim, int minutoin) {


        if (minutofim == minutoin) {
            duracaom = 0;
        } else if (minutofim > minutoin) {
            duracaom = minutofim - minutoin;
            
        } else
        duracaoh = -1;
        duracaom = 60 - ( minutoin - minutofim);


    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio, minutoin, fim, minutofim;
        inicio = input.nextInt();
        minutoin = input.nextInt();
        fim = input.nextInt();
        minutofim = input.nextInt();

       

        

        if (fim > inicio || (fim == inicio && minutofim > minutoin)) {
            duracaoh = fim - inicio;
            duracaom = minutofim - minutoin;
            teste (minutofim,minutoin);
        } else {
            duracaoh = 24 - inicio + fim;
            if (minutofim < minutoin) {
                duracaoh = fim - inicio;
                duracaom = minutoin + minutofim;
                teste (minutofim,minutoin);

            } else {
                duracaom = minutofim - minutoin;
                teste (minutofim,minutoin);
            }

        }
        System.out.println("O JOGO DUROU " + duracaoh + " HORA(S) E " + duracaom + " MINUTO(S)");

        input.close();
    }

}
