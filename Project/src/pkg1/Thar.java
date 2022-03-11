package pkg1;

public class Thar extends Punch
{
	
	public void Tharmethod()
	{
		System.out.println("this method is Child class ");
	}
	
	public static void main(String[] args)
	{
	   Thar T=new Thar();
	   
	   T.Fortunermethod();
	   T.Punchmethod();
	   T.Tharmethod();
	  

}
}