package jarvis.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorInterfaceCollection {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Collection values=new ArrayList();
			//List values=new ArrayList();
			List<Integer> values=new ArrayList<>();			//Collection & Generic combined
			
			values.add(388);
			values.add(577);
			values.add(799);
			Comparator<Integer> c=new Comparator<Integer>()		//see ctrl+left key
					{
					public int compare(Integer i,Integer j)		//anonymous class
					{
					/*	if(i%10>j%10)							//our own logic to print sort
							return 1;
						else
							return -1;  */
						 return i%10>j%10?1:-1; 
									
					}
					};
			
			Collections.sort(values,c);
			//Collections.sort(values,( i, j)->i%10>j%10?1:-1); //using lambda expression
			for(Integer o:values)					//now its not an object
			{
				System.out.println(o);
				
			}
			}
			

	}

