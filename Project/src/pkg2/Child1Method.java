package pkg2;

public class Child1Method extends Parent1metod {
	
	public void method5() {
	super.method2(22);
	System.out.println("Child Default Method");
	 this.method8(6,7,8);
	 this.method6(11);
	 this.methos7(55,66);
}

 public void method6(int a) {
	 System.out.println("Child 1 Parameterized Method");
 }
	
public void methos7(int a, int b) {
	
	System.out.println("Child 2 Parameterized Method");
}
public void method8 (int a, int b, int c) {
	System.out.println("Child 3 Parameterized Method");
	
}
	public static void main(String[] args)
	{
		Child1Method object = new Child1Method();
		object.method5();
	}
			
}

