package projectj;

public class ExHandlingUserdefinedException {

	public static void main(String[] args) {
		
		int i=9;
		int j=10;
		
		
		try
		{
			int k=i/j;
			if(k==0) 
			{
			throw new VimalException("This is invalid by vimal method");
			
			}
			System.out.println(k);

		}
		catch(VimalException e)
		{
			System.err.println("Error occured \n"+e.getMessage());
		}
		
	}

}
