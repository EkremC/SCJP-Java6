
//Bir degiskeni final olarak tanımladiktan sonra, o degiskenin degerini
//bir daha degistiremeyiz. Bir int variableına 10 degerini atadıysak
//o daima 10 olarak kalir.

//final olarak kullanilan bir referans degiskenin de ilk basta referans
//ettigi objeyi degistiremeyiz.

//final objesi yoktur, sadece final referans degiskenleri olabilir.

public class FinalVariables {
	
	
	/*
	 * final siniflar extends edilemez.
	 */
	
	final class Foo{
		
	}
	
	class Bar extends Foo{
		
	}
	
	-----------------------------------------------------------------
	
	/*
	 * final methodlar, subclass tarafından override edilemez.
	 */
	
	class Baz{
		final void go()
	}
	
	class Bat extends Baz{
		final void go()
	}
	
	------------------------------------------------------------------
	
	/*
	 * final variablelara yeniden deger atanamaz.
	 */
	
	class Roo{
		final int size = 42;
		
		void changeSize(){
			size = 16;
		}
	}

}
