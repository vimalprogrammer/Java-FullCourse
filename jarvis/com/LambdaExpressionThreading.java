// 1  -  reduce the class

// 2  -  anonymous class
// 3  -  lambda expression class




package jarvis.com;

public class LambdaExpressionThreading {

	public static void main(String[] args) {
		
		
		Thread t1=new Thread(()->
		
		{
			for(int i=0;i<5;i++) {
				System.out.println("Hi Vimal");
			try{Thread.sleep(1000);} catch(Exception e) {}
			}
	});
		Thread t2=new Thread(()->
		
		{
			for(int i=0;i<5;i++) {
				System.out.println("Hello Vicky");
			try{Thread.sleep(1000);} catch(Exception e) {}
			}
		}	);
		
		t1.start();
		try{Thread.sleep(10);} catch(Exception e) {}
		t2.start();
}
}	


