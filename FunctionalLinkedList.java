/**
 * A concrete class implementing interface FunctionalList extending extends ArrayList
 * 
 * @author ttadde01
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList
{
	/**
     * Method that returns the element at the beginning of the list. 
     * 
     * If the list is empty, an appropriate error is returned. 
     *
     * @return a copy of the element at the beginning of the list or 
     *         an error if the list is empty.
     */
    public ReturnObject head(){
		ReturnObject rObject = this.get(0);
		return rObject;
	}

    /**
     * Method that returns a list with the elements in this list except the
     * head. The elements must be in the same order. The original list
     * must not change or be affected by changes in the new list. 
     * 
     * If the list is empty, another empty list is returned. 
     */
    public FunctionalList rest(){
		FunctionalList f = new FunctionalLinkedList();
		if(isEmpty()){
			return f;
		}
		else{
			ListNode temp = this.first;
			//length++;
			do{
				f.add(temp.getItem());
				temp = temp.next;
			}
			while(temp != null);
			f.remove(0);
		}
		return f;
	}
}