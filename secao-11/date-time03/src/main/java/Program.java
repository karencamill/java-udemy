import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-03-04");
        LocalDateTime d05 = LocalDateTime.parse("2026-03-04T01:30:26");
        Instant d06 = Instant.parse("2026-03-04T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7); // subtraí 7 dias
        LocalDate nextWeekLocalDate = d04.plusDays(7); // acrescenta 7 dias
        LocalDate addAnoLocalDate = d04.plusYears(7); // adiciona ano

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalData = " + nextWeekLocalDate);
        System.out.println("addAnoLocalDate = " + addAnoLocalDate);

        System.out.println("----------------------------------");

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        LocalDateTime addAnoLocalDateTime = d05.plusYears(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("addAnoLocalDateTime = " + addAnoLocalDateTime);

        System.out.println("----------------------------------");

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // subtraí 7 dias
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // adiciona 8 dias

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        System.out.println("----------------------------------");

        // Calcula a duração entre duas data hora
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());




    }
}
