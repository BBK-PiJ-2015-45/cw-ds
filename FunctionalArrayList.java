/**
 * A concrete class implementing interface FunctionalList extending extends ArrayList
 * 
 * @author ttadde01
 */

public class FunctionalArrayList extends ArrayList implements FunctionalList{
	
	 /**
     * Method that returns the element at the beginning of the list. 
     * 
     * If the list is empty, an appropriate error is returned. 
     *
     * @return a copy of the element at the beginning of the list or 
     *         an error if the list is empty.
     */
	public ReturnObject head(){
		ReturnObject retObject = get(0);
		return retObject;
	}
	
	
	/**
     * Method that returns a list with the elements in this list except the
     * head. The elements must be in the same order. The original list
     * must not change or be affected by changes in the new list. 
     * 
     * If the list is empty, another empty list is returned. 
     */
	public FunctionalList rest(){
		FunctionalArrayList f1 = new FunctionalArrayList();
		if(this.isEmpty()){
		}
		else
		{
			 Object[] tempItemLists = new Object[listItems.length -1];
			 if ( listItems.length == 1 ){
				tempItemLists[0] = listItems[0];
				f1.listItems = tempItemLists;
				listItems = null;
			 }
			 else{
				f1.listItems = tempItemLists;				
				this.remove(0);
			}
		}
		return f1;
	}
}