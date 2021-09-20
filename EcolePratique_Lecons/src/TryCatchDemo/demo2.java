package TryCatchDemo;

public class demo2 
{
	public static void main (String[] args)
	{
		try
		{
		calculAge(20);
		}
		catch (Exception e)
 		{
			e.printStackTrace();
			System.out.println("j'ai imprimé youpi!!!");
		}
	}
	
	public static void calculAge (int age) throws Exception
	{
		if (age > 18)
		{
			throw new Exception("Message : AAAAAAAAAAAHH C'EST LA FIIINNNN !!!!");
		}
	}
}
