
package entidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos
{
    public File file;
    private String caminho;

    public Arquivos(String caminho)
    {
        file = new File(caminho);
        this.setCaminho(caminho);
    }

    public void escrever(String texto) throws IOException
    {
        FileWriter arq = new FileWriter(this.getCaminho());
        BufferedWriter buf = new BufferedWriter(arq);
        buf.append(texto);
        buf.close();
    }

    public String lerArquivoText() throws IOException
    {
        FileReader arq = new FileReader(this.getCaminho());
        BufferedReader buf = new BufferedReader(arq);
        StringBuilder texto = new StringBuilder();
        String linha;

        while (buf.ready())
        {
            linha = buf.readLine();

            if(!linha.trim().isEmpty() && linha != null)
            {
                texto.append(linha).append("\n");
            }
        }
        buf.close();
        return texto.toString();

    }

    public void setCaminho(String caminho)
    {
        this.caminho = caminho;
    }

    public String getCaminho()
    {
        return caminho;
    }


}

