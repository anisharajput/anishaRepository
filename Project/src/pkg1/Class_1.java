package pkg1;

public class Class_1 {

public int Sum(int a, int b)
{
	int c;
	c=a+2;
	return c;
	
}
public int sub(int x, int y)
{
	int z;
	z=x-y;
	return z;
	}
public int Multi(int m, int n)
{
	int p;
	p=m*n;
	return p;
	}
public void Div(int d, int e)
{
	int f;
	f=d/e;
	System.out.println("Final result is ((((10+2)+2)-2)*2)/2) =" +f);
}
public static void main(String[] args)
{
	Class_1 obj=new Class_1();
	int sumResult1=obj.Sum(10, 2);
	System.out.println("Sum((((10+2) ="  +sumResult1);
	int sumResult2=obj.Sum(sumResult1,2);
	System.out.println("Sum((((10+2)-2 ) ="  +sumResult2);
	int subResult=obj.sub(sumResult1+2, 2);
	System.out.println("Sub((((10+2)=2)-2) ="  +subResult);
	int multiResult=obj.Multi(subResult, 2);
	System.out.println("Multi = ((((10+2)=2)-2)*2)= "  +multiResult);
	obj.Div(multiResult, 2);
}


	
	
	
	



}


