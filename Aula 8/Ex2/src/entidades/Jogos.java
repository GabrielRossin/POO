
package entidades;

import java.io.IOException;
import java.io.Serializable;

public class Jogos implements Serializable
{
    public static final int MAX_TENTATIVAS = 3;
    private int tentativas;
    private int dado1;
    private int dado2;
    private int soma;
    private String nomeJogador;


    public double lancar()
    {
        this.setDado1(this.getAleatorioFaixa(1, 6));
        this.setDado2(this.getAleatorioFaixa(1, 6));
        this.soma =  this.getDado1() + this.getDado2();
        return this.getSoma();
    }

    public boolean adivinhar(int adivinhacao)
    {
        boolean retorno = adivinhacao == this.getSoma();
        if(!retorno)
        {
            this.tentativas++;
        }

        return retorno;
    }


    public void salvarJogo(String caminho) throws IOException
    {
        Arquivos.gravar(this, caminho);
    }

    public int getAleatorioFaixa(int min, int max){
        return (int) ((Math.random()* (max - min)) + min);
    }

    public static Jogos recuperarJogo(String caminho) throws IOException, ClassNotFoundException
    {
        return Arquivos.ler(caminho);
    }

    public void setDado1(int dado1)
    {
        this.dado1 = dado1;
    }

    public void setDado2(int dado2)
    {
        this.dado2 = dado2;
    }

    public void setSoma(int soma)
    {
        this.soma = soma;
    }

    public void setTentativas(int tentativas)
    {
        this.tentativas = tentativas;
    }

    public int getDado1()
    {
        return dado1;
    }

    public int getTentativas()
    {
        return this.tentativas;
    }

    public int getDado2()
    {
        return dado2;
    }

    public int getSoma()
    {
        return this.soma;
    }


    public String getNomeJogador()
    {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador)
    {
        this.nomeJogador = nomeJogador;
    }

}

