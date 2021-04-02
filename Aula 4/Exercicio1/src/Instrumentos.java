public class Instrumentos implements TocarOsInstrumentos
{
    protected String sons;

    public String getSons()
    {
        return sons;
    }

    public String tocar()
    {
        return getSons();
    }
}
