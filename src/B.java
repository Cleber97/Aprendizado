import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        // Criando e iniciando a thread para o primeiro loop
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread 1 - i = " + i);
            }
        });

        // Criando e iniciando a thread para o segundo loop
        Thread thread2 = new Thread(() -> {
            for (int j = 1; j <= 3; j++) {
                System.out.println("Thread 2 - j = " + j);
            }
        });

        thread1.start();
        thread2.start();
    }
}