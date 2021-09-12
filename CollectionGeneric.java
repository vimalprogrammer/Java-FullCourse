package projectj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection values=new ArrayList();
		//List values=new ArrayList();
		List<Integer> values=new ArrayList<>();			//Collection & Generic combined
		
		values.add(3);
		values.add(5);
		values.add(7);
		//values.add("software");				--->doesn't work in Integers
		
		/*
		Iterator it=values.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());			//want to iterate individually
		}*/
		//for(Object o:values)
		Collections.sort(values);
		Collections.reverse(values);
		Collections.shuffle(values);
		
		for(Integer o:values)					//now its not an object
		{
			System.out.println(o);
			
		}
		}
		

}
