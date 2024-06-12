import java.util.Scanner;

public class B1079 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quant = input.nextInt();
        double res = 0;

        for (int i = 0; i < quant; i++) {

            double valor = input.nextDouble();
            double valor2 = input.nextDouble();
            double valor3 = input.nextDouble();

            res = ((valor * 2) + (valor2 * 3) + (valor3 * 5)) / 10;

            System.out.printf("%.1f%n", res);

        }

        input.close();

    }

}
