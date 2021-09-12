package projectj;

public class ThisKey {
	int num1;
	int num2;
	public ThisKey(int num1,int num2) {
		this.num1=num1;    /*when instance var and local var name are same 
							*we need to specify instance*/ 	
		this.num2=num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKey obj=new ThisKey(2,3);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
