import java.util.Scanner;

public class B1071 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int num2 = input.nextInt();
        int valor = 0;

        int res = 0;

        for (int i = num2 +1; i < num; i++) {
            res = i % 2;

            if (res != 0) {
                valor += i;

            }
        }

        System.out.println(valor + "");

        input.close();
    }

}
