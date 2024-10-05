public class BagDriver {
    public static void main(String[] args) {

        /*  
         * creates bag objects of resizable array
        */
        ResizableArrayBag arrayBag = new ResizableArrayBag();
        ResizableArrayBag arrayBag2 = new ResizableArrayBag();

        /*  
         * creates bag objects of linked list
        */
        LinkedBag1 linkBag = new LinkedBag1();
        LinkedBag1 linkBag2 = new LinkedBag1();

        /*  
         * creates testing objects for difference of resizable and link list test classes
        */
        ResizableArrayBagTest testObj = new ResizableArrayBagTest(arrayBag, arrayBag2);
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
         *Prints out the array difference between the ArrayBag and ArrauBag2 contents
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

	}
}
