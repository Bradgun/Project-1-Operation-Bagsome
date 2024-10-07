public class ResizableArrayBagTest<T> {

 	/* creates ArrayBag and ArrayBag2 object */
    ResizableArrayBag<T> arrayBag = new ResizableArrayBag<>();
    ResizableArrayBag<T> arrayBag2 = new ResizableArrayBag<>();
    
	 /* contructors for ArrayBags 
	  * parameters: two objects of ResizableArrayBag type
	 */
	public ResizableArrayBagTest (ResizableArrayBag<T> arrayBag, ResizableArrayBag<T> arrayBag2) {
    	
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
 
	public ResizableArrayBag<T> testDifferenceArray() {
		Object[] bagArray = arrayBag.toArray();
		Object[] bagArray2 = arrayBag2.toArray();

		ResizableArrayBag<T> returnBag = new ResizableArrayBag<>();
 
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
	/**
	 * Returns new bag containing all elements of arrayBag and arrayBag2 
	 */	
	public ResizableArrayBag<T> testUnion() {
		ResizableArrayBag<T> unionBag = new ResizableArrayBag<>();

		System.out.println("\nArray Union:");

		//adding elements from arrayBag
		for (T element : arrayBag.toArray()) {
			unionBag.add(element);
		}

		//adding elements from arrayBag2
		for (T element : arrayBag2.toArray()) {
			unionBag.add(element);
		}
		
		//Print elements in unionBag
		for (T element : unionBag.toArray()) {
			System.out.println(element);
		}
		return unionBag; //end of union
		}
	}


