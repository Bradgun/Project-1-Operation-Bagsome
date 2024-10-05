public class LinkedBagTest {

    /* creates LinkedBag and LinkedBag2 object */
    LinkedBag1 linkBag = new LinkedBag1();
    LinkedBag1 linkBag2 = new LinkedBag1();
    
	 /* contructors for LinkedBags 
	  * parameters: two objects of LinkedBag type
	 */
	public LinkedBagTest(LinkedBag1 linkBag, LinkedBag1 linkBag2) {
    	
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

   public LinkedBag1 testDifferenceLink() {
    Object[] bagArray = linkBag.toArray();
	Object[] bagArray2 = linkBag2.toArray();

		LinkedBag1 returnBag = new LinkedBag1();
 
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
}
