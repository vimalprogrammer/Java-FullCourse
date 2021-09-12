package projectj;

public class Method {
	
	public void perform(int i,int j)
	{	 i=i;
		 j=j;
		System.out.println(i*j);
	}
	public void perform(int i) {
		System.out.println(i+12);
	}
	public void perform(int i,double j,int k) {
		System.out.println(i*j+k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method obj=new Method();
		obj.perform(6,7.3,8);
	}

}
