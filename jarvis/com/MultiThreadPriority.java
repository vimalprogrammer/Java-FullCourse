package jarvis.com;

public class MultiThreadPriority {

	public static void main(String[] args) {
		
		
		Thread t1=new Thread(()->
		
		{
			for(int i=0;i<5;i++) {
				System.out.println("Hi Vimal "+Thread.currentThread().getPriority());
			try{Thread.sleep(1000);} catch(Exception e) {}
			}
	},"Hi Thread");						//includes 2 arguments thats y thread name
		Thread t2=new Thread(()->
		
		{
			for(int i=0;i<5;i++) {
				System.out.println("Hello Vicky "+Thread.currentThread().getPriority());
			try{Thread.sleep(1000);} catch(Exception e) {}
			}
		},"Hello thread");							//includes two arguments
		//t1.setName("HI Thread");
		//t2.setName("HELLO Thread");
		t1.setPriority(t1.MAX_PRIORITY);
		t2.setPriority(t2.MIN_PRIORITY);
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		//System.out.println(t1.getPriority());
		//System.out.println(t2.getPriority());
		
		t1.start();
		try{Thread.sleep(10);} catch(Exception e) {}
		t2.start();
}
}	


