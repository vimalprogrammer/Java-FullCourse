//SELECTION demo
package projectj;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*Arithmetic operator
	 *Bitwise operator
	 *Relational operator
	 *Logical operator
	 */
		int a=7,b=9;
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int quo=a%b;
				
//		System.out.println(sum);
//		System.out.println(sub);
//		System.out.println(mul);
//		System.out.println(div);
//		System.out.println(quo);
//		System.out.println(a+=b);
		// pre/post increment
		a=b++;
		//a=++b;
		/*System.out.println(a);
		System.out.println(b);
		*/
		int c;
		c=a>b?1:6; //Ternary operator
		System.out.println(c);
		
		//switch case
		String name="ishak";
		
		switch(name) 
		{ 
		case "vimal":
			System.out.println("he is awesome");
			break;
		case "ishak":
			System.out.println("he is handsome");	
			break;
		case "sunjv":
			System.out.println("he is chubby");	
			break;
		case "arun":
			System.out.println("he is leany");
			break;
		}
	}
}
