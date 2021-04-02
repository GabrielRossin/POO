import model.Livros;
import model.Usuarios;

public class Principal
{
    public static void main(String[] args)
    {
        Livros livro = new Livros("A República", 5, true);
        Livros livro1 = new Livros("Utopia", 7, false);


        Usuarios us = new Usuarios(Usuarios.validaNome("Gabriel"));
        Usuarios us1 = new Usuarios(Usuarios.validaNome("yyyy"));

        System.out.println(us.toString() +"\n " + us.realizaEmprestimo(livro));
        System.out.println(us1.toString() +"\n " + us1.realizaEmprestimo(livro1));
    }
}
