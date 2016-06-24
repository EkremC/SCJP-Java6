
//abstract method, abstract olarak declare edilmis ama implement edilmemis methoddur.
//diger bir deyisle, gövdesi olmayan methodlardir.

//bir methodu abstract olarak declare edersen, subclasslara bu methodu override etmeleri icin zorlamıs olursun.

//eger abstract bir methodun varsa, o methodun bulundugu sinif da abstract olmak zorundadir. Yoksa compiler error yersin.

//abstract bir classta, hic abstract method bulunmayabilir.

//abstract olmayan ilk subclass, abstract classın tüm abstract methodlarini override etmek zorundadir.

//bir method hem abstract hem de final olarak tanımlanamaz.
//aynı zamanda abstract ve private olarak da tanımlanamaz.
//abstract ve static olarak da tanımlanamaz.



public abstract class AbstractMethods {

	abstract void goUpp();
	abstract void goDown();
}
