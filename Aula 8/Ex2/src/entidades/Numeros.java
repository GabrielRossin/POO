package entidades;

public class Numeros
{
    public static boolean isNumber(String num)
    {
        try
        {
            Integer.parseInt(num);
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }
}
