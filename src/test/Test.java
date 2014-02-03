package test;

public class Test
{

    public static void main(String[] args)
    {
	if (args.length>0)
	{
	    System.out.println(args[0]);
	}   
	else
	{
	    System.err.println("Pas de paramètre");
	}
    }

}
