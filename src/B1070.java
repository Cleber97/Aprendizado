
import java.util.Scanner;

public class B1070 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int res = 0;
        int contagem = 0;

        for (int i = num; i <= 1000; i++) {
            res = i % 2;

            if (contagem == 6) {
                break;
            }


            if (res != 0) {
                contagem++;

              

                System.out.println(i + "");

            }
        }

        input.close();
    }

}
