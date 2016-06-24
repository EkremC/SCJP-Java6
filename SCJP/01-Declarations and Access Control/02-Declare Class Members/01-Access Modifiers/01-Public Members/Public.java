import javax.swing.text.AsyncBoxView.ChildLocator;

//eger bir method yada variable member, public olarak declare edilmesi demek, diger tüm sınıflardan ve paketlerden 
//bu method ya da variable memberlara erisebiliriz anlamına gelmektedir.(sinifin visible old. sayıyoruz.)

//İki sinif farklı paketlerde olsa bile eger bir sinif ve methodu public ise diger sinif bu methoda sorunsuz ulasabilir.(Sludge - Goo örnegi)

//Eger bir sinif diger bir sinifi kalitiyorsa ve superclass "public" olarak declare edildiyse, subclass, superclass'la aynı pakette olsa da olmasa da 
//memberları kullanabilir.(Roo - Cloo örnegi)

//Cloo classındaki doTooThings() methodu su sekilde de cagrilabilir: this.doTooThings()

public class Public {

}


-------------------------------------------------------------
package book;
import cert.*;
class Goo{
	public static void main(String[] args) {
		Sludge o = new Sludge();
		o.testIt();
	}
}

package cert;
public class Sludge{
	public void dotestIt() {
		System.out.println("sludge");
	}
}
-------------------------------------------------------------

-------------------------------------------------------------
package cert;
public class Roo{
	public String doTooThings() {
		return "fun";
	}
}

package notcert;
import cert.Roo;
class Cloo extends Roo{
	public void testCloo() {
		System.out.println(doTooThings());
	}
}
-------------------------------------------------------------

-------------------------------------------------------------
class Toon{
	public static void main(String[] args) {
		Cloo c = new Cloo();
		System.out.println(c.doTooThings());  //No Problem, method is public.
	}
}
-------------------------------------------------------------
