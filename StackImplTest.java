/**
 * Test class for class StackImpl 
 * 
 * @author ttadde01
 */
 
 public class StackImplTest{
	public static void main(String args[]){
		List l = new ArrayList();
		StackImpl si = new StackImpl(l);
		
		si.pop();
		
		si.push("One");
		System.out.println(si);
		si.push("Two");
		si.push("Three");
		si.push("Four");
		System.out.println(si);
		System.out.println(si.top());
		si.push("Five");
		System.out.println("HI" + si);
		System.out.println(si.pop());
		System.out.println(si.pop());
		System.out.println(si.pop());
		System.out.println(si.pop());
		System.out.println(si.pop());
		System.out.println(si.pop());
		System.out.println(si);	
	
		System.out.println("Hello World");
	}
 }