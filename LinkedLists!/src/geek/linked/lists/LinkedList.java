package geek.linked.lists;

public class LinkedList {

	// the dummy.next pointer stores the address of the first node in the LL OR it plays the role of head.

	/*
	 *  We will maintain 2 pointers - head & tail to point to the starting node of the LL
	 *  and the other pointing to the last node in the LL.
	 */
	public Node head ;
	public Node tail ;

	public LinkedList(){
		head = null ;
		tail = null ;
	}

	public LinkedList( int[] arr)
	{
		if( head == null ){
			head = new Node(arr[0], null ) ;
			tail = head ;
		}
		
		for (int i = 1; i < arr.length; i++) {
			this.appendToTail( arr[i]) ;
		}
	}
	
	
	
	/**
	 * This method creates a new Node for the data
	 * and inserts the node at the head.
	 * @param data
	 */
	public Node push( int data ){
		Node newNode = new Node(data, null) ;

		if( head == null )
		{
			// First Insertion.
			head = newNode ;
			tail = head ;
			return head ;
		}

		newNode.next = head ;
		head = newNode ;
		return head ;
	}

	/**
	 * The tail pointer always points to the last node in the LL.
	 * This method creates a newNode and appends it to the end of the LL i.e. at tail.next
	 * @param data
	 * @return the head of the linked list.
	 */
	public Node appendToTail( int data ){
		Node newNode = new Node(data, null) ;
		if( head == null ){
			head = newNode ;
			tail = head ;
			return head ;
		}
		
		tail.next = newNode ;
		tail = tail.next ;	// DONT FORGET TO ADVANCE THE TAIL POINTER.
		return head ;
	}

/**
 * This method appends the newNode to the tail of the linked list on which it is being called.
 * @param data
 * @param newNode
 * @return the head of the list.
 */
	public Node appendToTail( Node head, Node newNode ){
		
		if( head == null ){
			head = newNode ;
			tail = head ;
			return head ;
		}
		
		tail.next = newNode ;
		tail = tail.next ;	// DONT FORGET TO ADVANCE THE TAIL POINTER.
		return head ;
	}	
	
	
	public void printList(Node node)
	{
		Node current = node ;
		
		while( current != null)
		{
			System.out.printf("%4d", current.data );
			current = current.next ;
		}
	}
}
