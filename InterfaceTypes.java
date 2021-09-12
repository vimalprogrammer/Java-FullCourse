/*Types of Interfaces
 * 1.Normal - contains two methods
 * 2.single abstract method-functional interface-lambda expression-derived from scala
 * 3.marker interface - no method contains
 */

//functional interface
package projectj;

@FunctionalInterface
interface Food
{
	void sambar();
	
}
public class InterfaceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f=() ->System.out.println("daily samber boring   :{");  //Lambda expression
		f.sambar();
	}

}
