
//Arraylar, aynı tipten birçok degiskeni ya da bir type'in subclasslarını tutabilir.

//Arraylar, primitiveleri ya da object referenceları tutabilir, ama arrayin kendisi heapte tutulur.
//Array, primitive elemanlar tutsa bile.
//Kısacası, primitive array diye bir sey yoktur.


public class ArrayDeclarations {
	
	
	/**
	 * Asagidaki iki tanım da dogrudur. Ancak birinci tanım tavsiye edilir.
	 */
	int[] key; //recommended
	int key[]; //legal but less readable
	
	
	
	/*
	 * Declaring an Array of Object Reference 
	 */
	Thread[] threads; //Recommended
	Thread thread[]; //Legal but less readable
	
	
	/*
	 * Ayrıca cok boyutlu arrayler de tanimlayabiliriz.
	 */
	String [][][] occupantName; //three dimensional array(an array of arrays of arrays)
	String[] managerName[];     //two dimensional array
	
	/**
	 * Java'da arrayi declare ederken boyutunu belirtemeyiz. Cünkü JVM, array objecti instantiate edene
	 * kadar herhangi bir yer(space) ayırmaz.
	 */
	
	int[5] scores; //Won't compile.
}
