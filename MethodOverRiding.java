package projectj;
class Stud{
	public void run() {
		System.out.println("vimal1");
	}
	public void run(int a) {
		System.out.println("vimal111111");
	}
}
class Stud1 extends Stud{
	public void run() {
		System.out.println("vimal2");
	}
	public void run(int a) {
		super.run();
		System.out.println("vimal22222");
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud1 s1=new Stud1();
		s1.run(5);
	}

}
