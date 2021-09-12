package projectj;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoInGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer>values=new TreeSet<>();
		Set<Integer>values=new HashSet<>();
		values.add(12);
		values.add(35);
		values.add(156);
		values.add(21);
		
		for(int i:values)
		{
			System.out.println(i);
		}
		
	}

}
