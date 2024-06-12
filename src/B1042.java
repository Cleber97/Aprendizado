import java.util.Scanner;

public class B1042 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);  // a 15 b 12 c 20 
        }

        if (a < b && a > c ) {
            System.out.println(a);
        } else if (b < a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        input.close();
        
    }

}