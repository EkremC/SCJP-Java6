
//enumlar, önceden bahsettigimiz gibi özel bir sinif türüdür.
//enumlarin icinde, constructorlar, instance variableler, methodlar tanimlayabiliriz.

//

public class DeclaringConstructorsMethodsAndVariablesInAnEnum {
	
	-------------------------------------------------------------------

	enum CoffeeSize{
		//8, 10 , 16 are passed to the constructor.
		BIG(8), HUGE(10), OVERWHELMING(16);
		
		private CoffeeSize(int ounces) { //constructor
			this.ounces = ounces;
		}
		
		private int ounces;   //an instance variable
		public int getOunces(){
			return ounces;
		}
	}
	
	class Coffee{
		CoffeeSize size;  //each instance of Coffee has an enum
		
		public static void main(String[] args) {
			Coffee drink1 = new Coffee();
			drink1.size = CoffeeSize.BIG;
			
			Coffee drink2 = new Coffee();
			drink2.size = CoffeeSize.OVERWHELMING;
			
			System.out.println(drink1.size.getOunces()); //prints 8
			for(CoffeeSize cSize: CoffeeSize.values()){
				System.out.println(cSize + " " + cSize.getOunces());
			}
		}
	}
	
	/*
	 * Ornegin ciktisi su sekilde olacaktir;
	 * 
	 * 8
	 * BIG 8
	 * HUGE 10
	 * OVERWHELMING 16
	 * 
	 * 
	 * Her enum, values() adinda bir static methoda sahiptir. Bu method, enum valuelarinin eklendigi siraya göre
	 * degerlerinin oldugu bir array döndürür.
	 */
	
	-------------------------------------------------------------------

	enum CoffeeSize{
		BIG, 
		HUGE, 
		OVERWHELMING{  						//start a code block that defines
											//the "body" for this constant
			
			public String getLibCode(){		//override the method
											//defined in CoffeeSize
				return "A";
			}
		};		//this semicolon is REQUIRED when more code follows
		
		public String getLibCode(){		//this method is overriden
										//by the OVERWHELMING constant
			
			return "B";					//the default value we want to return for
										//CoffeeSize constant
		}
	};

	public class Coffee {

		CoffeeSize size;
		
		public static void main(String[] args) {
			for(CoffeeSize cSize : CoffeeSize.values()){
				System.out.println(cSize + " " + cSize.getLibCode());
			}
		}
		
	}

	/*
	 * Ornegin ciktisi su sekilde olacaktir;
	 * 
	 * BIG B
	 * HUGE B
	 * OVERWHELMING A
	 * 
	 * 
	 */
}
