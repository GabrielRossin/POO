package Revista;

import interfaces.Descontos;
import livro.Editora;

public class revista implements Descontos
{
    private final Double DESCONTO_MAX = 0.1;

    private String nome;
    private String descricao;
    private Editora editora;
    private Double valor;
    private Double pDesconto;

    public revista(String nome, String descricao, Editora editora, Double valor)
    {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setEditora(editora);
        this.setValor(valor);
        this.setpDesconto(0.00);
    }

    @Override
    public void addDesconto(Double valor)
    {
        Double porcentagem = valor / 100;
        this.setpDesconto(porcentagem > DESCONTO_MAX ? 0.0 : porcentagem);
    }

    public Double getValor()
    {
        Double valor = this.valor;
        if (getpDesconto() > 0)
        {
            valor = valor - (valor * getpDesconto());
        }
        return valor;
    }

    public Double getDESCONTO_MAX() {
        return DESCONTO_MAX;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public Editora getEditora()
    {
        return editora;
    }

    public void setEditora(Editora editora)
    {
        this.editora = editora;
    }

    public void setValor(Double valor)
    {
        this.valor = valor;
    }

    public Double getpDesconto()
    {
        return pDesconto;
    }

    public void setpDesconto(Double pDesconto)
    {
        this.pDesconto = pDesconto;
    }
}

