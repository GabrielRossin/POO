public class lobos extends Caninos
{
    @Override
    public String getComer()
    {
        this.comer = "O Lobo está comendo";
        this.number = 1;
        return super.getComer();
    }

    @Override
    public String getDormir()
    {
        this.number = 2;
        this.dormir = "O Lobo está dormindo";
        return super.getDormir();
    }

    @Override
    public String getUivar()
    {
        this.number = 2;
        this.dormir = "O Lobo está uivando";
        return super.getUivar();
    }
}
