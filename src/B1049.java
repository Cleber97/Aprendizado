import java.util.Scanner;

public class B1049 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String palavra1, palavra2, palavra3;
        // String
        // vertebrado,ave,carnivoro,onivoro,mamifero,herbivoro,invertebrado,inseto,hematofago,anelideo;

        palavra1 = input.next();
        palavra2 = input.next();
        palavra3 = input.next();

        if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("carnivoro")) {

            System.out.println("aguia");

        } else if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("onivoro")) {

            System.out.println("pomba");

        } else if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("onivoro")) {

            System.out.println("homem");

        } else if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("herbivoro")) {

            System.out.println("vaca");

        } else if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("hematofago")) {

            System.out.println("pulga");

        } else if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("herbivoro")) {

            System.out.println("lagarta");

        } else if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("hematofago")) {

            System.out.println("sanguessuga");

        } else if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("onivoro")) {

            System.out.println("minhoca");

        }
        /*

        if (s1.equals("vertebrado")) {
            // vertebrado
            if (s2.equals("ave")) {
                // ave
                if (s3.equals("carnivoro")) {
                    // carnivoro
                    System.out.println("aguia");
                } else {
                    // onivoro
                    System.out.println("pomba");
                }
            } else {
                // mamifero
                if (s3.equals("onivoro")) {
                    // onivoro
                    System.out.println("homem");
                } else {
                    // herbivoro
                    System.out.println("vaca");
                }
            }
        } else {
            // invertebrado
            if (s2.equals("inseto")) {
                // inseto
                if (s3.equals("hematofago")) {
                    // hematofago
                    System.out.println("pulga");
                } else {
                    // herbivoro
                    System.out.println("lagarta");
                }
            } else {
                // anelideo
                if (s3.equals("hematofago")) {
                    // hematofago
                    System.out.println("sanguessuga");
                } else {
                    // onivoro
                    System.out.println("minhoca");
                }
            }
        }*/
 input.close();
    }

}