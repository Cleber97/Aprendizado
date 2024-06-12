import java.util.Locale;
import java.util.Scanner;

public class B1064 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Definindo o Locale para US para garantir que o separador decimal seja ponto
        Locale.setDefault(Locale.US);

        double countPositivos = 0;
        double media = 0;

        for (int i = 0; i < 6; i++) {
            double valor = input.nextDouble();
            if (valor > 0) {
                countPositivos++;
                media += valor;
            }
        }

        if (countPositivos > 0) {
            media = media / countPositivos;
        }

        System.out.printf("%.0f valores positivos%n", countPositivos);
        System.out.printf("%.1f%n", media);
        input.close();
    }
}