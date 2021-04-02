import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        String nome;

        Criar criar;

        System.out.println("Insira o nome do animal que vai ser criado:");
        nome = ler.nextLine().toLowerCase();
        new Criar(nome);

    }
}
