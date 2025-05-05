import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {

        ZonedDateTime horario = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));

        System.out.println("\nHora: " + horario.getHour());

        if(horario.getHour() > 3 & horario.getHour() < 12){
            System.out.println("\nBom dia!");
        } else if(horario.getHour() < 18) {
            System.out.println("\nBoa tarde!");
        } else {
            System.out.println("\nBoa noite!");
        }

    }
}
