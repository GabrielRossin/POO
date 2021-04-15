public class Main
{
    public static void main(String[] args)
    {
        Corrente c = new Corrente(100,200);
        Poupanca p = new Poupanca(200);
        try
        {
            c.Deposito(-100);
            c.Saque(500);
        }
        catch (Exception e)
        {
            throw new IllegalArgumentException("Valor inválido");
        }

    }
}
