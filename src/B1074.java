import java.util.Scanner;

public class B1074 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quant  = input.nextInt();
       

        for (int i = 0; i < quant; i++) {
            

            int valor = input.nextInt();

            

            if (valor == 0) {
                System.out.println("NULL");
            }

           else{ if (valor % 2 == 0) {
                System.out.print("EVEN ");
            }

            if (valor % 2 != 0) {
                System.out.print("ODD ");
            }

            if (valor > 0) {
                System.out.println("POSITIVE");
            }

            if (valor < 0) {
                System.out.println("NEGATIVE");
            }
           
        }

        }




        input.close();
    }

}

 /*OUU

int quant  = input.nextInt();
       

for (int i = 0; i < quant; i++) {
   

    int valor = input.nextInt();

 

    if (valor == 0) {
        System.out.println("NULL");
    } else { 

    if (valor % 2 == 0) {
        System.out.print("EVEN ");
    }

    else  {
        System.out.print("ODD ");
    }

    if (valor > 0) {
        System.out.println("POSITIVE");
    }

     else {
        System.out.println("NEGATIVE");
    }*/