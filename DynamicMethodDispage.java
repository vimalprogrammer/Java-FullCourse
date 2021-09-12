package projectj;
class A{
	public void show() {
		System.out.println("in A");
	}
}
class B extends A{
	public void show() {
		System.out.println("in B");
	}
	public void config() {
		System.out.println("in B config");
	}
}
class C extends A{
	public void show() {
		System.out.println("in C");
	}
}

public class DynamicMethodDispage {

	public static void main(String[] args) {
		A obj = new B();  		//run time polymorphism
		obj.show();
		//obj.config();  not work
		obj =new C();			//Dynamic memory Dispatch
		obj.show();
	}

}
