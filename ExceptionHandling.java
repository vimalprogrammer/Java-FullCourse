package projectj;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i=9/0;
			int a[]=new int[5];
			a[5]=12;
			System.out.println(i);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("ERROR");
		}
		catch(Exception e)
		{
			System.err.println("ERROR");
		}
		
		finally
		{
			System.out.println("bye");
		}
	}

}
