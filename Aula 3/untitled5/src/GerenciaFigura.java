public class GerenciaFigura extends Figura
{

    public void imprimeArea()
    {
        System.out.println("Area:" + this.getArea());
    }
    public void imprimePerimetro()
    {
        System.out.println("Perimetro: " + this.getPerimeter() );
    }
    public void imprimeVolume()
    {
        System.out.println("Volume:" +this.getVolume());
    }
}
