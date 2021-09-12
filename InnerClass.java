package projectj;
class Outer{                          			//static class
	public static void method() {
		System.out.println("hi are u there...");
		
	}
	static class Inner{							//member class  remaining anonymous class
		public void display() {
			System.out.println("innerclass method is working..");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Outer house=new Outer();
		house.method();
		/*Outer.Inner brick=house.new Inner(); //accessing using object of outer class
		brick.display();  */
		Outer.Inner brick= new Outer.Inner(); /* while using static class, access inner class by
												outer clas name*/
		brick.display();
	}

}
