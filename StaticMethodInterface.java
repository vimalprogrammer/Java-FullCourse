package projectj;
interface Sir
{
	int num=9;					//Final is inbuilt in inside we cannot use this variable in any class
	void go();
	static void show()
	{
		System.out.println("teacher behaves like student..  :[");
	}
}
class Mam implements Sir
{
	public void go()
	{
		// num=8;
	}
}
public class StaticMethodInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sir.show();
	}

}
