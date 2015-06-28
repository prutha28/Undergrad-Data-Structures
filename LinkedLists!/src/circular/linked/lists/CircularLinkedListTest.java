package circular.linked.lists;


public class CircularLinkedListTest {

	public static void main( String[] args){
		
		CircularLinkedList cc= new CircularLinkedList() ;
		cc.entry = cc.addNode(cc.entry, 9) ;
		cc.entry = cc.addNode(cc.entry, 5) ;
		cc.entry = cc.addNode(cc.entry, 6) ;
		cc.entry = cc.addNode(cc.entry, 4) ;
		cc.entry = cc.addNode(cc.entry, 2) ;
		
		System.out.println("\nAfter inserting 9, 5, 6, 4, 2 in that sequence.");
		cc.display( cc.entry) ;
		System.out.println("\nThe no of elements in the circular list is " + cc.size(cc.entry));
		
		System.out.println("\nAdding another element( 15) to the linked list ...");
		cc.entry = cc.addNode(cc.entry, 15) ;
		cc.display( cc.entry) ;
		
		// Removing elements from the queue.
		cc.entry = cc.removeNode(cc.entry) ;
		System.out.println("\nAfter deleting element from the head.");
		cc.display( cc.entry) ;
		System.out.println("\nThe no of elements in the circular list is " + cc.size(cc.entry));
	}
}
