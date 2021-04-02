public class gatos extends Felino implements AnimaisDomesticos
{

    @Override
    public String getComer()
    {
        this.comer = "O gato está comendo";
        this.number = 1;
        return super.getComer();
    }

    @Override
    public String getDormir()
    {
        this.number = 2;
        this.dormir = "O gato está dormindo";
        return super.getDormir();
    }

    @Override
    public String getRugir()
    {
        this.number = 2;
        this.dormir = "O gato está rugindo";
        return super.getRugir();
    }

    @Override
    public void brincar()
    {
        System.out.println("O gato está brincando");
    }

    @Override
    public void acariciar()
    {
        System.out.println("Você está acariciando o gato");
    }
}
