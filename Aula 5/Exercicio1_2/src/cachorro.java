public class cachorro extends Caninos implements AnimaisDomesticos
{
    @Override
    public String getComer()
    {
        this.comer = "O cachorro está comendo";
        this.number = 1;
        return super.getComer();
    }

    @Override
    public String getDormir()
    {
        this.number = 2;
        this.dormir = "O cachorro está dormindo";
        return super.getDormir();
    }

    @Override
    public String getUivar()
    {
        this.number = 2;
        this.dormir = "O cachorro está uivando";
        return super.getUivar();
    }

    @Override
    public void brincar()
    {
        System.out.println("O cachorro está brincando");
    }

    @Override
    public void acariciar()
    {
        System.out.println("Você está acariciando o cachorro");
    }
}
