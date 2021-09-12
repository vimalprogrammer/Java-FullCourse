package jarvis;

import jarvis.com.AccessModify;

public class AcessModifier extends AccessModify {
	public void show()
	{
		//a=18;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier c=new AccessModifier(); //don;t show error because same packages
		c.mark=98;			//protected works in same package not in other package 
		c.age=78;
	
	}

}
