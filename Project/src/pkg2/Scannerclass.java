package pkg2;

import java.util.Scanner;

public class Scannerclass {
	
	public int add(int a, int b)
	{
		int s1 = a+b;
		return s1;
	}
	
	public int sub(int add, int c)
	{
		int s2 = add-c;
		return s2;
	}
	
	public int multi(int add2, int e)
	{
		int s3 = add2*e;
		return s3;
	}
	
	public double division (int multi, int f)
	{
		double div = multi/f;
		return div;
	}
	public static void main(String args[])
	{
		System.out.println("Enter First integer x1 :");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		System.out.println("Enter Second integer x2 :");
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		
		System.out.println("Enter Third integer x3 :");
		Scanner s3 = new Scanner(System.in);
		int c = s3.nextInt();
		
		System.out.println("Enter Fourth integer x4 :");
		Scanner s4 = new Scanner(System.in);
		int d = s4.nextInt();
		
		System.out.println("Enter Fifth integer x5 :");
		Scanner s5 = new Scanner(System.in);
		int e = s5.nextInt();
		
		System.out.println("Enter Sixth integer x6 :");
		Scanner s6 = new Scanner(System.in);
		int f = s6.nextInt();
		
		Scannerclass obj= new Scannerclass();
		int add = obj.add(a,b);
		System.out.println("Sum is " + add);
		int sub = obj.sub(add,c);
		System.out.println("Sub is " + sub);
		int add2 = obj.add(sub,d);
		System.out.println("Sum is " + add2);
		int multi = obj.multi(add2,e);
		System.out.println("Multi is " + multi);
		double div = obj.division(multi, f);
		System.out.println("Final result of (((((x1 +x2)-x3)+x4)*x5))/x6 : " + div);
		
		
		
		
		
		
		
		
		
		
		
	}

}
