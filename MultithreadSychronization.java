package projectj;
class F
{
	int count;
	public synchronized void increment() 			//to aviod fighting while rnning in parallel
	{
		count++;
	}
}

public class MultithreadSychronization {

	public static void main(String[] args) throws Exception {
		
		F c=new F();
		
		Thread t1=new Thread(new Runnable()
				{
				public void run()
				{
					for(int i=1;i<=10000000;i++)
					{
						c.increment();
					}
				}
				});
		Thread t2=new Thread(new Runnable()
		{
		public void run()
		{
			for(int i=1;i<=10000000;i++)
			{
				c.increment();
			}
		}
		});
		
		
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("count no = "+c.count);
	}
 
}
