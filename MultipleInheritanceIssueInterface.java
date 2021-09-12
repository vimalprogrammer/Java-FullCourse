package projectj;
interface Go
{
	void abc();
	default void show()       //define method using default method 
	{
		System.out.println("sun rise in the east..!");
	}
}
interface Raise
{
	default void show()       //define method using default method 
	{
		System.out.println("Sorry   :(");
	}
}
class P implements Go,Raise
{
	public void abc()
	{
		System.out.println("understand the concept");
	}
	public void show()    
	{
	//Go.super.show();
	Raise.super.show();	
	}
}

public class MultipleInheritanceIssueInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Go g1=new P();
		g1.abc();
		g1.show();
	}

}
