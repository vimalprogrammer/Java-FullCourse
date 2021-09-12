package projectj;

class Do{
	public Do() {
		System.out.println("hi");
	}
	public Do(int i) {
		System.out.println("hi..2");
	}
}
class Doo extends Do{
	public Doo() {
		System.out.println("hiiiii");
	}
	public Doo(int i) {
		super(i);
		System.out.println("hiiiiii...2222");
	}
}

public class Constructeroverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doo d1=new Doo(6);
	}

}



