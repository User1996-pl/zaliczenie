package com.company;

public class Kangur extends Animal implements Czynnosc
{
    @Override
    void przywitanie()
    {
        System.out.println("Hej jestem Kangur");
    }

    @Override
    public void jedzenie()
    {
        System.out.println("Teraz jem i jestem kangurem");
    }

    @Override
    public void picie()
    {
        System.out.println("...");
    }

    @Override
    public void skok()
    {
        System.out.println("Teraz skacze");
    }

    @Override
    public void skok()
    {
        System.out.println("Teraz nie skacze");
    }

    @Override
    public void skok()
    {
        System.out.println("Teraz leze i odpoczywam");
    }

    @Override
    public void skok()
    {
        System.out.println("Teraz nie skacze i nie odpoczywam");
    }
}
