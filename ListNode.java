public class ListNode {
    Object item; 
    ListNode next;

    public ListNode(Object item) {
	  this.item = item;
	  this.next = null;
    }

    public Object getItem() {
	  return this.item;
    }

    public ListNode getNext() {
	  return next;
    }

    public void setNext(ListNode item) {
	  this.next = item;
    }
}
