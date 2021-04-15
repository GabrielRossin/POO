
package principal;

import Carrinho.Carrinho;
import livro.Autores;
import livro.Editora;
import livro.LivroImpresso;
import livro.Ebook;
import livro.WMark;
import livro.FormatoEbook;

public class Main {
    public static void main(String[] args)
    {

        Autores cs = new Autores("CS Lewis");
        Autores Tolkien = new Autores("Tolkien");


        Editora editora = new Editora("Editora moderna", "Moderna LTDA", "85.160.458/0001-46");


        LivroImpresso livroImpresso = new LivroImpresso("O Leão, a Feiticeira e o Guarda-Roupa", cs, editora, 1950, 60.85, 300.0, 27.0, 15.0);


        WMark marca_agua = new WMark("Autor", "email");

        Ebook livroDigital = new Ebook("O Leão, a Feiticeira e o Guarda-Roupa", cs, editora, 2007, 50.75, 210, marca_agua, FormatoEbook.PDF);


        livroImpresso.addAutor(cs);
        livroDigital.addAutor(cs);


        livroImpresso.addDesconto(40.0);


        Carrinho carrinho = new Carrinho();


        carrinho.addLivro(livroImpresso);
        System.out.println(carrinho.getValorTotalCarrinho());

        carrinho.addLivro(livroDigital);
        System.out.println(carrinho.getValorTotalCarrinho());

        carrinho.removerLivro(livroImpresso);
        System.out.println(carrinho.getValorTotalCarrinho());

        carrinho.removerLivro(livroImpresso);
        System.out.println(carrinho.getValorTotalCarrinho());

        carrinho.addLivro(livroDigital);
        System.out.println(carrinho.getValorTotalCarrinho());
    }
}
