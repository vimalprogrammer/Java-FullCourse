package projectj;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptHandlingThrow {

	public static void main(String[] args)throws Exception 
	{
		int n=0;
		System.out.println("Enter Number: ");
		BufferedReader br=null;
		try
		{
		br=new BufferedReader(new InputStreamReader(System.in));   //classes which comes with the help of .io is called resource
		n=Integer.parseInt(br.readLine());							// here br is a resource
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			br.close();								//after using the resource we need to close it
		}
		System.out.println(n);
	}

}
