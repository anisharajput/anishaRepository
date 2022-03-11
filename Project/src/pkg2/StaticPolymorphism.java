package pkg2;

public class StaticPolymorphism
{
	
	public void addition(int b,int c)
	{
		 int d;
		 d=b+c;
		 
		 System.out.println("Result is " +d);
		 
	}

	public void addition(int b,int c, int d)
	{

		int e;
		e=b+c+d;
		System.out.println("Result is " +e);
}
	public static void main(String[] args)
	{
		StaticPolymorphism ob=new StaticPolymorphism();
		                   ob.addition(20, 30, 50);
		                   ob.addition(40, 10);
		                   
		
	}
	
}