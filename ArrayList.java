/**
 * A concrete class implementing interface List based on array
 * 
 * @author ttadde01
 */
public class ArrayList implements List{

	Object [] listItems = null;
	

	/**
	 * Method that returns true if the list is empty, false otherwise. 
	 * 
	 * @return true if the list is empty, false otherwise. 
	 */
	public boolean isEmpty(){
		if (this.listItems == null) {
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * Method that returns the number of items currently in the list.
	 * 
	 * @return the number of items currently in the list
	 */
	public int size(){
		if (this.isEmpty()) {
			return 0;
		}
		else{
			return this.listItems.length;
		}
	}

	/**
	 * Method that Returns the elements at the given position. 
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an error message INDEX_OUT_OF_BOUNDS is returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */
	public ReturnObject get(int index){
		if (this.isEmpty()) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		else{
			if( index < this.listItems.length && index >= 0){
				return new ReturnObjectImpl( this.listItems[index]);
			}else{
				return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			}
		}
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
		ReturnObject returnObject = null;
		//handling remove for list with 0 element only
		if (this.isEmpty()) {
			returnObject =new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		else{
			if (index < this.size() && index >= 0){
				//handling remove for list with 1 element only
				if(this.listItems.length == 1){
					returnObject = new ReturnObjectImpl(listItems[index]);// index can only be 0 here
					this.listItems = null;
				}
				//handling remove for list with 2 or more element only
				else{
					Object[] newListItems = new Object[this.listItems.length - 1];
					int dummy = 0; // dummy variable used to ignore copying Object when index equals i declared below
					for(int i = 0; i < this.listItems.length; i++){
						if(i != index){
							newListItems[i - dummy] = listItems[i];
						}
						else{
							dummy = 1;
						}
					}
					returnObject = new ReturnObjectImpl(listItems[index]);
					this.listItems = newListItems;
				}				
			}
			//handling remove for index value larger than the list size
			else{
				returnObject =new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			}
		}
		return returnObject;
	}
	
	/**
	 * Method that add an element to the list, inserting it at the given
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
		ReturnObject returnObject = null;
		if (this.isEmpty()) {
			if(index == 0){
				Object[] newListItems = new Object[1];
				newListItems[0] = item;
				this.listItems = newListItems;
				returnObject =new ReturnObjectImpl(item);
			}
			
		}
		else{
			if (index <= this.listItems.length && index >= 0){
				Object[] newListItems = new Object[this.listItems.length + 1];
				// dummy is a variable used to ignore copying Object when index equals i declared below
				for(int i = 0, dummy = 0; i < newListItems.length; i++){
					if(i != index){
						newListItems[i] = listItems[i - dummy];
					}
					else{
						dummy = 1;
						newListItems[i] = item;
					}
				}
				this.listItems = newListItems;
				returnObject = new ReturnObjectImpl(listItems[index]);				
			}
			else{
				returnObject =new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			}
		}
		return returnObject;
	}

	/**
	 * Adds an element at the end of the list.
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
		ReturnObject returnObject = null;
		if (this.isEmpty()) {
			Object[] newListItems = new Object[1];
			newListItems[0] = item;
			this.listItems = newListItems;
			returnObject =new ReturnObjectImpl(item);
		}
		else{
			Object[] newListItems = new Object[this.listItems.length + 1];
			for(int i = 0; i < this.listItems.length; i++){
				newListItems[i] = listItems[i];
			}
			newListItems[newListItems.length - 1] = item;
			returnObject = new ReturnObjectImpl(item);
			this.listItems = newListItems;
		}
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
			for (Object o : this.listItems){
				strRepresentaion += o + " ";
			}
		}
		else{
			strRepresentaion = strRepresentaion + ErrorMessage.EMPTY_STRUCTURE;
		}
		return strRepresentaion;
	}
}
