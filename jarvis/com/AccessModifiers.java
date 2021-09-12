package jarvis.com;
import jarvis.AccessModifier;
public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier a=new AccessModifier();
		//a.A();
		a.rollno=4;
		//a.name="tom";  // because name is private cannot accessable
		//a.mark=90;  	 //protected not work in another packages
		
	}

}
