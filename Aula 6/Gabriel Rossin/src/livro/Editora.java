package livro;

public class Editora
{
    private String nome_fantasia;
    private String razao_Social;
    private String CNPJ;

    public Editora(String nome_fantasia, String razao_Social, String CNPJ) {
        this.setNome_fantasia(nome_fantasia);
        this.setRazao_Social(razao_Social);
        this.setCNPJ(CNPJ);
    }

    public String getNome_fantasia()
    {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia)
    {
        this.nome_fantasia = nome_fantasia;
    }

    public String getRazao_Social()
    {
        return razao_Social;
    }

    public void setRazao_Social(String razao_Social)
    {
        this.razao_Social = razao_Social;
    }

    public String getCNPJ()
    {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ)
    {
        this.CNPJ = CNPJ;
    }
}
