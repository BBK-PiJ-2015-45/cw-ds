/**
 * A concrete class implementing interface class ImprovedStack
 * 
 * @author ttadde01
 */
public class ImprovedStackImpl implements ImprovedStack {
	
	List list;
	/**
	 * Constructor that takes in a List variable as an argument
	 * 
	 * @param a reference to a List i.e can take ArrayList or LinkedList variable 
	 */
	public ImprovedStackImpl(List list){
		this.list = list;
	}
	
	/**
	 * Method that returns a copy of this stack with the items reversed, the top
	 * elements on the original stack is at the bottom of the new
	 * stack and viceversa.
	 * 
	 * @return a copy of this stack with the items reversed. 
	 */
	public ImprovedStack reverse(){
		ImprovedStack newIS = new ImprovedStackImpl(new LinkedList());
		if(isEmpty()){
			return newIS;
		}
		else{
			int listSize = size() - 1;
			while(listSize >= 0 ){
				push(list.get(listSize));
			}
		}
		
		return newIS;
	}

	/**
	 * Method that removes the given object from the stack if it is
	 * there. Multiple instances of the object are all removed.
	 *
	 * Classes implementing this method must use method .equals() to
	 * check whether the item is in the stack or not.
	 * 
	 * @param object the object to remove
	 */
	public void remove(Object object){
		int counter = 0;
		if(isEmpty()){
			return;
		}
		else{
			while( counter < size()){
				if(list.get(counter).equals(object)){
					list.remove(counter);
				}
				else{
					counter++;
				}
			}
		}
	}
	
	/**
	 * Method that returns true if the stack is empty, false otherwise. 
	 * 
	 * @return true if the stack is empty, false otherwise. 
	 */
	public boolean isEmpty(){
		return this.list.isEmpty();
	}

	/**
	 * Method that returns the number of items currently in the stack.
	 * 
	 * @return the number of items currently in the stack
	 */
	public int size(){
		return this.list.size();
	}

	/**
	 * Method that adds an element at the top of the stack. 
	 * 
	 * @param item the new item to be added
	 */
	public void push(Object item){
		this.list.add(item);
	}

	/**
	 * Method that returns the element at the top of the stack. The stack is
	 * left unchanged.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	public ReturnObject top(){
		return this.list.get(size()-1);
	}

	
	/**
	 * Method that returns the element at the top of the stack. The element is
	 * removed from the stack.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	public ReturnObject pop(){
		return this.list.remove(size()-1);
	}
	
	/**
	 * Method that returns string representation of the stack.
	 * 
	 * @Retrun string representation of the stack.
	 */
	
	public String toString(){
		return this.list.toString();
	}
}