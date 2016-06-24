
//final keywordu bir methodun subclass tarafindan override edilmesini engeller.

//Asagidaki örnekte compile error aliriz.
//The method void showSample() declared in class SubClass cannot override the final method of the same signature.

//method argumanlarına da local variablelara uygulanan kurullar uygulanır. Bu nedenle final keywordunu da uygulayabiliriz.
//eger final kullanırsak, o arguman method icerisinde degistirilemez.
//Argumandaki degerini kullanmak zorundadir.



public class FinalMethods {
	
	public final void showSample(){
		System.out.println("One thing.");
	}

}
