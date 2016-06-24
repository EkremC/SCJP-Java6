
//eger memberlar "private" olarak tanımlanırsa diger sınıflar tarafından görülemezler.

//bir member "private" olarak declare edildigi zaman, subclass onu inherit edemez.
//bir method inherit edilemedigi icin aynı zamanda "override" da edilemez.

//pratikte variableları tutmanın en iyi yolu, "private" ya da "protected" dır. Eger variableları degistirme ihtiyacı
//duyarsak, bunları set ve get public methodları ile yapabiliriz.

//

public class Private {

}

/*
package cert;
public class Roo{
	private String doTooThings() {
		//only the Roo class knows
		return "fun";
	}
}

package notcert;
import 	cert.Roo;
class UseARoo{
	public void testIt() {
		Roo roo = new Roo(); //So far so good; class Roo is public
		System.out.println(roo.doRooThings()); //Compiler error!
	}
}
*/