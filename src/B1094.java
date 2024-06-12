import java.util.Scanner;

public class B1094 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int c = 0;
        int r = 0;
        int s = 0;

        int quant = input.nextInt();

        for (int i = 0; i < quant; i++) {

            int valor = input.nextInt();
            /*
             * a variavel "char" lê a string e o comando ".charAt(0);" determina que a
             * primeira string que entrar ocupa a opsição 0
             */
            char tipo = input.next().charAt(0);

            total += valor;

            if (tipo == 'C') {

                c += valor;
            } else if (tipo == 'R') {

                r += valor;

            } else if (tipo == 'S') {

                s += valor;
            }

        }

        double porc = (double) c/total * 100;
        double porr = (double)r/total * 100;
        double pors = (double)s/total * 100;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: "+c);
        System.out.println("Total de ratos: "+r);
        System.out.println("Total de sapos: "+s);

        System.out.printf("Percentual de coelhos: %.2f %%\n",porc);
        System.out.printf("Percentual de ratos: %.2f %%\n",porr);
        System.out.printf("Percentual de sapos: %.2f %%\n",pors);
        input.close();

    }

}
