
//Bir interface yarattıgımızda, classın ne yaptıgını belirtmis oluruz. Nasıl yapacagını degil.

//Interfaceler, herhangi bir sınıf tarafından herhangi bir inheritance tree tarafından implement edilebilir.
//Birbiriyle alakası olmayan sınıflar aynı interface'i implement edebilirler.

//Interface'teki methodlar biz yazsak da yazmasak da "public abstract" olarak tanımlanır.

//interface'i implement eden sınıflar, buradaki methodları da implement etmek zorundadır.
//Bu methodlar aynı zamanda "public" olmak zorundadır.

//"abstract" classlarda "abstract" ve "non-abstract" methodlar tanımlayabiliyorken, 
//"interface"lerde yalnızca "abstract" methodlar tanımlayabiliriz.


//bir interface birden fazla interface'i kalıtabilir.

//bir intarface sadece baska bir interface'i kalıtabilir.

//bir interface baska bir interface'i yada classı "implement" edemez.

//interfaceler biz yazsak da yazmasak da "abstract" olarak tanımlanmıstır.(methodlardaki gibi) 	

//interfacelere constantlar koyarak, bu interface'i implement eden classların aynı constantlara erisebilecegini
//garanti altina almis oluruz.

//interfacelerdeki variablelar "public, static ve final"dır. Yani constant declare ederiz, instance variable degil.







public interface Interface {
	
	
	public abstract void bounce(); // == void bounce();
	
	/*
	//legal and identical
	void bounce();
	public void bounce();
	abstract void bounce();
	public abstract void bounce();
	abstract public void bounce();
	*/
	
	
	/*
	//wont compile
	final void bounce(); //final and abstract can never be used together,
						//and abstract is implied
	static void bounce(); //intarfaces define instance methods
	private void bounce(); // interface methods are always public.
	*/
	
	/*
	interface Foo{
		int BAR = 42;
		void go();
	}
	
	class Zap implements Foo{
		public void go(){
			BAR = 27;
		}
	}
	
	//this code will not compile. We can't change the value of constants.
	 */
	
	
	
	
	
	
	
	
	
	

}
