/**
 * Test class for class ArrayList 
 * 
 * @author ttadde01
 */
 
 public class FunctionalLinkedListTest{
	public static void main(String args[]){
		FunctionalLinkedList fll = new FunctionalLinkedList();
		
		System.out.println(fll.head());
		fll.add("One");
		fll.add("Two");
		fll.add("Three");
		System.out.println(fll);
		
		FunctionalLinkedList sfll = (FunctionalLinkedList)fll.rest();
		System.out.println(sfll);
		sfll.head();
		sfll.add("Four");
		sfll.add("Five");
		System.out.println(sfll);
		System.out.println(fll);
	}
 }