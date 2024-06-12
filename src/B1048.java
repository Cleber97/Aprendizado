import java.util.Locale;
import java.util.Scanner;

public class B1048 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        float salario, reajuste = 0, percentual = 0;

        salario = input.nextFloat();

        if (salario <= 400.00) {
            percentual = 15;
            reajuste = salario * percentual/100;
            salario = salario + reajuste;
        }

        else if (salario == 400.01 || salario <= 800.00) {

            percentual = 12;
            reajuste = salario * percentual/100;
            salario = salario + reajuste;
        }

        else if (salario == 800.01 || salario <= 1200.00) {

            percentual = 10;
            reajuste = salario * percentual/100;
            salario = salario + reajuste;
        }

        else if (salario == 1200.01 || salario <= 2000.00) {

            percentual = 7;
            reajuste = salario * percentual/100;
            salario = salario + reajuste;
        }

        else if (salario > 2000.00) {

            percentual = 4;
            reajuste = salario * percentual/100;
            salario = salario + reajuste;

        }

        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %.0f %%\n", percentual);

        input.close();

    } 

}
