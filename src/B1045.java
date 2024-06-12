import java.util.Scanner;

public class B1045 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double[] vetor = new double[3];
    double aux;

    // vetor [0] = input.nextDouble();
    // vetor [1]= input.nextDouble();
    // vetor [2]= input.nextDouble();
    // primeiro for esta apenas preenchendo o vetor a cima.
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = input.nextDouble();

    }

    for (int i = 0; i < vetor.length; ++i) {

      for (int j = 0; j < vetor.length - 1; ++j) {

        if (vetor[j] < vetor[j + 1]) {
          aux = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = aux;
        }

      }

    }

    if (vetor[0] >= vetor[1] + vetor[2]) {
      System.out.println("NAO FORMA TRIANGULO");

    } else {

      if (Math.pow(vetor[0], 2) == Math.pow(vetor[1], 2) + Math.pow(vetor[2], 2)) {
        System.out.println("TRIANGULO RETANGULO");
      

      }
      else if  (Math.pow(vetor[0], 2) > (Math.pow(vetor[1],2) + Math.pow(vetor[2], 2))) {
        System.out.println("TRIANGULO OBTUSANGULO");

      } else {
        System.out.println("TRIANGULO ACUTANGULO");
      }

      if (vetor[0] == vetor[1] && vetor[0] == vetor[2]) {
        System.out.println("TRIANGULO EQUILATERO");

      } if ((vetor[0] == vetor[1] && vetor[0] != vetor[2]) || (vetor[0] == vetor[2] && vetor[0] != vetor[1]) || (vetor[1] == vetor[2] && vetor[1] != vetor[0])) {

        System.out.println("TRIANGULO ISOSCELES");

      }

    }

    input.close();
  }
}
