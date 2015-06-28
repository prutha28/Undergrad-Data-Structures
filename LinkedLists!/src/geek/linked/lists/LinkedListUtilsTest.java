package geek.linked.lists;

public class LinkedListUtilsTest {

	public static void main( String args[]){

		LinkedList list = new LinkedList() ;
		Node head = list.push( 5 ) ;
		head = list.push( 7 ) ;
		head = list.push( 2 ) ;
		head = list.push( 4 ) ;
		//		head = list.push( 9 ) ;
		//		head = list.push( 11 ) ;

		list.printList( head ) ;

		System.out.println("\nThe element at index 5 is " + LinkedListUtils.getNodeAtIndex(head, 5));
		// Invalid Index.
		//System.out.println("\nThe element at index 5 is " + LinkedListUtils.getNodeAtIndex(head, 8));

		System.out.println("Appending 8 & 2... ");
		//		head = list.appendToTail( 8 ) ;	
		//		head = list.appendToTail( 2 ) ;
		list.printList(head) ;

		// Iterative
		System.out.println("\nThe number of elements in the linked list is " + LinkedListUtils.count(head));
		System.out.println("The number of occurences of 2 in the linked list is " + LinkedListUtils.countOccurences(head, 2));
		System.out.println("The number of occurences of 5 in the linked list is " + LinkedListUtils.countOccurences(head, 5));
		System.out.println("The number of occurences of 6 in the linked list is " + LinkedListUtils.countOccurences(head, 6));

		// Recursive
		System.out.println("The number of occurences of 2 in the linked list is " + LinkedListUtils.countOccurences_rec(head, 2));

		// Getting the Nth node from the end of the linked list.
		LinkedListUtils.getNthNodeFromEnd(head, 3);
		System.out.println();
		LinkedListUtils.getNthNodeFromEnd2(head, 3);

		// Obtaining the mid point of the linked list.
		System.out.println("\nThe mid point of the linked list is " + MiddleOfLL.getMid(head));

		// Deleting the list
		//		head = LinkedListUtils.deleteList(head) ;
		//		System.out.println("Deleting the list ...");
		//		list.printList(head) ;

		// testing if the 2 linked lists are identical. 

		LinkedList otherList = new LinkedList() ;
		Node otherHead = otherList.push( 5 ) ;
		otherHead = otherList.push( 7 ) ;
		otherHead = otherList.push( 2 ) ;
		otherHead = otherList.push( 4 ) ;
		//				otherHead = otherList.push( 9 ) ;
		//		otherHead = otherList.push( 11 ) ;
		//		otherHead = otherList.appendToTailndToTail(9) ;

		System.out.println("__________________________________________________________");
		System.out.println("\nThe first list is");
		list.printList(head) ;
		System.out.println("\nThe second list is");
		otherList.printList(otherHead) ;
		System.out.println("\nChecking if the lists are identical, Iteratively");
		if( LinkedListUtils.areIdentical(head, otherHead))
			System.out.println("The lists are Identical");
		else
			System.out.println("The lists are Not Identical");

		System.out.println("\nChecking if the lists are identical, Recursively");
		if( LinkedListUtils.isIdentical(head, otherHead))
			System.out.println("The lists are Identical");
		else
			System.out.println("The lists are Not Identical");


		// Performing sorted merge on lists a & b
		int[] arr1 = { 2, 3, 5, 6, 8, 14} ;
		int[] arr2 = { 2, 5, 7, 10, 18} ;

		LinkedList list1 = new LinkedList(arr1) ;
		LinkedList list2 = new LinkedList(arr2) ;

		System.out.println("Performing sorted merge on lists : ");
		System.out.println("\nThe first list is");
		list1.printList(list1.head) ;
		System.out.println("\nThe second list is");
		list2.printList(list2.head) ;

		LinkedList resultList = new LinkedList() ;
		//		resultList.head = LinkedListUtils.sortedMerge(list1.head , list2.head) ;	// Iterative
		resultList.head = LinkedListUtils.sortedMerge1(list1.head, list2.head) ;	// Recursive
		System.out.println("\nThe resulting list is ");
		resultList.printList(resultList.head) ;

		// PAIRWISE SWAPPING THE CONTENTS OF A LINKED LIST.
		System.out.println();
		System.out.println("PAIRWISE SWAPPING THE CONTENTS OF A LINKED LIST");
		System.out.println("____________Iterative_______________________________________");
		LinkedListUtils.pairwiseSwap(resultList.head) ;
		resultList.printList(resultList.head) ;

		System.out.println();
		System.out.println("____________Recursive_______________________________________");
		LinkedListUtils.pairwiseSwap1(resultList.head) ;
		resultList.printList(resultList.head) ;

		// REMOVING DUPLICATES IN A SORTED LIST.
		System.out.println();
		System.out.println("\nRemoving Duplicates from the resulting list.");
		resultList.head = LinkedListUtils.removeDuplicatesInSorted(resultList.head) ;
		resultList.printList(resultList.head) ;

		// MOVE THE LAST NODE TO THE FIRST.
		System.out.println();
		System.out.println("\nAfter moving the last node to the beginning");
		resultList.head = LinkedListUtils.moveLastToFirst(resultList.head) ;
		resultList.printList(resultList.head) ;

		// PRINTING THE ELEMENTS OF A LINKED LIST IN THE REVERSE.
		System.out.println();
		System.out.println("\nPrinting the elements of the linked list in the reverse");
		LinkedListUtils.printReverse(resultList.head) ;

		//		resultList.head = LinkedListUtils.reverse(resultList.head) ;
		//		resultList.printList(resultList.head) ;


		// SUM OF 2 NUMBERS REPRESENTED AS LINKED LISTS.

		/**
		Given two numbers represented by two lists, write a function that returns sum list. The sum list is list representation of addition of two input numbers.

		Example 1

		Input:
		  First List: 5->6->3  // represents number 365
		  Second List: 8->4->2 //  represents number 248
		Output
		  Resultant list: 3->1->6  // represents number 613
		Example 2

		Input:
		  First List: 7->5->9->4->6  // represents number 64957
		  Second List: 8->4 //  represents number 48
		Output
		  Resultant list: 5->0->0->5->6  // represents number 65005


		 **/

		int[] arr3 = { 6, 5, 3 } ;
		int[] arr4 = { 1, 6, 7 } ;

		LinkedList list3 = new LinkedList(arr3) ;
		LinkedList list4 = new LinkedList(arr4) ;
		
		System.out.println("\nSumming up lists : ");
		System.out.println("\nThe first list is");
		list1.printList(list3.head) ;
		System.out.println("\nThe second list is");
		list2.printList(list4.head) ;
		LinkedList sumList = new LinkedList() ;
		sumList.head =LinkedListUtils.sum( list3.head, list4.head) ;
		System.out.println("\nThe summed up list is");
		sumList.printList(sumList.head) ;

		// ALTERNATE SPLITTING.
		Node aHead = new Node() ;
		Node bHead = new Node() ;
		LinkedListUtils.alternatingSplit(resultList.head, aHead, bHead) ;
		
	}
}
