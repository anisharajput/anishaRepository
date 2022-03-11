package pkg1;

public class Class_2 {
	
	public int multi(int a, int b)
	{
		int c;
		c=a*2;
		return c;
		
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		return z;
		}
	public int sum(int m, int n)
	{
		int p;
		p=m+n;
		return p;
		}
	public void Div(int d, int e)
	{
		int f;
		f=d/e;

		System.out.println("((((10+2)+2)-2)*2)+2)/2) Final Result ="+f);
}
	
public static void main(String[] args)
{
	Class_2 obj =new Class_2();
	
	int multiResult=obj.multi(10,2);
	System.out.println("finalMultiRsult_1 Result is="+multiResult);
	
	int subResult=obj.sub(multiResult, 2);
	System.out.println("Substraction Result is="+subResult);
		
	int multiResult2=obj.multi(subResult, 2);
	System.out.println("Multiplication_2 Result is="+multiResult2);
	
	int sumResult=obj.sum(multiResult2, 2);
	System.out.println("Sum Result is="+sumResult);
	obj.Div(sumResult, 2);
	
}
	
	
	
	
}
	


