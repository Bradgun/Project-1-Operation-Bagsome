public class LinkedBagTest {

    /* creates LinkedBag and LinkedBag2 object */
    LinkedBag1<Object> linkBag = new LinkedBag1<>();
    LinkedBag1<Object> linkBag2 = new LinkedBag1<>();
    
	 /* contructors for LinkedBags 
	  * parameters: two objects of LinkedBag type
	 */
	public LinkedBagTest(LinkedBag1<Object> linkBag, LinkedBag1<Object> linkBag2) {
    	
    	this.linkBag = linkBag;
    	this.linkBag2 = linkBag2;
    	
    }

/* method checks if bags are null */
   public void testNull(){
    	
	   if(linkBag.isEmpty() && linkBag2.isEmpty()){
		   
	    System.out.println("\nLinked Bags are empty");
		   		   
	   }
	   else {
		   
		   System.out.println("\nLinked Bags are not empty");
	   }
    }

	/* returns a new bag containing the difference of two link bags */

   public LinkedBag1<Object> testDifferenceLink() {
    Object[] bagArray = linkBag.toArray();
	//@SuppressWarnings("unused")
	Object[] bagArray2 = linkBag2.toArray();

		LinkedBag1<Object> returnBag = new LinkedBag1<>();
 
		System.out.println("\nLink Difference:\n");
 
		   for(int i = 0; i < bagArray.length; i++ ) {        
			   if (linkBag.contains(linkBag2.toArray()[i])) {
				linkBag.remove(linkBag2.toArray()[i]);
			   }
		}
		for(int i = 0; i < linkBag.toArray().length; i++ ) {        
			System.out.println(linkBag.toArray()[i]);
	 }
		returnBag = linkBag;
		return returnBag;
   	   
   }

   /* Returns new bag (unionBag) that is the union of linkBag and linkBag2 */
   public LinkedBag1<Object> testUnion() {
	//Union of two bags
	LinkedBag1<Object> unionBag = linkBag.union(linkBag2);

	System.out.println("\nLink Union:");

	Object[] unionArray = unionBag.toArray();
	//Interate all elements in the union
	for (Object element : unionArray) {
		System.out.println(element);
	}
	return unionBag;
   }

   	//new bag is the overlapping entries using 
	
	
	   
	   public LinkedBag1<Object> intersection(LinkedBag1<Object> otherBag) {
   
		   //creates a new bag
		   LinkedBag1<Object> resultBag = new LinkedBag1<>();

		   

			Object[]bagArray = linkBag.toArray();
			Object[]bagArray2 = linkBag2.toArray();
			
			LinkedBag1<Object> returnBag = new LinkedBag1<>();
			System.out.println("\nLink Difference: \n");
			
			for(int i = 0; i < bagArray.length; i++){
			if(linkBag.contains(linkBag2.toArray()[i])){
			linkBag.insert(linkBag2.toArray()[i]);
                            for (Object toArray : linkBag.toArray()) {
                                System.out.println(toArray);
                                returnBag = linkBag;
                                return returnBag;
                            }
		}
	}
	returnBag = linkBag;
			return returnBag;
}
}


		 /*   // check to see if either bag is null
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
   
		   //if neither, return the two linked bags with the intersection
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
	}*/


			
		
	
	   
