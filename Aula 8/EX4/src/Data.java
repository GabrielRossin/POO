import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Data
{

        public static LocalDate somarDias(int dias)
        {
            LocalDate hoje = LocalDate.now();
            LocalDate dataIncrementada = hoje.plusDays(dias);
            return dataIncrementada;
        }

        public static String getDataFormatada(LocalDate data)
        {
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("d/M/uuuu", new Locale("pt", "BR"));
            return data.format(formatador);
        }

        public static String diaDaSemana(LocalDate data)
        {
            return data.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        }


}
