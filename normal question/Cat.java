import java.io.*;
import java.util.*;

public class Cat
{
    private String name;
    private String color;
    private boolean fed;

    public Cat()
    {
        Random r = new Random();
        List<String> possibleNames = Arrays.asList("Bob", "Cole", "Larry", "Marmalade");
        List<String> possibleColors = Arrays.asList("white", "tabby", "ginger", "black");
        name = possibleNames.get(r.nextInt(possibleNames.size()));
        color = possibleColors.get(r.nextInt(possibleColors.size()));
    }

    public String getDescription()
    {
        return "A " + color + " cat named " + name;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void listen()
    {
        if(fed)
        {
            System.out.println(name + " purrs.");
        }
        else
        {
            System.out.println(name + " meows at you.");
        }
    }

    public void play() throws IOException
    {
        System.out.println("What will you get " + name + " to chase?");
        String item = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println(name + " chases the " + item);
    }
}


