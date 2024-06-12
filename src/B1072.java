import java.util.Scanner;

public class B1072 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quant = input.nextInt();

        int res1 = 0;
        int res2 = 0;

        for (int i = 0; i < quant; i++) {

            int valor = input.nextInt();

            

                if (valor >= 10 && valor <= 20) {
                    res1++;

                } else
                    res2++;
            

        }

        System.out.println(res1 + " in");
        System.out.println(res2 + " out");

        input.close();
    }

}
