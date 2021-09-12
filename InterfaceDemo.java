//interface --> define only ,declaration !possible
//abstract --> we can declare and define a method

package projectj;
interface Thing				//class not mentioned
{							
	void write();			// internally it calls public abstract
}
class Root1 implements Thing
{
	public void write()
	{
		System.out.println("IM a PEn  :) ");
	}
}
class Root2 implements Thing
{
	public void write()
	{
		System.out.println("IM a PEnciL hahahaha...  :) ");
	}
}
class Root3 
{
	public void doit(Thing q)
	{
		q.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Root3 r3=new Root3();
		Thing r1=new Root1();
		//r1.write();
		Thing r2=new Root2();
		//r2.write();
		
		r3.doit(r2);
		
	}

}
