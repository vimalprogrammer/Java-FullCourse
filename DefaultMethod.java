package projectj;
@FunctionalInterface		//--->>here using many methods but using only one abstract method
interface Sun
{
	void rise();
	default void set()       //define method using default method 
	{
		System.out.println("sun rise in the east..!");
	}
}
class Moon implements Sun
{
	public void rise()								//we can define the declare method in above class
	{
		System.out.println("Nothing to tell ");
	}
	public void set()
	{
		System.out.println("sun wake in the west..!");			//override above method
	}	
}

public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sun s1=new Moon();
		s1.rise();
		s1.set();
		
	}

}
