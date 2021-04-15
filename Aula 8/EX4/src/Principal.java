import java.time.LocalDate;

public class Principal
{
    public static void main(String[] args)
    {
        int dias = 5;
        LocalDate data = Data.somarDias(dias);
        System.out.println("Daqui a " + dias + " dias será dia " + Data.getDataFormatada(data) + " (" + Data.diaDaSemana(data) + ")");

    }
}
