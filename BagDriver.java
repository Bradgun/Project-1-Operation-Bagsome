
public class BagDriver {
    
    public static void main(String[] args) {

        /*  
         * creates bag objects of resizable array
        */
        ResizableArrayBag<Object> arrayBag = new ResizableArrayBag<>();
        ResizableArrayBag<Object> arrayBag2 = new ResizableArrayBag<>();

        /*  
         * creates bag objects of linked list
        */
        LinkedBag1<Object> linkBag = new LinkedBag1<>();
        LinkedBag1<Object> linkBag2 = new LinkedBag1<>();

        /*  
         * creates testing objects for difference of resizable and link list test classes
        */
        ResizableArrayBagTest<Object> testObj = new ResizableArrayBagTest<>(arrayBag, arrayBag2);
        LinkedBagTest testObj1 = new LinkedBagTest(linkBag, linkBag2);
	

        /*  
         * generates random values between min and max
         * for contents of bags
        */
        int max = 20;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < 10; i++) {
            arrayBag.add((int)(Math.random() * range) + min);
            arrayBag2.add((int)(Math.random() * range) + min);
            linkBag.add((int)(Math.random() * range) + min);
            linkBag2.add((int)(Math.random() * range) + min);
        }

        /* tests to see if bag is null */
        testObj.testNull();
        testObj1.testNull();

        /*  
         *Prints out the array difference between the ArrayBag and ArrayBag2 contents
        */
        System.out.println("\nArrayBag contents:\n");
        for(int i = 0; i < 10; i++) {
            System.out.println(arrayBag.toArray()[i]);
        }

        System.out.println("\nArrayBag2 contents:\n");
        for(int i = 0; i < 10; i++) {
            System.out.println(arrayBag2.toArray()[i]);
        }

         /* prints out different in ArrayBag */ 
        testObj.testDifferenceArray();

        /*  
         *Prints out the contents between the LinkBag and LinkBag2 contents
        */
        System.out.println("\nLinkBag contents:\n");
        for(int i = 0; i < 10; i++) {
            System.out.println(linkBag.toArray()[i]);
        }

        System.out.println("\nLinkBag2 contents:\n");
        for(int i = 0; i < 10; i++) {
            System.out.println(linkBag2.toArray()[i]);
        }

         /* prints out different in LinkBag */
        testObj1.testDifferenceLink();

        /*
         * Union of the two arrayBags
         */
        BagInterface<Object> arrayUnionBag = arrayBag.union(arrayBag2);
        System.out.println("\nUnion of arrayBag and arrayBag2:");
        for (int i = 0; i < arrayUnionBag.getCurrentSize(); i++) {
            System.out.println(arrayUnionBag.toArray()[i]);
        }


        /*
         * Union of the two linkBags
         */
        BagInterface<Object> linkUnionBag = linkBag.union(linkBag2);
        System.out.println("\nUnion of linkBag and linkBag2:");
        for (int i = 0; i < linkUnionBag.getCurrentSize(); i++) {
            System.out.println(linkUnionBag.toArray()[i]);
        }
        /*
         * Intersection of the two arrayBags
         */
        BagInterface<Object> arrayBagIntersect = arrayBag.intersection(arrayBag2);
        System.out.println("The intersection of the two array bags are:");
        System.out.println(arrayBagIntersect);

        /*
         * Intersection of the two linkedBags
         */
        BagInterface<Object> linkedBagIntersect = linkBag.intersection(linkBag2);
        System.out.println("The intersection of the two linked bags are:");
        System.out.println(linkedBagIntersect);
        }
        
       // private Object[] toArray() {
            // TODO Auto-generated method stub
           // throw new UnsupportedOperationException("Unimplemented method 'toArray'");
        
    
    
       // private boolean isEmpty() {
            // TODO Auto-generated method stub
           // throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");

    }
