package interfaces;

import livro.Livros;

public interface Carrinhos
{
    public void addLivro(Livros livro);

    public void removerLivro(Livros livro);

    public Double getValorTotalCarrinho();
}
