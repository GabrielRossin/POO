import Exception.X_Ex;
import Exception.TrianguloInvalidoEx;
import Exception.LadoNegativoEx;
import Exception.LadoInvalidoEx;

public class Principal
{
    public static void main(String[] args) throws LadoNegativoEx,TrianguloInvalidoEx
    {
        Triangulo t = new Triangulo(8,2, 4);
        try
        {
            t.validaLados();
        }
        catch (TrianguloInvalidoEx ex)
        {
            System.out.println(ex.getMessage());
        }

    }

}
