import java.util.Scanner;

public class B1097 {
    
public static void main(String[] args) {
  Scanner input = new Scanner (System.in);


  for (int i =1; i <=10; i+=2){

    for (int j =7+i; j >=5+i; j -=1)

   System.out.println("I="+i+" J="+(j-1));


   input.close();


     }



}

}
