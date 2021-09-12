package projectj;

public class Wrapping {

	public static void main(String[] args) {
		
		int i=5;		 				//primitive datatype
		Integer value=new Integer(i);	//wrapping,boxing in oops
		int j=value.intValue();			//unwrapping,unboxing
		System.out.println(j);
		Integer value1=i;				//autoboxing
		int k=value1;					//autoUnboxing
		System.out.println(k);
		
		
		// type conversion
		String str="1255";
		int n=Integer.parseInt(str);			//parseint method belongs to integerClass]
		System.out.println(n);
	}
/*
 * primitive datatypes are used in modern applications
 * Because primitive is fast
 * Wrapperclass is slow but used in connection API
 */
}
