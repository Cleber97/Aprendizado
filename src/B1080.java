import java.util.Scanner;

public class B1080 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] numeros = new int[100];

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = input.nextInt();
    }



    int max = numeros [0];
    int pos = 0;

    for (int i = 1; i <numeros.length; i++) {

      if (numeros[i]>max) {
        max = numeros[i];
        pos = i+1;
      }

    }

    System.out.println(max);
    System.out.println(pos);

    input.close();
  }

}