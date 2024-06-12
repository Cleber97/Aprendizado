import java.util.Scanner;

public class B1073 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int num = input.nextInt();
       int res = 0;

        for (int i = 1; i <= num; i++) {

           int valor =0;
           valor = i % 2;

           if( valor ==0) {
            res= i*i;

            System.out.println(i + "^2 = " + res );

           }


        }

       // System.out.println(res);

        input.close();
    }

}
