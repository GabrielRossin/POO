
package entidades;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Arquivos
{

    public static void gravar(Tela config, String caminho) throws IOException
    {
        FileOutputStream arquivoSaida = null;
        ObjectOutputStream objetoSaida = null;
        try
        {
            arquivoSaida = new FileOutputStream(caminho,false);
            objetoSaida = new ObjectOutputStream(arquivoSaida);
            objetoSaida.writeObject(config);
            objetoSaida.flush();
        }
        finally
        {
            objetoSaida.close();
            arquivoSaida.close();
        }
    }

    public static Tela ler(String caminho) throws IOException, ClassNotFoundException
    {
        Tela config = null;
        FileInputStream arquivoEntrada = null;
        ObjectInputStream objetoEntrada = null;
        try
        {
            arquivoEntrada = new FileInputStream(caminho);
            objetoEntrada = new ObjectInputStream(arquivoEntrada);

            if(arquivoEntrada.available() > 0)
            {
                config = (Tela)objetoEntrada.readObject();
            }
        }
        finally
        {
            objetoEntrada.close();
            arquivoEntrada.close();
        }
        return config;
    }

}
