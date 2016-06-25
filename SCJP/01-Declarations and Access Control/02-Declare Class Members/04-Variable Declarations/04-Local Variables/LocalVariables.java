

//Local variablelar, method icerisinde tanimlan�rlar.

//Yasam s�releri, methodlarla s�n�rl�d�rlar. Yasamlar� method icerisinde baslar,
//method bittiginde ise son bulur.

//Local variablelar, daima stackte tutulur, heap'de tutulmaz.

//Variable, object reference bile olsa stack'te tutulur. Referans oldugu obje ise heap'tedir.
//Stack Object diye bir sey yoktur, yaln�zca stack variable vard�r.

//Local Variablelar, access modifier(public, private, protected) keywordlerini alamazlar.
//Ayn� zamanda, transient, volatile, abstract veya static keywordlerini de alamazlar.
//final, keywordunu alabilirler.

//Local variablelara, kullan�lmadan �nce mutlaka deger atanmal�d�r.

//Local variablelara, instance variablelar gibi default deger atanmaz. Bundan dolay�
//kullanmadan �nce initialize etmemiz gerekir.

//



public class LocalVariables {
	
	
	/*Local variablelara, kullan�lmadan �nce mutlaka deger atanmal�d�r.*/
	
	public void logIn(){
		int count = 10;
	}
	
	
	/*Local variablelara, tan�mland�g� method d�s�ndan erisilemez.*/
	
	public void doSomething(int i) {
		count = i;	//Won't compile! Can't access count outside method logIn()
	}
	
	---------------------------------------------------------------
	
	/*Local variablelar, instance variablelar ile ayn� isme sahip olabilir.
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
