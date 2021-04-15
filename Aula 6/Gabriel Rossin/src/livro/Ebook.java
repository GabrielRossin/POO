package livro;

import interfaces.Descontos;

public class Ebook extends Livros implements Descontos
{
    private final Double DESCONTO = 0.15;
    private WMark wMark;
    private FormatoEbook formato;

    public Ebook(String titulo, Autores autor, Editora editora, int ano_pub, Double valor, WMark wMark, FormatoEbook formato)
     {
        super(titulo, autor, editora, ano_pub, valor);
        this.setWMark(wMark);
        this.setFormato(formato);
    }

    public Ebook(String titulo, Autores autor, Editora editora, int ano_pub, Double valor, int num_pag, WMark wMark, FormatoEbook formato) {
        super(titulo, autor, editora, ano_pub, valor, num_pag);
        this.setWMark(wMark);
        this.setFormato(formato);
    }

    @Override
    public void addDesconto(Double valor) {
        Double porcentagem = valor / 100;
        porcentagem = porcentagem > DESCONTO ? 0.0 : porcentagem;
        setDesconto(porcentagem);
    }

    public WMark getWaterMark()
    {
        return wMark;
    }

    public void setWMark(WMark wMark)
    {
        this.wMark = wMark;
    }

    public FormatoEbook getFormato()
    {
        return formato;
    }

    public void setFormato(FormatoEbook formato)
    {
        this.formato = formato;
    }
}


