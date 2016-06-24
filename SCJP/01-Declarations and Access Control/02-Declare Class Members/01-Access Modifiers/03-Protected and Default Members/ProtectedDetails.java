
//Subclass, superclasstaki protected variable'ı inherit eder. İlk örnekte oldugu gibi x e ulasabilir.

//ancak superclass'ın bir referansını kullanarak bir degiskene ulasamayız, compile error alırız.

//subclass'la aynı package'da olan baska bir sinif Child classının referansını kullanarak, x degiskenine erisemez.
//subclass'ın inherit ettigi memberlar, subclass dısında "private"tır.

public class ProtectedDetails {

}

/*
package certification;
public class Parent{
	protected int x = 9; // protected access
}

package other;
import certification.Parent;
class Child extends Parent{
	public void testIt() {
		System.out.println("x is " + x); //No problem, Child inherits x
	}
}
*/

/*
package certification;
public class Parent{
	protected int x = 9; // protected access
}

package other;
import certification.Parent;
class Child extends Parent{
	public void testIt(){
		System.out.println("x is " + x); //No problem; Child inherits x
		
		Parent parent = new Parent(); //Can we access x using the p reference?
		
		System.out.println("X in parent is "+ parent.x); //compile error!!
	}
}
*/
