public class LinkedBagTest {

    /* creates LinkedBag and LinkedBag2 object */
    LinkedBag1<Object> linkBag = new LinkedBag1<>();
    LinkedBag1<Object> linkBag2 = new LinkedBag1<>();
    
	 /* contructors for LinkedBags 
	  * parameters: two objects of LinkedBag type
	 */
	public LinkedBagTest(LinkedBag1<Integer> linkBag3, LinkedBag1<Integer> linkBag22) {
    	
    	this.linkBag = linkBag3;
    	this.linkBag2 = linkBag22;
    	
    }

	 public LinkedBagTest(LinkedBag1<Integer> linkBag3, LinkedBag1<Integer> linkBag22) {
        //TODO Auto-generated constructor stub
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

   /*Returns new bag (intersectionBag) that is the intersection of linkBag and linkBag2 */
   public LinkedBag1<Object> testIntersection() {
	LinkedBag1<Object> intersectionBag = (LinkedBag1<Object>) linkBag.intersection(linkBag2);
	
	Object[] intersectionArray = intersectionBag.toArray();
	
	//print all elements in the intersection
	for (Object element: intersectionArray) {
		System.out.println(element);
	}
	return intersectionBag;
   }
}
