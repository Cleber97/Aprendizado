import java.util.Scanner;

public class B1075 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        // int num = 0;

        int res = 0;

        for (int i = 0; i <= 10000; i++) {

            res = i % valor;

            if (res == 2) {

                System.out.println(i);
            }

        }

        input.close();
    }

}
