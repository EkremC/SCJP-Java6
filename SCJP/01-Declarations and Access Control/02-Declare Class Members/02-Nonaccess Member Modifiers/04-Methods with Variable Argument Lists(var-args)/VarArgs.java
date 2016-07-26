
//arguments: doStuff("a", 2) // invoking doStuff, so a & 2 are arguments

//parameters: void doStuff(string s, int a) //we're expecting two parameters: String and int

//var-arg tipleri olarak primitive ve object typeları kullanabiliriz.

//her method imzasında yalnızca bir tane var-arg olabilir.

//var-arglar ile birlikte baska parametrelerde verebiliriz.

//var-args parametremiz sonda olmalıdır.

public class VarArgs {

	
	  //Legal:
	  
	  void doStuff(int... x){} // expects from 0 to many ints as parameters
	  
	  void doStuff2(char c, int... x){} //expects first a char, then 0 to many ints
	  
	  void doStuff3(Animal... animal){} //0 to many Animals
	  
	 
	
	  //Illegal:
	  
	  void doStuff4(int x...){} //bad syntax
	  
	  void doStuff(int ...x, char... y){} //too many var-args
	  
	  void doStuff6(String... s, byte b){} //var-arg must be last
	  
}
