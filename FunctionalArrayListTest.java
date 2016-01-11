/**
 * Test class for class ArrayList 
 * 
 * @author ttadde01
 */
 
 public class FunctionalArrayListTest{
	public static void main(String args[]){
		FunctionalArrayList f = new FunctionalArrayList();
		System.out.println(f.head());
		f.add("One");
		f.add("Two");
		f.add("Four");
		System.out.println("Printing the head " +f.head());
		System.out.println("Printing Original");
		for(Object ob: f.listItems)
			System.out.println(ob);
		FunctionalList f1 = f.rest();
		f1.add("Three");
		System.out.println("Printing Second");
		for(Object ob: ((FunctionalArrayList)f1).listItems)
			System.out.println(ob);
		System.out.println("Printing Original");
		for(Object ob: f.listItems)
			System.out.println(ob);
	}
 }