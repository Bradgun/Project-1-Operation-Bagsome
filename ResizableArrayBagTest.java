public class ResizableArrayBagTest {

 	/* creates ArrayBag and ArrayBag2 object */
    ResizableArrayBag arrayBag = new ResizableArrayBag();
    ResizableArrayBag arrayBag2 = new ResizableArrayBag();
    
	 /* contructors for ArrayBags 
	  * parameters: two objects of ResizableArrayBag type
	 */
	public ResizableArrayBagTest (ResizableArrayBag arrayBag, ResizableArrayBag arrayBag2) {
    	
    	this.arrayBag = arrayBag;
    	this.arrayBag2 = arrayBag2;
    	
    }

	 /* method checks if bags are null */
   public void testNull(){
    	
	   if(arrayBag.isEmpty() && arrayBag2.isEmpty()){
		   
	    System.out.println("\nArray Bags are empty");
		   		   
	   }
	   else {
		   System.out.println("\nArray Bags are not empty");
	   }
    }

	/* returns a new bag containing the difference of two array bags */
 
	public ResizableArrayBag testDifferenceArray() {
		Object[] bagArray = arrayBag.toArray();
		Object[] bagArray2 = arrayBag2.toArray();

		ResizableArrayBag returnBag = new ResizableArrayBag<>();
 
		System.out.println("\nArray Difference:\n");
 
		   for(int i = 0; i < bagArray.length; i++ ) {        
			   if (arrayBag.contains(arrayBag2.toArray()[i])) {
				arrayBag.remove(arrayBag2.toArray()[i]);
			   }
		}
		for(int i = 0; i < arrayBag.toArray().length; i++ ) {        
			System.out.println(arrayBag.toArray()[i]);
	 }
		returnBag = arrayBag;
		return returnBag;
	}		
}

