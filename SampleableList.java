/**
 * A sampleable list can be sampled. 
 * 
 * @author ttadde01
 */
public interface SampleableList extends List {
	/**
	 * Returns a list containing the first, third, fifth...
	 * items of this list, or an empty list if the list is empty. 
	 * 
	 * @return a list containing the first, third, fifth... items of this list
	 */
	public SampleableList sample();
}
