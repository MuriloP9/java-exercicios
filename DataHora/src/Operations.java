
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Operations {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // Converter o Instant para data local do computador
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        // Converter o Instant para data local de Portugal
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        // Converter o Instant para data-hora local do computador
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        // Converter o Instant para data-hora local de Portugal
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        // Obter dados de uma data-hora-local
        //Dia
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        //Mês
        System.out.println("d04 mês = " + d04.getMonthValue());
        //Ano
        System.out.println("d04 ano = " + d04.getYear());
        //Horário
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minuto = " + d05.getMinute());


        //Cálculos com data-hora
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextweekLocalDate = d04.plusDays(7);

        System.out.println("Semana passada: " + pastWeekLocalDate);
        System.out.println("Próxima semana: " + nextweekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("Semana passada: " + pastWeekLocalDateTime);
        System.out.println("Semana passada: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Semana passada: " + pastWeekInstant);
        System.out.println("Semana passada: " + nextWeekInstant);

        //Duração
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 = " + t1.toDays());
        System.out.println("t2 = " + t2.toDays());
        System.out.println("t3 = " + t3.toDays());
        System.out.println("t4 = " + t4.toDays());















        //Zone IDs disponíveis
        //for (String s : ZoneId.getAvailableZoneIds()){
            //System.out.println(s);


       //}
    }
}
