package projectj;
interface Run
{
	void go();
}
class D implements Run
{
	public void go() {
		
	}
	
}

public class InterfaceInAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Run r=new Run()				//magic in interface Run is instantiated
			{
		public void go() {
		System.out.println("hi hello ram");	
		}
		
			};	
			r.go();
	}

}
