import java.util.Scanner;

public class B1065 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int par = 0;

        for (int i = 1; i <= 5; i++) {

            int valor = input.nextInt();
            int resultado = 0;

            resultado = valor % 2;

            if (resultado == 0) {
                par++;

            }

        }

        System.out.printf("%d valores pares%n", par);

        input.close();
    }

}
