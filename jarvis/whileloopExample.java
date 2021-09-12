package jarvis;

import java.util.Scanner;

public class whileloopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,rev=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n!=0) {
			n1=n%10;
			rev=rev*10+n1;
			n=n/10;
			
		}
System.out.println(rev);
	}

}
