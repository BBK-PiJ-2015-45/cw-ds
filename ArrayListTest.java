/**
 * Test class for class ArrayList 
 * 
 * @author ttadde01
 */
 
 public class ArrayListTest{
	public static void main(String args[]){		
		List al = new ArrayList();
		System.out.println("The size of the array list = " + al.size());
		System.out.println("Content of arraylist = " + al);
		al.add("One");
		al.add("Two");
		System.out.println("The size of the array list = " + al.size());
		System.out.println("Content of arraylist = " + al);
		al.add(0, "Three");
		System.out.println("The size of the array list = " + al.size());
		System.out.println("Content of arraylist = " + al);
		al.add(1, "Four");
		System.out.println("The size of the array list = " + al.size());
		System.out.println("Content of arraylist = " + al);
		al.add(4, "Five");
		System.out.println("The size of the array list = " + al.size());
		System.out.println("Content of arraylist = " + al);
		al.add(7, "Six");
		System.out.println("The size of the array list = " + al.size());
		System.out.println("Content of arraylist = " + al);
		
		
		al.remove(0);
		System.out.println("The size of the array list = " + al.size());
		System.out.println("Content of arraylist = " + al);
		al.remove(2);
		System.out.println("The size of the array list = " + al.size());
		System.out.println("Content of arraylist = " + al);
		al.remove(2);
		System.out.println("The size of the array list = " + al.size());
		System.out.println("Content of arraylist = " + al);
		al.remove(4);
		System.out.println("The size of the array list = " + al.size());
		System.out.println("Content of arraylist = " + al);
		
		System.out.println(((ReturnObjectImpl)al.get(0)).getRetObject());		
		}
 }