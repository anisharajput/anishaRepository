package pkg2;

public class Class1 {    //Parent Class
	
	public Class1()
	{
		this(11,4,5);
		System.out.println("Parent Default Constructor");
	}
	 public Class1 (int a)
	{
		this(11,3);
		System.out.println("Parent 1 Parametrized Constructor");
	}
	public Class1 (int a, int b)
	{
		this();
		System.out.println("Parent 2 Parametrized Constructor");
	}
	public Class1 (int a, int b, int c)
	{
		
		System.out.println("Parent 3 Parametrized Constructor");
				
	}

}