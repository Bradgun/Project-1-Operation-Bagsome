/**
    A class of bags whose entries are stored in a chain of linked nodes.
    The bag is never full.
    INCOMPLETE DEFINITION; includes definitions for the methods add,
    toArray, isEmpty, and getCurrentSize.
    @author Frank M. Carrano, Timothy M. Henry
    @version 5.0
*/
public final class LinkedBag1<T> implements BagInterface<T>
{
	private Node firstNode ;       // Reference to first node
	private int numberOfEntries;

	public LinkedBag1()
	{
		firstNode = null;
      numberOfEntries = 0;
	} // end default constructor

	/** Adds a new entry to this bag.
	    @param newEntry  The object to be added as a new entry.
	    @return  True. */
	public boolean add(T newEntry) // OutOfMemoryError possible
	{
      // Add to beginning of chain:
		Node newNode = new Node(newEntry);
		newNode.next = firstNode;  // Make new node reference rest of chain
                                 // (firstNode is null if chain is empty)
      firstNode = newNode;       // New node is at beginning of chain
		numberOfEntries++;
      
		return true;
	} // end add

	/** Retrieves all entries that are in this bag.
       @return  A newly allocated array of all the entries in this bag. */
	public T[] toArray()
	{
      // The cast is safe because the new array contains null entries.
      @SuppressWarnings("unchecked")
      T[] result = (T[])new Object[numberOfEntries]; // Unchecked cast
      
      int index = 0;
      Node currentNode = firstNode;
      while ((index < numberOfEntries) && (currentNode != null))
      {
         result[index] = currentNode.data;
         index++;
         currentNode = currentNode.next;
      } // end while
      
      return result;
      // Note: The body of this method could consist of one return statement,
      // if you call Arrays.copyOf
	} // end toArray
   
	/** Sees whether this bag is empty.
       @return  True if the bag is empty, or false if not. */
	public boolean isEmpty()
	{
		return numberOfEntries == 0;
	} // end isEmpty
   
	/** Gets the number of entries currently in this bag.
       @return  The integer number of entries currently in the bag. */
	public int getCurrentSize()
	{
		return numberOfEntries;
	} // end getCurrentSize

	/** Creates a new bag.
	 * The new bag is the union of the two bags
	@param anotherBag  the other bag is combined with this bag
       @return  A new bag that is the union of the two bags
	 */
	public LinkedBag1<T> union(BagInterface<T> otherBag) {
		LinkedBag1<T> resultBag = new LinkedBag1<>();
	
	 /** All characters from this bag */
	  Node current = this.firstNode; 
	  while(current != null) {
		resultBag.add(current.data);
		current = current.next;
	  }

	  /** All characters from anotherBag */
	  if (otherBag != null) {
		T[] otherArray = otherBag.toArray();
		for (T entry : otherArray) {
			resultBag.add(entry);
			}
		}
	  return resultBag;

	}
	  //end of union
   
	//new bag is the overlapping entries using intersection
        @Override
	public BagInterface<T> intersection(BagInterface<T> otherBag) {

		//creates a new bag
		BagInterface<T> resultBag = new LinkedBag1<>();

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
		T[] arrayBag = this.toArray();
		T[] arrayBag2 = otherBag.toArray();

		//loops through first bag
		for (int i = 0; i < arrayBag.length; i++) {
			//placeholder for value in array to compare
			T firstValue = arrayBag[i];
			//check if firstValue isn't null
			if (firstValue != null) {
			//loops through second bag
			for (int j = 0; j < arrayBag2.length; j++) {
				
				//placeholder for value in second array to compare
				T secondValue = arrayBag2[j];
				
				//compares values between first and second bag
				if (firstValue.equals(secondValue)) {
					
					resultBag.add(firstValue);


				}
			}
		}
	}
		return resultBag;
	}
	//end of intersection
// STUBS:

	/** Removes one unspecified entry from this bag, if possible.
       @return  Either the removed entry, if the removal
                was successful, or null. */
	public T remove()
   {
      return null; // STUB
   } // end remove
   
	/** Removes one occurrence of a given entry from this bag.
       @param anEntry  The entry to be removed.
       @return  True if the removal was successful, or false otherwise. */
   public boolean remove(T anEntry)
   {
	Node current = firstNode;
        Node previous = null;

        // Check if the firstNode needs to be removed
        if (current != null && current.getData() == anEntry) {
            firstNode = current.next; // Move firstNode to next node
            return true;
        }

        // Traverse the list to find the node to remove
        while (current != null && current.getData() != anEntry) {
            previous = current;
            current = current.next;
        }

        // If the anEntry was not found in the list
        if (current == null) {
            //System.out.println("Data not found in the list.");
            return true;
        }

        // Unlink the node from the list
        previous.next = current.next;
    
      return false; // STUB
   } // end remove
	
	/** Removes all entries from this bag. */
	public void clear()
   {
      // STUB
   } // end clear
	
	/** Counts the number of times a given entry appears in this bag.
		 @param anEntry  The entry to be counted.
		 @return  The number of times anEntry appears in the bag. */
	public int getFrequencyOf(T anEntry)
   {
      return 0; // STUB
   } // end getFrequencyOf
	
	/** Tests whether this bag contains a given entry.
		 @param anEntry  The entry to locate.
		 @return  True if the bag contains anEntry, or false otherwise. */
	public boolean contains(T anEntry)
   {
	Node tempNode = firstNode;

	while (tempNode != null) {
		if(tempNode.getData() == anEntry)
			return true;

		else
			tempNode = tempNode.getNextNode();
	}
      return false;
   } // end contains

    @Override
    public BagInterface<T> difference(BagInterface<T> bag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

	private class Node
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} 

		/* returns node data */

		private T getData(){

			return data;
		}

		/* returns next node */
		public Node getNextNode() {
			return next;
	} // end Node
} // end LinkedBag1
}



