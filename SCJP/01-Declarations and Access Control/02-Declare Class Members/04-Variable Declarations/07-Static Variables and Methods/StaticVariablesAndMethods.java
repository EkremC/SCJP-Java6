
//static variablelar ve methodlar, objeden bagımsızdır.

//static memberlar, sinifin yeni bir objesini olusturmadan önce hazirdirlar.
//Her static memberin sadece bir kopyası vardir.

//Bir sinifin tüm instanceları, static variablein ayni degerini kullanir.

//Methodlar, variablelar, nested(ic) siniflar ve initialization blocklar static olarak tanimlanabilir.

//constructorlar, siniflar(nested classlar haric), interfaceler, inner class methodlari ve degiskenleri
//ve de local variablelar static olarak tanimlanamaz.

public class StaticVariablesAndMethods {

	//static block
	static{
		System.out.println("Static Block");
		staticMethod();
	}
	
	
	//static variable
	static int staticValue = 80;
	
	
	//static method
	public static void staticMethod(){
		System.out.println("Static method");
	}
	
}
