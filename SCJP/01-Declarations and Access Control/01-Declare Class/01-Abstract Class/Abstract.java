
//abstract classlarında amacı extend edilmektir.

//Abstract classlarda methodlar ya "abstract" etiketiyle etiketlenip govdesiz olmalı
//ya da "abstract" etiketi olmadan govdeli bir sekilde etiketlenebilir.


//Abstract classlarda instantiate yapamayız. Compile error'a neden olur.

//bir sınıfta eger bir tane bile abstract method varsa, o sınıf abstract olmak zorundadır.

//bir sınıfı hem "abstract" hem de final olarak tanımlayamayız. Bu ikisi zıt anlamlı diyebiliriz.
//abstract classlar kalıtılmak icin varken, final sınıflar ise kalıtılmamak icin vardır.

 


public abstract class Car {
	
	private double price;
	private String model;
	public abstract void goFast();
	public void goUpHill() {
		
	}

}
