package pkg2;

public class Implicit
{
	
	public void implicit1()
	{
	
		char G='B';
		int B1;
		
		
		B1=G;
		
		System.out.println("Result of Imlicit Conversion " +B1);
	}
		
		public void Explicit()
		{
		
		int B2=90;
		char c3;
				c3= (char)B2;
				System.out.println("Result of Explicit Conversion " +c3);
		}
				
				public static void main(String[] args) {
					Implicit obj= new Implicit();
				    obj.implicit1();
					obj.Explicit();
					
		}

}
