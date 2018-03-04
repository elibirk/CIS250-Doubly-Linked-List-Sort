
public class DLL {
	public static DLLNode head, tail;
	protected static int size;
	
	public DLL (){
		head = new DLLNode(null);
		tail = new DLLNode(null);
		head.setNext(tail);
		tail.setPrev(head);
	}//end constructor
	
	public void addFirst(DLLNode v) {
		DLLNode w = head.getNext();
	    v.setNext(w);
	    v.setPrev(head);
	    w.setPrev(v);
	    head.setNext(v);
	    size = size++;
	}//end addFirst
	
	public void removeLast(){
		if(size == 0){
			System.out.println("List is empty ecannot remove anything.");
		}//end if
		else{
			DLLNode v = tail.getPrev();
			DLLNode u = v.getPrev();
			tail.setPrev(u);
			u.setNext(tail);
		    v.setPrev(null);
		    v.setNext(null);
		    size = size--;
		}//end else
		
	}//end removeLast
	
	public void addAfter(DLLNode v, DLLNode z){
	    DLLNode w = v.getNext();
	    z.setPrev(v);
	    z.setNext(w);
	    w.setPrev(z);
	    v.setNext(z);
	    size = size++;
	}//end addAfter
	
	public void remove(DLLNode v){
	    DLLNode u = v.getPrev();
	    DLLNode w = v.getNext();
	    w.setPrev(u);
	    u.setNext(w);
	    v.setPrev(null);
	    v.setNext(null);
	    size = size--;
	}//end remove
	
}//end class
