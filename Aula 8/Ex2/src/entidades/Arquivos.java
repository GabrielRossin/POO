
package entidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Arquivos
{
    private File file;
    private String caminhos;

    public Arquivos(String caminhos)
    {
        file = new File(caminhos);
        this.setCaminhos(caminhos);
    }

    public void escrever(String texto) throws IOException
    {
        FileWriter arq = new FileWriter(this.caminhos);
        BufferedWriter buf = new BufferedWriter(arq);
        buf.append(texto);
        buf.close();
    }

    public String lerArquivo() throws IOException
    {
        FileReader arq = new FileReader(this.getCaminhos());
        BufferedReader buf = new BufferedReader(arq);
        String texto = "";
        String linhas;

        while (buf.ready())
        {
            linhas = buf.readLine();

            if(linhas != null && !linhas.trim().isEmpty()){
                texto = texto + linhas + "\n" ;
            }
        }
        buf.close();
        return texto;
    }

    public static void gravar(Jogos jogo, String caminho) throws IOException{
        FileOutputStream arquivoSaida = null;
        ObjectOutputStream objetoSaida = null;
        try
        {
            arquivoSaida = new FileOutputStream(caminho,false);
            objetoSaida = new ObjectOutputStream(arquivoSaida);
            objetoSaida.writeObject(jogo);
            objetoSaida.flush();
        }
        finally
        {
            objetoSaida.close();
            arquivoSaida.close();
        }
    }

    public static Jogos ler(String caminho) throws IOException, ClassNotFoundException
    {
        Jogos jogo = null;
        FileInputStream arquivoEntrada = null;
        ObjectInputStream objetoEntrada = null;
        try
        {
            arquivoEntrada = new FileInputStream(caminho);
            objetoEntrada = new ObjectInputStream(arquivoEntrada);

            if(arquivoEntrada.available() > 0)
            {
                jogo = (Jogos)objetoEntrada.readObject();
            }
        }
        finally
        {
            objetoEntrada.close();
            arquivoEntrada.close();
        }
        return jogo;
    }

    public String getCaminhos() {
        return caminhos;
    }

    public void setCaminhos(String caminhos)
    {
        this.caminhos = caminhos;
    }
}
