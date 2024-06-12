import java.util.Locale;
import java.util.Scanner;

public class B1002 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double n = 3.14159;
        double raio = input.nextDouble();
        double area = Math.pow(raio, 2) * n;

        System.out.printf("A=%.4f", area);
        input.close();
    }

}
