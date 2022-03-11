package pkg2;

public class DynamicPolymorphism extends OverridingPolymorphism
{
	
	public void arithmetic(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("This Result is = " +z);
	}
	
	public void arithmetic1(int g, int h)
	{
		int i;
		i=g+h;
		System.out.println("This Result is = " +i);
	}
	public static void main(String[] args)
	{
		
		   DynamicPolymorphism obj=new DynamicPolymorphism ();
		                    obj.arithmetic(10,20);
	                         obj.arithmetic1(22,4);
	}

	
		
	}


