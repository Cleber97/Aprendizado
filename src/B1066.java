import java.util.Scanner;

public class B1066 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int par = 0;
        int imp = 0;
        int pos = 0;
        int neg = 0;

        for (int i = 0; i <= 4; i++) {

            int valor = input.nextInt();

            if (valor % 2 == 0) {
                par++;
            }

            if (valor % 2 != 0) {
                imp++;
            }

            if (valor > 0) {
                pos++;
            }

            if (valor < 0) {
                neg++;
            }

        }

        System.out.printf("%d valor(es) par(es)%n" , par);
        System.out.printf("%d valor(es) impar(es)%n" , imp);
        System.out.printf("%d valor(es) positivo(s)%n" , pos);
        System.out.printf("%d valor(es) negativo(s)%n" , neg);

        input.close();
    }

}
