public class leoes extends Felino
{
    @Override
    public String getComer()
    {
        this.comer = "O Leão está comendo";
        this.number = 1;
        return super.getComer();
    }

    @Override
    public String getDormir()
    {
        this.number = 2;
        this.dormir = "O Leão está dormindo";
        return super.getDormir();
    }

    @Override
    public String getRugir()
    {
        this.number = 2;
        this.dormir = "O Leão está rugindo";
        return super.getRugir();
    }

}
