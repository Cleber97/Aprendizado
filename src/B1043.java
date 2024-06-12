import java.util.Scanner;

public class B1043 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            double perimetro = (a + b + c);
            System.out.printf("Perimetro = %.1f\n" , perimetro);

        } else {
            double area2 = ((a + b) * (c)) / 2;
            System.out.printf("Area = %.1f\n" , area2);

            input.close();
        }

    }

}
