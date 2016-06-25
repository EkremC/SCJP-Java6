

//Local variablelar, method icerisinde tanimlanýrlar.

//Yasam süreleri, methodlarla sýnýrlýdýrlar. Yasamlarý method icerisinde baslar,
//method bittiginde ise son bulur.

//Local variablelar, daima stackte tutulur, heap'de tutulmaz.

//Variable, object reference bile olsa stack'te tutulur. Referans oldugu obje ise heap'tedir.
//Stack Object diye bir sey yoktur, yalnýzca stack variable vardýr.

//Local Variablelar, access modifier(public, private, protected) keywordlerini alamazlar.
//Ayný zamanda, transient, volatile, abstract veya static keywordlerini de alamazlar.
//final, keywordunu alabilirler.

//Local variablelara, kullanýlmadan önce mutlaka deger atanmalýdýr.

//Local variablelara, instance variablelar gibi default deger atanmaz. Bundan dolayý
//kullanmadan önce initialize etmemiz gerekir.

//



public class LocalVariables {
	
	
	/*Local variablelara, kullanýlmadan önce mutlaka deger atanmalýdýr.*/
	
	public void logIn(){
		int count = 10;
	}
	
	
	/*Local variablelara, tanýmlandýgý method dýsýndan erisilemez.*/
	
	public void doSomething(int i) {
		count = i;	//Won't compile! Can't access count outside method logIn()
	}
	
	---------------------------------------------------------------
	
	/*Local variablelar, instance variablelar ile ayný isme sahip olabilir.
	 * 
	 * Buna, Shadowing denir.
	 */
	
	int count = 9; //Declare an instance variable count
	
	public void logIn() {
		int count = 10; //Declare a local variable named count
		System.out.println("local variable count is " + count);
	}
	
	public void count() {
		System.out.println("instance variable count is " + count);
	}
	
	public static void main(String[] args) {
		new LocalVariables().logIn();		//output: local variable count is 10
		new LocalVariables().count();		//output: instance variable count is 9
	}
	
	-----------------------------------------------------------------

}
