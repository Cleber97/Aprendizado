import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B1050 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, String> dddCidades = new HashMap<>();


        dddCidades.put(11, "São Paulo");
        dddCidades.put(21, "Rio de Janeiro");
        dddCidades.put(31, "Belo Horizonte");
        dddCidades.put(41, "Curitiba");
        dddCidades.put(51, "Porto Alegre");
        dddCidades.put(61, "Brasília");
        dddCidades.put(71, "Salvador");
        dddCidades.put(81, "Recife");
        dddCidades.put(91, "Belém");

        int ddd = input.nextInt();


        if (dddCidades.containsKey(ddd)) {
            System.out.println("O DDD " + ddd + " corresponde à cidade: " + dddCidades.get(ddd));
        } else {
            System.out.println("DDD não cadastrado");

       // String ddd = input.next();

      //.  if (ddd == 11) {
       //     System.out.println("Sao Paulo");
       // } else if (ddd == 61) {
        //    System.out.println("Brasilia");
       // } else if (ddd == 71) {
        //    System.out.println("Salvador");
        //} else if (ddd == 21) {
        //    System.out.println("Rio de Janeiro");
        //} else if (ddd == 32) {
        //    System.out.println("Juiz de Fora");
        //} else if (ddd == 19) {
        //    System.out.println("Campinas");
       // } else if (ddd == 27) {
       //     System.out.println("Vitoria");
      //  } else if (ddd == 31) {
       //     System.out.println("Belo Horizonte");
       // } else
      //      System.out.println("DDD nao cadastrado");
input.close();
  
      }
    }
    

}
