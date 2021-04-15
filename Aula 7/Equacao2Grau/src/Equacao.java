import Exception.DeltaNegativoEx;
import Exception.SegundoGrauEx;

public class Equacao
{
    public double a;
    public double b;
    public double c;

    public Equacao(double a, double b, double c) throws SegundoGrauEx
    {
        if(this.getA() != 0 && this.getB() != 0 && this.getC() != 0)
        {
            this.setA(a);
            this.setB(b);
            this.setC(c);
        }
        else
        {
            if(a==0)
            {
                throw new SegundoGrauEx("Erro: Valor de a = 0!");
            }

        }

    }
    public String calculaValor() throws DeltaNegativoEx
    {
        double delta = ((b*b)-(4*a*c));
        double x1;
        double x2;

        if(delta>=0)
        {
            x1 = ( ( -b + (Math.sqrt (delta) ) ) / ( 2*a ) );
            x2 = ( ( -b + (Math.sqrt (delta) ) ) / ( 2*a ) );
            return "Valor de x1 ="+ x1 + " Valor de x2 ="+ x2;
        }
        else
        {
            throw new DeltaNegativoEx("Valor de delta < 0");
        }

    }

    @Override
    public String toString()
    {
        return "Equacao{" + "a =" + this.getA() + ", b =" + this.getB() + ", c =" + this.getC() + '}';
    }

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    public double getC()
    {
        return c;
    }

    public void setC(double c)
    {
        this.c = c;
    }
}
