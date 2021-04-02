package model;

public class Livros
{
    private int quanti;
    private String nome;
    private boolean emprestavel;

    public Livros(String nome, int qtd, boolean emprestavel)
    {
        if(nome != null && qtd > 0)
        {
            setNome(nome);
            setQuanti(qtd);
            this.emprestavel = emprestavel;
        }
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setQuanti(int quanti)
    {
        this.quanti = quanti;
    }

    public int getQuanti()
    {
        return quanti;
    }

    public boolean getEmprestavel()
    {
        return emprestavel;
    }

    @Override
    public String toString()
    {
        return "Livro(" + "nome='" + nome + '\'' + ", quantidade=" + quanti + ", emprestavel=" + emprestavel + ')';
    }
}
