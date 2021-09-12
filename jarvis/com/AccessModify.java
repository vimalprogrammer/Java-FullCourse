package jarvis.com;

import jarvis.AccessModifier;

public class AccessModify extends AccessModifier {
	
	public void show() {
		mark=9; 			//protected works in sub class of another package
		//age=9;				//cannot acess default or private variable in another package
	}
		

	
}
