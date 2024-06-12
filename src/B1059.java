import java.util.Scanner;

public class B1059 {
    public static void main(String[] args) {
        
        Scanner  input= new Scanner(System.in);
    
       // int resultado=0, numero = 100;


     //  resultado = numero % 2 == 0;

     for (int num = 1; num <= 100;  num++) {
      int resultado = 0;
      resultado = num % 2;

      if (resultado == 0) {
        System.out.println( num+"");
      }
       
     }





 input.close();
    }

}
