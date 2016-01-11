/**
 * Test class for class StackImpl 
 * 
 * @author ttadde01
 */
 
 public class ImprovedStackImplTest{
 
	public static void main(String args[]){
		List l = new LinkedList();
		ImprovedStackImpl iStack = new ImprovedStackImpl(l);
	
		System.out.println("Popping from an empty stack : " + iStack.pop());
		System.out.println("Adding three objects of String 1-3:");
		iStack.push("One");
		iStack.push("Two");
		iStack.push("Three");
		
		System.out.println("Printing content : " + iStack);
		
		System.out.println("Reversed stack : " + iStack.reverse());
		
		System.out.println("The size of the stack should be 3: " + iStack.size());

		System.out.println("Pop should return String Three: " + iStack.pop());
		
		System.out.println("The size of the stack should be 2: " + iStack.size());
		
		System.out.println("Printing content : " + iStack);		
	}	
 }