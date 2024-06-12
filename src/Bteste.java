import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.Duration;
public class Bteste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String di, hi, df, hf;

        di = input.nextLine().replaceAll("[^\\d]", "");
        hi = input.nextLine().replaceAll("[^\\d:]", ""); // Manter os ':' para dividir a hora
        df = input.nextLine().replaceAll("[^\\d]", "");
        hf = input.nextLine().replaceAll("[^\\d:]", ""); // Manter os ':' para dividir a hora

        String[] partes = hi.split(":");
        LocalDate dataInicio = LocalDate.of(2020, 1, Integer.parseInt(di));
        LocalTime horaInicio = LocalTime.of(Integer.parseInt(partes[0]), Integer.parseInt(partes[1]), Integer.parseInt(partes[2]));
        LocalDateTime dataHoraInicio = dataInicio.atTime(horaInicio);

        String[] partes2 = hf.split(":");
        LocalDate dataFinal = LocalDate.of(2020, 1, Integer.parseInt(df));
        LocalTime horaFinal = LocalTime.of(Integer.parseInt(partes2[0]), Integer.parseInt(partes2[1]), Integer.parseInt(partes2[2]));
        LocalDateTime dataHoraFinal = dataFinal.atTime(horaFinal);

        Duration duracao = Duration.between(dataHoraInicio, dataHoraFinal);
        long diferencaDias = duracao.toDays();
        long diferencaHoras = duracao.toHoursPart();
        long diferencaMinutos = duracao.toMinutesPart();
        long diferencaSegundos = duracao.toSecondsPart();

        System.out.println(diferencaDias + " dia(s)");
        System.out.println(diferencaHoras + " hora(s)");
        System.out.println(diferencaMinutos + " minuto(s)");
        System.out.println(diferencaSegundos + " segundo(s)");

    }
}


