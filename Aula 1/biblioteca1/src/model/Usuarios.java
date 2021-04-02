package model;

public class Usuarios
{

    private String nome;
    private int quanti_Livros;

    public Usuarios(String nome)
    {
        setNome(validaNome(nome));

    }

    public static String validaNome(String nome)
    {
        if(nome.trim().equals(null) || nome.trim().isEmpty())
        {
            throw new IllegalArgumentException("Informe o nome do Usuario!");
        }
        else
        {
            return nome;
        }
    }

    public boolean realizaEmprestimo(model.Livros livro)
    {
        boolean confirmar = false;
        int qtd = livro.getQuanti();
        if(livro.getEmprestavel() && qtd >= 1)
        {
            setQuanti_Livros(1);
            qtd -= 1;
            livro.setQuanti(qtd);
            confirmar = true;
        }
        return confirmar;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setQuanti_Livros(int qtdLivros)
    {
        this.quanti_Livros += quanti_Livros;
    }

    public int getQuanti_Livros()
    {
        return quanti_Livros;
    }

    @Override
    public String toString()
    {
        return "Usuario(" + "nome='" + nome + '\'' + ", quanti_Livros=" + quanti_Livros + ')';
    }
}
