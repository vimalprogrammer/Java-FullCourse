package projectj;
class Student{
	public Student() {
		System.out.println("1");
		
	}
	public Student(int i) {
		System.out.println("arg");
		
	}
}
class Student1 extends Student{
	public Student1() {
		super();
		System.out.println("2");
		
	}
	public Student1(int i) {
		super(9);
		System.out.println("arg2");
		
	}
}

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(4);
		
	}

}
