package pkg2;

public class Class2 extends Class1   //Child Class Class2
{
	public Class2()
	{
		 super(1);
		System.out.println("Child Default Constructor");
	}
	
	public Class2(int a)
	{
		this(1,2,3);
		System.out.println("Child 1 Parameterized Constructor");
	}
	
	public Class2(int a, int b)
	{
		this(5);
		System.out.println("Child 2 Parameterized Constructor");
	}
	
	public Class2(int a, int b, int c)
	{
		this();
		System.out.println("Child 3 Parmeterized Constructor");
	}
	
	
	public static void main(String[] args) {
		
		Class2 obj= new Class2 (12,22);
		

	}

}
