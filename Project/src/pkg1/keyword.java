package pkg1;

public class keyword {
	
	public void method(){
		this.method3( 6,7,8);
		 System.out.println("this is Default keyword");
	}
	public void method1(int a){
	  this.method();
	 System.out.println("this is One Perametrized keyword");
		
	}
		
	
	public void method2(int C, int D){
		this.method1(3);
		System.out.println("this is two parametrized keyword");
	}
	
	public void method3(int c,int D, int E){
		System.out.println("this is three parametrized keyword");
	}
	
	public void method4(int c, int D, int E,int F)	{
		this.method2(6, 7);
		System.out.println("this is four parametrized keyword");
	}
	public void method5(int c, int D,int E, int F, int G){
		this.method4(6, 7, 8, 9);
		System.out.println("this is five parametrized keyword");
	}
	
	public static void main(String[] args)
	{
		keyword m =new keyword();
		m.method5(6, 7, 8, 9, 10);
	}
	
	
	
	}
		 
	
	

		
