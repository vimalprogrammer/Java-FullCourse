package jarvis.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud> {
	int rollno, marks;
	String name;
	public Stud(int rollno, String name,int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTo(Stud s)
	{
		return marks<s.marks?1:-1;
	}
}

public class ComparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Stud>studs=new ArrayList<>();
		studs.add(new Stud(1,"Vimal",402));
		studs.add(new Stud(2,"Vignesh",492));
		studs.add(new Stud(3,"Thulasi",452));
		studs.add(new Stud(4,"Prakash",482));
		//Collections.sort(studs,(i,j)->i.marks>j.marks?1:-1 ); //using lambda expression
		Collections.sort(studs);
		for(Stud s:studs)
			
		{
			System.out.println(s);
		}
	}

}
