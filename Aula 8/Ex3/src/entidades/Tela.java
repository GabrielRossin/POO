package entidades;

import java.awt.Color;
import java.io.IOException;
import java.io.Serializable;


public class Tela implements Serializable
{
    private String fonte;
    private int tamanho;
    private boolean estilo;
    private Color cBotao;

    private static final long serialVersionUID = 1L;

    public Tela(String fonte, int tamanho, boolean estilo, Color cBotao)
    {
        this.setFonte(fonte);
        this.setTamanho(tamanho);
        this.setEstilo(estilo);
        this.setcBotao(cBotao);
    }

    public void gravarConfig(String caminho) throws IOException{
        Arquivos.gravar(this, caminho);
    }

    public Tela ler(String caminho) throws IOException, ClassNotFoundException
    {
        return Arquivos.ler(caminho);
    }

    public String getFonte()
    {
        return fonte;
    }

    public void setFonte(String fonte)
    {
        this.fonte = fonte;
    }

    public int getTamanho()
    {
        return tamanho;
    }

    public void setTamanho(int tamanho)
    {
        this.tamanho = tamanho;
    }

    public boolean isEstilo()
    {
        return estilo;
    }

    public void setEstilo(boolean estilo)
    {
        this.estilo = estilo;
    }

    public Color getcBotao()
    {
        return cBotao;
    }

    public void setcBotao(Color cBotao)
    {
        this.cBotao = cBotao;
    }

    public static long getSerialVersionUID()
    {
        return serialVersionUID;
    }
}
