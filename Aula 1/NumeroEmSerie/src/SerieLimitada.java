package model;

public class SerieLimitada
{
    private static final int MAX_INSTANCIAS = 10;
    private static int NUMERO_SERIE = 0;

    public SerieLimitada()
    {
        instanciarNumeroNovo();

    }
    public int getNUMERO_SERIE()
    {
        return NUMERO_SERIE;
    }

    private int instanciarNumeroNovo()
    {
        if(NUMERO_SERIE < MAX_INSTANCIAS)
        {
            NUMERO_SERIE += 1;
        }
        return NUMERO_SERIE;
    }

    @Override
    public String toString()
    {
        return "N: " + getNUMERO_SERIE();
    }
}
