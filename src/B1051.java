import java.util.Scanner;

public class B1051 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double imposto = 0.0;

    double salario = input.nextDouble();

    if (salario <= 2000.00) {
      System.out.println("Isento");

    } else if (salario <= 3000.00) {
      imposto = (salario - 2000.00) * 0.08;
      System.out.printf("R$ %.2f\n", imposto);

    } else if (salario <= 4500.00) {
      imposto = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
      System.out.printf("R$ %.2f\n", imposto);

    } else {
      imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);

    System.out.printf("R$ %.2f\n", imposto);

    }
    input.close();
  }

}
