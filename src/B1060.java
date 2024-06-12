import java.util.Scanner;

public class B1060 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c, d, e, f, resultado;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        if (a >= 0) {

            a = 1;
        } else
            a = 0;
        if (b >= 0) {

            b = 1;
        } else
            b = 0;
        if (c >= 0) {

            c = 1;
        } else
            c = 0;
        if (d >= 0) {

            d = 1;
        } else
            d = 0;
        if (e >= 0) {

            e = 1;
        } else
            e = 0;
        if (f >= 0) {

            f = 1;
        } else
            f = 0;

        resultado = a + b + c + d + e + f;

        System.out.printf("%.0f valores positivos%n", resultado); // como a formatação começou primeiro o "resultado
                                                                  // fica na frente da impressão"
        // System.out.printf(" valores positivos %.0f%n", resultado);
        input.close();
    }

}
