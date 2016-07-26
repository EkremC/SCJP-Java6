
//eger bir alt sinif bir member'i kalitirsa, o altsinif o member'a sahip olur.


public class Moo {

	public void useAZoo(){
		Zoo z = new Zoo();
		//If the preceding line compiles Moo has access
		//to the Zoo class
		//But... does it have access to the coolMethod()?
		System.out.println("A Zoo says, " + z.coolMethod());
		//The preceding line works because Moo can access the public method
	}
	
}

class Moo extends Zoo{
	public void useMyCoolMethod(){
		System.out.println("Moo says, " + this.coolMethod());
		//The preceding line works because Moo can inherit the public method
		//Can an instance of Moo invoke coolMethod() on an instance of Zoo?
		Zoo z = new Zoo();
		System.out.println("Zoo says, " + z.coolMethod());
		//coolMethod() is public, so Moo can invoke it on a Zoo reference
	   
	}
}
