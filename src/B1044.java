import java.util.Scanner;

public class B1044 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        //int resultado = (a % b) % a;

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");

        } else {
            System.out.println("Nao sao Multiplos");

        }

        input.close();
    }

}
