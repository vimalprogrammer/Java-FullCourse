package projectj;
abstract class Human{
	public abstract void eat();   //declare not to define
	
	public void walk(int i,int j) {
		i=9;
		j=2;
		System.out.println(i*j);
	}
}
class Man extends Human{
	public void eat() {
		System.out.println("Abstract is hurting..");	//compulsory to define
	}
}
class Printer{
	public void show(Number i) {			//number extended by sub class 
		System.out.println(i);				//we can't instantiate number
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Man();
		obj.eat();
		Printer obj1=new Printer();		
		obj1.show(4.5f);
	}

}
