public class Felino extends Animais
{
    protected String rugir;
    protected String comer;
    protected String dormir;
    protected int number;


    public String getRugir()
    {
        return rugir;
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
           return "" + rugir + "";
       }


        return null;
    }
}
