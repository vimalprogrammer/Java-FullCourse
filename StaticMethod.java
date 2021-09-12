package projectj;

class Emp{
	int id;
	String name;
	float score;
	static String manager;
	static {          //doesn't matter about object so execute only one time(class dependent)
		manager="Ramaki";
		System.out.println("STATIC");
	}
	public Emp() {     //depending upon no of objects
		id=100;
		name="john";
		score=96.2f;
		System.out.println("CONSTRUCT");
	}
	
	public void show() {
		System.out.println(name +" "+id+" "+score+" "+manager);
	}
	
	
}

public class StaticMethod {
	
	//static int i; //static is must while accesing var above main method
	public static void main(String[] args) {    
	//i=9;
		// TODO Auto-generated method stub
	 Emp vimal=new Emp();
//	 vimal.id=118;
//	 vimal.name="John";
//	 vimal.score=9.1f;
//	 
	 Emp kishore=new Emp();
//	 kishore.id=123;
//	 kishore.name="steyn";
//	 kishore.score=9.7f;
//	 //kishore.manager="vinoth";
	 vimal.show();
	 kishore.show();	 
	}

}
