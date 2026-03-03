import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-03-03"); //Converte a String "2026-03-03" para um objeto LocalDate.
        LocalDateTime d05 = LocalDateTime.parse("2026-03-03T01:30:26"); //Converte a String para LocalDateTime.
        Instant d06 = Instant.parse("2026-03-03T01:30:26Z"); //Converte para Instant. Horário global

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //Pega o horário e a data do fuso horario e transforma para data e hora local
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // Pega o horário e a data de Londres e transforma para Portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth()); //mostra o dia
        System.out.println("d04 dia da semana = " + d04.getDayOfWeek()); //mostra o nome do dia
        System.out.println("d04 dia do ano = " + d04.getDayOfYear()); //mostra o dia do ano. exemplo: 62
        System.out.println("d04 nome do mês = " + d04.getMonth()); //mostra o nome do mês
        System.out.println("d04 data do mês = " + d04.getMonthValue()); //mostra o número do mês
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());

    }
}
