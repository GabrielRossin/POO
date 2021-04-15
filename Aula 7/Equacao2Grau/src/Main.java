import Exception.SegundoGrauEx;
import Exception.DeltaNegativoEx;

public class Main
{
    public static void main(String[] args)throws SegundoGrauEx, DeltaNegativoEx
    {
        Equacao e = new Equacao(3,4,1);
        System.out.println(e.toString());
        e.calculaValor();

    }
}
