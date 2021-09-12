package projectj;

class Calc{
	public int add(int ... i) {
		int sum=0;
		for(int k:i)         	 		// for each loop in variable length arguments
		{
			sum=sum+k;
			
		}
		return sum;
	}
}

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Calc obj=new Calc();
	
	System.out.println(obj.add(23,545,5,576,77,899,9));
	}

}
