package livro;
import interfaces.Descontos;


public class LivroImpresso extends Livros implements Descontos
{

    private final Double DESCONTO = 0.3;

    private Double peso;
    private Double altura;
    private Double largura;

    public LivroImpresso(String titulo, Autores autor, Editora editora, int ano_pub, Double valor, Double peso, Double altura, Double largura) {
        super(titulo, autor, editora, ano_pub, valor);
        this.setPeso(peso);
        this.setAltura(altura);
        this.setLargura(largura);
    }

    public LivroImpresso(String titulo, Autores autor, Editora editora,int ano_pub, Double valor, int num_pag, Double pesoG, Double alturaCent, Double larguraCent)
    {
        super(titulo, autor, editora, ano_pub, valor, num_pag);
        this.setPeso(pesoG);
        this.setAltura(alturaCent);
        this.setLargura(larguraCent);
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public void addDesconto(Double valor) {
        Double porcent = valor / 100;
        porcent = porcent > DESCONTO ? 0.0 : porcent;
        setDesconto(porcent);
    }

}
