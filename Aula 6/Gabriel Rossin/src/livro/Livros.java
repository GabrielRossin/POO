package livro;

import livro.Editora;

import java.util.ArrayList;
import java.util.List;

public abstract class Livros
{
    private double valor;
    private double desconto;

    private String titulo;
    private int ano_pub;

    private List<Autores> listaAutor;
    private Editora editora;



    protected int num_pag;


    public Livros(String titulo,Autores autor, Editora editora, int ano_pub, Double valor)
    {
       this.setValor(valor);
       this.setTitulo(titulo);
       this.setAno_pub(ano_pub);
       this.setDesconto(0.00);
       this.setEditora(editora);

        listaAutor = new ArrayList<Autores>(2);
        listaAutor.add(autor);



    }

    public Livros(String titulo, Autores autor, Editora editora, Integer anoPublicacao, Double valor, int num_pag)
    {
        this(titulo, autor, editora, anoPublicacao, valor);
        this.setNum_pag(num_pag);
    }

    public List<Autores> getListaAutor()
    {
        return listaAutor;
    }

    public void addAutor(Autores autor)
    {
        listaAutor.add(autor);
    }

    public Editora getEditora()
    {
        return editora;
    }

    public void setEditora(Editora editora)
    {
        this.editora = editora;
    }

    public double getDesconto()
    {
        return desconto;
    }

    public void setDesconto(double desconto)
    {
        this.desconto = desconto;
    }

    public double getValor()
    {

        Double valor = this.valor;
        if (getDesconto() > 0)
        {
            valor = valor - (valor * getDesconto());
        }

        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getAno_pub()
    {
        return ano_pub;
    }

    public void setAno_pub(int ano_pub)
    {
        this.ano_pub = ano_pub;
    }

    public int getNum_pag()
    {
        return num_pag;
    }

    public void setNum_pag(int num_pag)
    {
        this.num_pag = num_pag;
    }
}
