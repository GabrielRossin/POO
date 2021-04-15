package livro;

import livro.Editora;
import livro.Livros;

public class MiniLivro extends Livros
{
    public MiniLivro(String titulo, Autores autor, Editora editora, int ano_pub, Double valor)
    {
        super(titulo, autor, editora, ano_pub, valor);
    }

    public MiniLivro(String titulo, Autores autor, Editora editora, int ano_pub, Double valor, int num_pag)
    {
        super(titulo, autor, editora, ano_pub, valor, num_pag);
    }
}
