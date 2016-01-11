/**
 * A concrete class extending abstract class AbstractStack
 * 
 * @author ttadde01
 */

public class StackImpl extends AbstractStack {
	
	/**
	 * Method that returns true if the stack is empty, false otherwise. 
	 * 
	 * @return true if the stack is empty, false otherwise. 
	 */
	public boolean isEmpty(){
		return this.internalList.isEmpty();
	}
	
	/**
	 * Mehod that returns the number of items currently in the stack.
	 * 
	 * @return the number of items currently in the stack
	 */
	public int size(){
		return this.internalList.size();
	}

	/**
	 * Metod that adds an element at the top of the stack. 
	 * 
	 * @param item the new item to be added
	 */
	public void push(Object item){
		this.internalList.add(item);
	}

	/**
	 * Method that returns the element at the top of the stack. The stack is
	 * left unchanged.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	public ReturnObject top(){
		return this.internalList.get(this.internalList.size() - 1);
	}

	/**
	 * Method that returns the element at the top of the stack. The element is
	 * removed frmo the stack.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */
	public ReturnObject pop(){
		return this.internalList.remove(this.internalList.size() - 1);
	}
	
	public StackImpl(List list) {
	  super(list);
    }
	
	public String toString(){
		return this.internalList.toString();
	}
}