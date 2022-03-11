package pkg1;

public class ClassC {
	
	public ClassC()
	{
		this( 21,22,33); //Call three parameterized constructor
		 System.out.println("this is default constructor = C");
	}
	public ClassC(int C)
	{
		 this(15,16,17,18);//Call Four parameterized constructor
		 System.out.println("this is one parametrized constructor = 15");
	}
	public ClassC(int a,int b)
	{
		this();//Call default constructor
		System.out.println("this is two parametrized constructor = 15,16");
	}
	public ClassC(int x,int y,int z)
	{
		 System.out.println("this is three parametrized constructor = 21,22,23");
	}
	public ClassC(int a,int b,int c,int d)
	{
		this (15,16);//Call two parameterized constructor
		System.out.println("this is four parametrized constructor = 15,16,17,18");
		
	}
	public static void main(String[] args)
	{

	ClassC obj = new ClassC(15);
	}
	
	
	
}
		
	
	