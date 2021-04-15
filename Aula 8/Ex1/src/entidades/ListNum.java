package entidades;

import com.sun.javafx.util.Utils;
import entidades.Arquivos;
import excecoes.ValorInvalidoEX;
import java.io.IOException;

public class ListNum
{
    private int[] numeros;
    private final int QTD_NUMERO = 10;

    public ListNum()
    {
        this.numeros = new int[QTD_NUMERO];
    }
    public void gerarNumeros()
    {
        int x;
        int valor;
        for(x = 0; QTD_NUMERO > x; x++)
        {
            valor = 20 + (int)(Math.random() * (50-20));
            this.numeros[x] = valor;
        }
    }

    public void armazenar(String caminho) throws IOException
    {
        String texto = "";
        int x;
        for(x = 0; x < this.numeros.length; x++)
        {
            texto = texto + this.getNumeros(x) + "\n";
        }

        Arquivos arq = new Arquivos(caminho);
        arq.escrever(texto);
    }

    public String lerArquivo(String caminho) throws IOException, ValorInvalidoEX
    {
        String text;
        Arquivos arq = new Arquivos(caminho);
        text = arq.lerArquivoText();
        String textFinal = "";
        String[] numbers = Utils.split(text, "\n");

        for(int x = this.getNumeros().length-1; x>-1; x--)
        {
            if(isNumber(numbers[x]))
            {
                textFinal = textFinal + numbers[x] + "\n";
            }
            else
            {
                throw new ValorInvalidoEX("Erro: Valor Inválido!");
            }
        }
        return textFinal;

    }

    public static boolean isNumber(String num)
    {
        try
        {
            Integer.parseInt(num);
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }

    private int[] getNumeros()
    {
        return numeros;
    }

    public int[] getNumeros(int x)
    {
        return numeros;
    }


}

