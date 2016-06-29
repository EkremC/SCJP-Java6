
//enumlar, kodumuzdaki hatalarimizi azaltmamiza yardimci olurlar.
//Örnegin, bir kahve dukkanindaki kahve boylari su sekilde olsun; BIG, HUGE, OVERWHELMING.
//Kahve dükkanina gelen biri LARGE ya da GRANDE boy kahve isterse bu bize biraz sikinti
//cikarabilirdi. Ancak biz enum kullanarak, bu degerlerin disindaki degerler icin 
//compilerı uyarıyoruz ve compiler bu üc kahve boyutu disindaki isimlere izin vermiyor.

//enum sabitlerinin büyük harf olma zorunlulugu yoktur, ancak bu sekilde yazilmasi daha makuldur.

//enumlar, kendi ayrı sinif yapisinda ya da bir sinifin uyesi olarak tanimlanabilirler.
//Ancak, method icerisinden tanimlanamazlar.


public class DeclaringEnums {
	
	
	/*
	 * İlk olarak sinif disinda enum tanimlamasina bakalım.
	 * 
	 * Burada unutmamamiz gereken sey, enum sinif disinda tanimlandigi icin, 
	 * protected veya private olamaz.
	 * 
	 * Asagidaki örnekte, enumun sonuna noktali virgul(;) koymamiz zorunlu degildir.
	 *
	 */
	
	enum CoffeeSize{BIG, HUGE, OVERWHELMING};
	
	CoffeeSize cSize = CoffeeSize.BIG;
	
	public class Coffee{
		CoffeeSize size;
	}
	
	public class CoffeeTest1{
		public static void main(String[] args) {
			Coffee drink = new Coffee();
			drink.size = CoffeeSize.BIG;
		}
	}
	
	------------------------------------------------------------------------------
	
	/*
	 * Asagidaki örnekte, enumun sonuna noktali virgul(;) koymamiz zorunlu degildir.
	 */
	class Coffee2{
		enum CoffeeSize {BIG, HUGE, OVERWHELMING};
		
		CoffeeSize size;
	}
	
	public class CoffeeTest2{
		public static void main(String[] args) {
			Coffee2 drink = new Coffee2();
			drink.size = Coffee2.CoffeeSize.BIG;
		}
	}

	------------------------------------------------------------------------------

	/*
	 * Asagidaki örnek enumlarin method icerisinde tanimlanamayacagindan dolayi hatalidir.
	 */
	
	public class CoffeeTest1{
		public static void main(String[] args) {
			enum CoffeeSize {BIG, HUGE, OVERWHELMING}; // enumlar, method icerisinde tanimlanamazlar.
			
			Coffee drink = new Coffee();
			drink.size = CoffeeSize.BIG;
		}
	}
	
	------------------------------------------------------------------------------

	/*
	 * enumlar, String ya da int degildir. Her bir constant(BIG, HUGE...) CoffeeSize'in birer instancedir.
	 * 
	 * enumlari , bir sinif gibi düsünebilirsiniz.(tam olarak sinif degil)
	 * 
	 * enumlari, daha iyi kavrayabilmemiz icin asagidaki örnege bakabilirsiniz.
	 * 
	 * enumerated valuelar(BIG, HUGE, OVERWHELMING), static ve finaldir.
	 */
	
	class CoffeeSize{
		public static final CoffeeSize BIG = new CoffeeSize("BIG", 0);
		public static final CoffeeSize BIG = new CoffeeSize("HUGE", 1);
		public static final CoffeeSize BIG = new CoffeeSize("OVERWHELMING", 2);
		
		public CoffeeSize(String enumName, int index){
			//istediginiz kodlar buraya
		}
		
		public static void main(String[] args) {
			System.out.println(CoffeeSize.BIG);
		}
	}
	
}
