package projectj;
class Z
{
	public void walk()
	{
		System.out.println("by walk");
	}
}

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z d1=new Z()
				{
			public void walk()							//no class name
			{											//defined by once
														//used for overriding
				System.out.println("by...Im thinking");  	
				
			}
				};
		d1.walk();
		
	}

}
