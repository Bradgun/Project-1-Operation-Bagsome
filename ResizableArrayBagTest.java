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
		@SuppressWarnings("unused")
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

		public ResizableArrayBag<Object> intersection(ResizableArrayBag<Object> otherBag) {
   
			//creates a new bag
			ResizableArrayBag<Object> resultBag = new ResizableArrayBag<>();
	
			// check to see if either bag is null
			if ((null == this) || (null == otherBag)) {
	
				//return empty bag if so because there will be no intersection
				System.out.print("Null bag was found...");
				return resultBag;
			}
	
			//check if both bags are empty
			if (isEmpty() || otherBag.isEmpty()) {
	
				//return empty bag if so because there will be no intersection
				System.out.print("Both bags were empty");
				return resultBag;
			}
	
			//if neither, return the two linked bag with the intersection
			Object[] arrayBag = this.toArray();
			Object[] arrayBag2 = otherBag.toArray();
	
			//loops through first bag
			for (int i = 0; i < arrayBag.length; i++) {
				//placeholder for value in array to compare
				Object firstValue = arrayBag[i];
				//check if firstValue isn't null
			if (firstValue != null) {
				//loops through second bag
				for (int j = 0; j < arrayBag2.length; j++) {
					
					//placeholder for value in second array to compare
					Object secondValue = arrayBag2[j];
					
					//compares values between first and second bag
					if (firstValue.equals(secondValue)) {
						
						resultBag.add(firstValue);
						arrayBag[i] = null;
                    arrayBag2[j] = null;
						
					}
				}
			}
		}
			return resultBag;
		}
		//end of intersection
 
 
	 private Object[] toArray() {
		 // TODO Auto-generated method stub
		 throw new UnsupportedOperationException("Unimplemented method 'toArray'");
	 }
 
 
	 private boolean isEmpty() {
		 // TODO Auto-generated method stub
		 throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
	 }
 
	}
	


