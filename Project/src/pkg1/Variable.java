package pkg1;

public class Variable {
	
int C;
	
	public void method(int C)
	
	{ 
		this.C=C;
	}
	
	public static void main(String[] args)
	{
			
	Variable ob = new Variable();
	ob.method(50);
	System.out.println(ob.C);

	}

}
