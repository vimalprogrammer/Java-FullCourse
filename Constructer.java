package projectj;
class Sayhi{
	int n;           /*instance variable
						*/
	int m;
	float f;
	double b;
	int result;
	public Sayhi() {      //default construtor
		n=4;
		m=8;
		result=n+m;
		System.out.println(result);
	}
	public Sayhi(int a,float b) {      //parameterized constructor    //m n are local variable
		 n=a;
		 f=b;
		//System.out.println(n*f);
	}
	public Sayhi(int i,double q,int r) {     //parameterized constructor
		n=i;
		b=q;
		m=r;
		System.out.println(i+q+r);
	}
	public Sayhi(int age) {      //pararmeterized constructor
		
	
		if(age==18)
			System.out.print("eligible");
		else
			System.out.println("not eligible");
	}
}

public class Constructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sayhi sum=new Sayhi(6,4.5f);
		Sayhi sum=new Sayhi(2,4.5f);

		System.out.println(sum.n*sum.f); //in main call by object
	}

}
