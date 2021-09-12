package projectj;
import java.io.BufferedReader;

import java.io.InputStreamReader;
public class ExHandlingTryWithResource {

	public static void main(String[] args)throws Exception 
	{
		int n=0;
		System.out.println("Enter Number: ");
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)) )
		{
		
			n=Integer.parseInt(br.readLine());				//close the resource automatically after completing			
		}

	}

}