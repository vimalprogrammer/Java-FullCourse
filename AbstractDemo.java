package projectj;
abstract class Writer{
	public abstract void write();
	
}
class pen extends Writer{
	public void write() {
		System.out.println("I am a pen");
	}
}
class pencil extends Writer{
	public void write() {
		System.out.println("I am a pencil");
	}
}
class sketch extends Writer{
	public void write() {
		System.out.println("I am a Sketch");
	}
}
class Kit{
	public void action(Writer p) {
		p.write();
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer a = new pen();
		Writer b = new pencil();
		Writer c = new sketch();
		
	Kit obj=new Kit();
	c.write();
	}

}
