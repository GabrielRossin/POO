public class Criar
{
    String nome;


    public Criar(String nome)
    {
        this.nome = nome;
        switch (nome)
        {
            case "gato":
            {
                gatos g = new gatos();

                System.out.println("O gato foi criado");

                g.getDormir();
                System.out.println(g.toString());

                g.getComer();
                System.out.println(g.toString());

                g.getRugir();
                System.out.println(g.toString());

                g.acariciar();

                break;
            }
            case "cachorro":
            {
                cachorro c = new cachorro();

                System.out.println("O cachorro foi criado");

                c.getDormir();
                System.out.println(c.toString());

                c.getComer();
                System.out.println(c.toString());

                c.getUivar();
                System.out.println(c.toString());

                c.acariciar();


                break;
            }
            case "leoes":
            {
                leoes l = new leoes();

                System.out.println("O Leão foi criado");

                l.getDormir();
                System.out.println(l.toString());

                l.getComer();
                System.out.println(l.toString());

                l.getRugir();
                System.out.println(l.toString());

                break;
            }
            case "lobos":
            {
                lobos lb = new lobos();

                System.out.println("O Lobo foi criado");

                lb.getDormir();
                System.out.println(lb.toString());

                lb.getComer();
                System.out.println(lb.toString());

                lb.getUivar();
                System.out.println(lb.toString());

                break;
            }
            default:
            {
                System.out.println("Animal não encontrado");
            }
        }
    }

}
