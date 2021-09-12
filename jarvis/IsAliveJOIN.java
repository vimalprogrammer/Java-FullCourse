package jarvis;

class R implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++) {
			System.out.println("Hi Vimal");
		try{Thread.sleep(1000);} catch(Exception e) {}
		}
}
}
class S implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++) {
			System.out.println("Hello Vicky");
		try{Thread.sleep(1000);} catch(Exception e) {}
		}
		}
		
}

public class IsAliveJOIN  {

	public static void main(String[] args) throws Exception {
		
		R a=new R();
		S b=new S();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		
		t1.start();
		try{Thread.sleep(10);} catch(Exception e) {}
		t2.start();
		
		t1.join();				//imagine the flow diagram
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye");
}


}

