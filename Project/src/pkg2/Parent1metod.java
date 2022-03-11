package pkg2;

public class Parent1metod {


public void method1()
{
	
	System.out.println("Parent Default Method"); 
	}

 public void method2(int a) {
	 this.method4(1,22,3);
	 this.method1();
	 this.methos3(5,6);
	 System.out.println("parent 1 Parameterized Method");
 }
	
public void methos3(int a, int b) {
	
	System.out.println("Parent 2 Parameterized Method");
}
public void method4 (int a, int b, int c) {
	System.out.println("Parent 3 Parameterized Method");
			
}

}