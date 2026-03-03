import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-03-03"); //Converte a String "2026-03-03" para um objeto LocalDate.
        LocalDateTime d05 = LocalDateTime.parse("2026-03-03T01:30:34"); //Converte a String para LocalDateTime.
        Instant d06 = Instant.parse("2026-03-03T01:30:34Z"); //Converte para Instant. Horário global

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Cria um formatador para dia, mês e ano
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //Dia, mês, ano e hora
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Cria formatador com fuso horário do seu sistema.

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));

        System.out.println("d06 = " + fmt3.format(d06));

    }
}
