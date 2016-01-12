/**
 * A concrete class implementing interface List based on pointers called LinkedList.
 * 
 * @author ttadde01
 */
public class LinkedList implements List{

	ListNode first;  
	
	/** 
	* Constructor for class LinkedList
	* @param none
	*/	
	 public LinkedList() {
	  first = null; 
    }
	
	
	
	/**
	 * Method that returns true if the list is empty, false otherwise. 
	 * 
	 * @return true if the list is empty, false otherwise. 
	 */
	public boolean isEmpty(){
		if(this.first == null )
			return true;
		else
			return false;
	}

	/**
	 * Method that returns the number of items currently in the list.
	 * 
	 * @return the number of items currently in the list
	 */
	public int size(){
		int length = 0;
		if(this.first != null){
			ListNode temp = this.first;
			length++;
			while(temp.next != null){
				length++;
				temp = temp.next;
			}
		}
		return length;
	}

	/**
	 * Method that returns the elements at the given position. 
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */
	public ReturnObject get(int index){
		int curLoc = 0;
		ReturnObject returnObject = null;
		boolean found = false;// dummy variable used to check if an object has been found or not.
		if(!isEmpty()){
			ListNode temp = this.first;
			while(temp != null && found != true){
				if(index == curLoc){
					returnObject = new ReturnObjectImpl(temp.getItem());
					found = true;
				}
				curLoc++;
				temp = temp.next;
			}
			if(!found){
				returnObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			}
		}
		else{
			returnObject = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		return returnObject;
	}

	/**
	 * Method that returns the elements at the given position and removes it
	 * from the list. The indexes of elements after the removed
	 * element must be updated accordingly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */
	public ReturnObject remove(int index){
		int curLoc = 0;
		ReturnObject returnObject = null;
		boolean found = false;
		if(!isEmpty()){
			ListNode temp = this.first;
			ListNode previous = this.first;
			do{
				if(index == curLoc){
					returnObject = new ReturnObjectImpl(temp.getItem());
					if(previous == temp)// checking if previous and temp are referring to the same object. this only happens for the first node.
						this.first = temp.next;
					else					
						previous.next = temp.next;
					found = true;
				}
				curLoc++;
				previous = temp;
				temp = temp.next;
			}while(temp != null && found != true);
			
			if(!found){
				returnObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			}
		}
		else{
			returnObject = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		
		return returnObject;
	}

	/**
	 * Method that adds an element to the list, inserting it at the given
	 * position. The indeces of elements at and after that position
	 * must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param index the position at which the item should be inserted in
	 *              the list
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         the item added or containing an appropriate error message
	 */
	public ReturnObject add(int index, Object item){
		int curLoc = 0;
		ReturnObject returnObject = null;
		boolean found = false;
		if(!isEmpty()){
			ListNode temp = this.first;
			ListNode previous = this.first;
			do{
				if(index == curLoc){
					returnObject = new ReturnObjectImpl(temp.getItem());
					ListNode newNode = new ListNode(item);
					previous = temp;
					temp = previous.next;
					previous.next = newNode;
					newNode.next = temp;
					found = true;
				}
				if(!found){
					curLoc++;
					previous = temp;
					temp = temp.next;
				}
			}while(temp != null && found != true);
		}
		else{
			if(index == 0){
				add(item);
				returnObject = new ReturnObjectImpl(item);
				found = true;
			}
		}
		
		if(!found){
			returnObject = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}		
		return returnObject;
	}

	/**
	 * Method that adds an element at the end of the list.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         the item added or containing an appropriate error message
	 */
	public ReturnObject add(Object item){
		ReturnObject returnObject;
		if(item == null){
			returnObject = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		ListNode newNode = new ListNode(item);
		if (this.first == null){
			this.first = newNode;
			returnObject = new ReturnObjectImpl(item);
			return returnObject;
		}
		ListNode temp = this.first;
		
		//traversing the linked list to the end node
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
		returnObject = new ReturnObjectImpl(item);
		return returnObject;
	}
	
	
	/**
	 * Overriding method toString of the Object class.
	 * Used to show the String representation of the objects in the list.
	 *
	 *@return String representation of the objects in the list or EMPTY_STRUCTURE if empty
	 */
	public String toString(){
		String strRepresentaion = "";
		if(!isEmpty()){
			ListNode temp = this.first;
			do{
				strRepresentaion += " " + temp.getItem();
				temp = temp.next;
			}while(temp != null);
		}
		else{
			strRepresentaion = strRepresentaion + ErrorMessage.EMPTY_STRUCTURE;
		}
		return strRepresentaion;
	}
}