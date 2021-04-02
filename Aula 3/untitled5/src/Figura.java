public abstract class Figura
{
    private double area;
    private double perimeter;
    private double volume;
    final double PI = 3.14;

    public void setArea(double altura, double base)
    {
        this.area = base * altura;
    }

    public void setPerimeter(double base, double altura) // Perimetro do retângulo
    {

        this.perimeter = (2 * base) + (2 * altura);
    }

    public void setArea(double base, double l1, double l2 ) //Area e Perimetro do triângulo
    {
        double s;
        s = (base + l1+ l2) / 2;
        this.area = Math.sqrt(s * (s - base) * (s - l1) * (s - l2));
    }

    public void setPerimeter(double base, double l1, double l2 ) //Area e Perimetro do triângulo
    {
        this.perimeter = base + l1 + l2;
    }
    public void setArea(double raio) // Area da esfera
    {
        this.area = (4 * PI) * Math.sqrt(raio);
    }

    public void setVolume(double raio)
    {

        this.volume = ((4/3) * PI) * Math.pow(raio, 3);
    }

    public double getArea()
    {
        return area;
    }

    public double getPerimeter()
    {
        return perimeter;
    }

    public double getVolume()
    {
        return volume;
    }
}
