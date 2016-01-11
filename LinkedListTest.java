/**
 * Test class for class LinkedList 
 * 
 * @author ttadde01
 */
 
 public class LinkedListTest{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		System.out.println("The item at index 0 is = " + ((ReturnObjectImpl)ll.get(0)).getRetObject());
		System.out.println("Number of Items in list = " + ll.size());
		ll.add("One");
		ll.add("Two");
		System.out.println("Number of Items in list = " + ll.size());
		ll.add("Three");
		ll.add("Four");
		System.out.println("Number of Items in list = " + ll.size());
		System.out.println("The item at index 3 is = " + ((ReturnObjectImpl)ll.get(3)).getRetObject());
		System.out.println("The item at index 0 is = " + ((ReturnObjectImpl)ll.get(-1)).getRetObject());
		System.out.println("The item at index 0 is = " + ((ReturnObjectImpl)ll.get(10)).getRetObject());
		ll.remove(1);
		System.out.println(ll);
		System.out.println("The item at index 1 is = " + ((ReturnObjectImpl)ll.get(1)).getRetObject());
		ll.remove(2);
		System.out.println(ll);
		System.out.println("Number of Items in list = " + ll.size());
		ll.remove(10);
		System.out.println(ll);
		System.out.println("The item at index 0 is = " + ((ReturnObjectImpl)ll.get(0)).getRetObject());
		ll.remove(-1);
		System.out.println("Number of Items in list = " + ll.size());
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll);
		ll.add(0, "five");
		System.out.println(ll);
		ll.add(10, "Void");
		System.out.println(ll);
		ll.add(-1, "void");
		System.out.println("Number of Items in list = " + ll.size());
		ll.add("Six");
		ll.add("Seven");
		ll.add(1, "Eight");
		System.out.println(ll);
		ll.add(3, "Nine");
		System.out.println(ll);		
	}
 }