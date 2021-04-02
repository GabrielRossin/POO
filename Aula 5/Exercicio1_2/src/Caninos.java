public class Caninos extends Animais
{
    protected String uivar;
    protected String comer;
    protected String dormir;
    protected int number;


    public String getUivar()
    {
        return uivar;
    }

    @Override
    public String getComer()
    {
        return comer;
    }

    @Override
    public String getDormir()
    {
        return dormir;
    }

    @Override
    public String toString()
    {
        if(number == 1)
        {
            return "" + comer +"";

        }
        if(number == 2)
        {
            return "" + dormir + "";
        }
        if(number == 3)
        {
            return "" + uivar + "";
        }


        return null;
    }
}
