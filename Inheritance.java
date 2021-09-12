package projectj;
class Calculator{
	public int add(int i,int j) {
		return i+j;
	}
}
class Calculator1 extends Calculator{
	public void sub(int i,int j) {
		System.out.println(i-j);
		
	}
}
class Calculator2 extends Calculator1{
	public void mul(int i,int j) {
		System.out.println(i*j);
	}
}
		



public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 obj= new Calculator2();
		int result=obj.add(2,6);
		System.out.println(result);
		obj.sub(2, 6);
		obj.mul(2, 6);
		
		
	}

}
