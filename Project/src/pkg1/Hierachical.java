package pkg1;

public class Hierachical {

	public static void main(String[] args) {
		 
		Son amit = new Son();
		System.out.println(amit.X);
		amit.functionFather();
		
		Daughter rita = new Daughter();
		System.out.println(rita.Y);
		rita.functionFather();
		
		Mother wife = new Mother();
		System.out.println(wife.Z);
		wife.functionFather();
		
		


	}

}
