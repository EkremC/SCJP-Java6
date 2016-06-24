
//her yeni obje olusturdugumuzda, en az bir constructor cagrilir.

//her sinifin bir constructorı vardir, siz yaratmasınız bile.

//constructorlar asla ama asla bir return type'a sahip olamazlar.

//constructorlar, methodlar gibi acccess modifierları alabilirler.
//var-args argumanları bile alabilirler.

//constructorlar hakkındaki bir diger önemli kural ise, constructorların isimleri, siniflarinin isimleriyle ayni olmalidir.

//constructlar, static, abstract ya da final olarak declare edilemezler.



public class ConstructorDeclarations {

	protected ConstructorDeclarations(){} //this is ConstructorDeclarations' constructor
	
	protected void ConstructorDeclarations(){} //this is a badly named, 
											   //but legal, method
	
	//legal constructors
	
	ConstructorDeclarations(){}
	private ConstructorDeclarations(byte b){}
	ConstructorDeclarations(int x){}
	ConstructorDeclarations(int x, int... y){}
	
	//illegal constructors
	
	void ConstructorDeclarations(){} //it's a method, not a constructor
	ConstructorDeclarations(short s); //looks like an abstract method
	static ConstructorDeclarations(float f){} //can't be static
	final ConstructorDeclarations(long x){} //can't be final
	abstract ConstructorDeclarations(char c){} //can't be abstract
	ConstructorDeclarations(int... x, int t){} //bad var-arg syntax
	
}
														