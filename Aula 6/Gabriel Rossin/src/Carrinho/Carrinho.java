package Carrinho;

import interfaces.Carrinhos;
import livro.Livros;

import java.util.ArrayList;
import java.util.List;

public class Carrinho implements Carrinhos {
    private List<Livros> lista_Livros;
    private Double valor_total;

    public Carrinho()
    {
        lista_Livros = new ArrayList<Livros>(100);
        setValor_total(0.00);
    }

    public void addLivro(Livros livro)
    {
        lista_Livros.add(livro);
        valor_total += livro.getValor();
    }

    public void removerLivro(Livros livro)
    {
        lista_Livros.remove(livro);
        valor_total -= livro.getValor();
    }

    public Double getValorTotalCarrinho()
    {
        return valor_total;
    }

    public Double getValor_total()
    {
        return valor_total;
    }

    public void setValor_total(Double valor_total)
    {
        this.valor_total = valor_total;
    }
}
