package projectj;
import java.io.BufferedReader;

import java.io.InputStreamReader;
public class UserInput {

	public static void main(String[] args) throws Exception {
		int n=0;
		System.out.println("Enter input :");
	 
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(b.readLine());

	}
	

}
