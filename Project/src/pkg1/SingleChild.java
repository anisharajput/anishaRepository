package pkg1;

public class SingleChild extends Parent
{

public void Cycle()

{
  System.out.println(" Son Cycle name is Atlues");
}
   
  public static void main(String[]args)
  {
	  SingleChild s=new SingleChild();
	              s.Cycle();
	              s.Bike();
  
	     
}
}