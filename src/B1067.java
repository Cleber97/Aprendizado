import java.util.Scanner;

public class B1067 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

       int  res = 0;


        for (int i = 0; i <= num; i++) {

           res=  i % 2;
            if (res !=0) {
                System.out.println(i+"");
            }



        }
        input.close(); 
    }

}
