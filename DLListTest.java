import java.io.FileNotFoundException;
import java.io.IOException;

public class DLListTest {
	public static void main(String[]args) throws IOException, FileNotFoundException{

	DLL list = new DLL();
	DLLNode filler;
	
	for (Integer i = 0; i <= 133; i++) {
		filler = new DLLNode (i.toString());
		list.addFirst(filler);
	}//end for
	
	DLLNode headptr;
	DLLNode head2;
	DLLNode tailptr;
	long startTime;
	long endTime;
	long time;
	
	startTime = System.nanoTime();
	headptr = DLL.head.getNext();
	head2 = DLL.head;
	tailptr = DLL.tail.getPrev();
	
	while(headptr != tailptr && head2 != tailptr){
		headptr = headptr.getNext();
		head2 = head2.getNext();
		tailptr = tailptr.getPrev();
		if(headptr == tailptr || head2 == tailptr){
			System.out.println("Middle was found, it contains the value " + tailptr.getElement());
			break;
		}//end if
	} //end while
	endTime = System.nanoTime();
	time = endTime - startTime;
	
	System.out.println("Finding the middle took " + time + " nanoseconds.");
	
	}//end main
}//end class
