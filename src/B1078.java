import java.util.Scanner;

public class B1078 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        int res = 0;

        for (int i = 1; i <= 10; i++) {

            res = i * valor;

            System.out.println(i + " x " + valor + " = " + res);

        }

        input.close();
    }

}
