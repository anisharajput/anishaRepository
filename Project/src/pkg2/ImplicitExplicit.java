package pkg2;

public class ImplicitExplicit {
	
	public void Implicit1()
	{
				int a=30;
				float b;
				b=a;     // Implicit Conversion
				System.out.println("Value of b is " +b);
			}
			
			public void c2()
			{
				
					int c=40;
					float d;
					d=c;     // Implicit Conversion
					System.out.println("Value of d is " +d);
				}
				
				public void Explicit()
				{
				float E=14.6F;     // Explicit Conversion
				int F;
				F=(char)E;
				System.out.println("Value of F is "  +F);
				}
				
				
				public static void main(String[] args)
				{
					ImplicitExplicit obj= new ImplicitExplicit();
					obj.Implicit1();
					obj.c2();
					obj.Explicit();
				}
				

}
