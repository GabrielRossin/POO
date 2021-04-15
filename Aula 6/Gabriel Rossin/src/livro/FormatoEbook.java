package livro;

public enum  FormatoEbook
{
    EPUB("epub"),
    MOBI("mobi"),
    PDF("pdf");

    private String formato;

    private FormatoEbook(String formato)
    {
        this.setFormato(formato);
    }

    public String getFormato()
    {
        return formato;
    }

    public void setFormato(String formato)
    {
        this.formato = formato;
    }
}
