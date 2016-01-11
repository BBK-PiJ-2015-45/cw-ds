/**
 * A concrete class implementing interface SampleableList extending extends ArrayList
 * 
 * @author ttadde01
 */
public class SampleableListImpl extends ArrayList implements SampleableList{

	/**
	 * Returns a list containing the first, third, fifth...
	 * items of this list, or an empty list if the list is empty. 
	 * 
	 * @return a list containing the first, third, fifth... items of this list
	 */
	public SampleableList sample(){
		SampleableListImpl s = new SampleableListImpl();
		//Object[] tempList =  new Object[3];
		if(isEmpty()){
			return s;
		}
		else{
			for(int i = 0; i < 5; i += 2){ //increment by 2 to get the first, third and fifth items 
				s.add(this.get(i));
			}
		}
		return s;
	}
}