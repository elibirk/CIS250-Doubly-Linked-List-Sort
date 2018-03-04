
public class DLLNode {
	protected String element;
	protected DLLNode next, prev;
	
	public DLLNode (String e){
		element = e;
		prev = null;
		next = null;
	}//end constructor
	
    public String getElement() {
    	return element;
    }//end getElement
    public DLLNode getPrev() {
    	return prev;
    }//end getPrev
    public DLLNode getNext() {
    	return next;
    }//end getNext
    public void setElement(String e){
		element = e;
	}//end setElement
    public void setPrev(DLLNode newPrev) {
    	prev = newPrev;
    }//end setPrev
    public void setNext(DLLNode newNext) {
    	next = newNext;
    }//end setNext  

}//end class
