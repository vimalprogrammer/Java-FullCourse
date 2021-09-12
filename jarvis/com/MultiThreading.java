package jarvis.com;
class Ab extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++) {
			System.out.println("Hi Vimal");
		try{Thread.sleep(1000);} catch(Exception e) {}
		}
}
}
class Bc extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++) {
			System.out.println("Hello Vicky");
		try{Thread.sleep(1000);} catch(Exception e) {}
		}
		}
		
}

public class MultiThreading {

	public static void main(String[] args) {
		
		Ab a=new Ab();
		Bc b=new Bc();
		
		a.start();
		try{Thread.sleep(100);} catch(Exception e) {}
		b.start();
}


}
