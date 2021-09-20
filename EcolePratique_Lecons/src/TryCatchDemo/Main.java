package TryCatchDemo;

public class Main 
{
	
	
	public static void main (String[] args)
	{
		try 
		{
			int heures = 10000;
			int age = nbAge();
			
			int moyenne = heures / age;
			System.out.println("moyenne = " + moyenne);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Error!");
		}
		
		System.out.println("Bye!");
		
	}
	
	public static int nbAge()
	{
		return 0;
	}
}
