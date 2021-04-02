package view;

import model.SerieLimitada;

public class Principal
{
    public static void main(String[] args)
    {
        SerieLimitada s1 = new SerieLimitada();
        System.out.println(s1.toString());

        SerieLimitada s2 = new SerieLimitada();
        System.out.println(s2.toString());
    }
}