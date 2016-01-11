/**
 * Test class for class SampleableListImpl 
 * 
 * @author ttadde01
 */

public class SampleableListImplTest{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){		
		SampleableList sl = new SampleableListImpl();
		System.out.println(sl);
		SampleableList s2 = sl.sample();
		System.out.println(s2);
		sl.add("One");
		sl.add("Two");
		sl.add("Three");
		sl.add("Four");
		sl.add("Five");
		s2 = sl.sample();
		System.out.println(s2);
	}
	
}