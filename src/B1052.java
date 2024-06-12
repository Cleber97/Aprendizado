import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B1052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
Map<Integer, String> nrmes = new HashMap<>();

nrmes.put(1, "January");
nrmes.put(2, "February");
nrmes.put(3, "March");
nrmes.put(4, "April");
nrmes.put(5, "May");
nrmes.put(6, "June");
nrmes.put(7, "July");
nrmes.put(8, "August");
nrmes.put(9, "September");
nrmes.put(10, "October");
nrmes.put(11, "November");
nrmes.put(12, "December");

int nr = input.nextInt();


    System.out.println( nrmes.get(nr));

input.close();

    }

}
