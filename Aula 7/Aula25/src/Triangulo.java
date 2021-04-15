
import Exception.LadoNegativoEx;
import Exception.TrianguloInvalidoEx;
import Exception.X_Ex;

public class Triangulo
{

    private int a;
    private int b;
    private int c;

    public Triangulo(int a, int b, int c) throws LadoNegativoEx
    {
        if(a>0 && b>0 && c>0)
        {
            this.setA(a);
            this.setB(b);
            this.setC(c);
        }
        else
        {
            throw new LadoNegativoEx("Valor dos lados inválidos");
        }

    }

    public String identificarTipo() throws TrianguloInvalidoEx
    {
        if(this.getA() < this.getB() + this.getC() && this.getB() < this.getA() + this.getC() && this.getC() < this.getA() + this.getB())
        {
            if(this.getA() == this.getB() && this.getB() == this.getC())
            {
                return "Triângulo Equilátero.";
            }
            else
            {
                if(this.getA() == this.getB() || this.getA() == this.getC() || this.getB() == this.getC())
                {
                    return "Triângulo Isósceles.";
                }
                else
                {
                    return "Triângulo escaleno.";
                }
            }
        }
        else
        {
            throw new TrianguloInvalidoEx("Erro: o valor dos lados informados não formam um triângulo");
        }
    }

    public String testarTime()
    {
        throw new X_Ex("Erro no tempo de execução.");
    }

    public String validaLados() throws  TrianguloInvalidoEx
    {
        if(this.getC() >= this.getA()+this.getB() || this.getB() >= this.getC() + this.getA() || this.getA() >= this.getB() + this.getC() )
        {
            throw new TrianguloInvalidoEx("Erro: O valor dos lados são inválidos!");
        }
        else
        {
            return identificarTipo();
        }

    }


    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public int getC()
    {
        return c;
    }

    public void setC(int c)
    {
        this.c = c;
    }


}
