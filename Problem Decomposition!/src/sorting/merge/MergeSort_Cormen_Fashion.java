package sorting.merge;

public class MergeSort_Cormen_Fashion {

	/**
	 * This function takes an array A and sorts the part of the array from start to end. i.e. A[ start ... end-1 ]
	 * @param A
	 * @param start
	 * @param end
	 */
	public void MERGESORT(int[] A, int start, int end) {

		System.out.printf("\nEntered with i = %d and j = %d", start , end );
		// BASE CASEs
		if( start == end ) // only 1 element.
			return ;

		else if( start > end )	// An invalid condition.
			return ;

		// INDUCTIVE
		else{
			// Step 1: Spilt the array A into 2 non-empty
			// sub-arrays from 0 to mid and from ( mid +1 ) to n-1
			int mid = ( end + start ) /2 ;
			MERGESORT(A, start,  mid ) ;	// Sorts the A[ 0 ... mid ]
			MERGESORT(A, mid +1, end ) ;	// Sorts the A[ mid+1 ... n-1 ]
			MERGE(A, start, end) ;		// We pass the mid so that the merge routine knows the 2 parts of A to be merged.

		}

	}

	/**
	 * Merges A[ start ... mid] & A[ mid+1 ... end]
	 * @param A
	 * @param start
	 * @param mid
	 * @param end
	 */
	private void MERGE(int[] A, int start ,int end) {

		 int mid = ( start + end ) /2 ;
		int counter1 = start, counter2 = mid+1 ; // counters on the sub-arrays.
		int[] sortedArray = new int[ A.length] ;
		int counter3 = 0 ; // counter on the final sorted array.
		
		while (counter1 <= mid && counter2 <= end) {
			if( A[ counter1] <= A[ counter2]) // in-place
			{
				sortedArray[ counter3 + start ] = A[ counter1 ] ;
				counter1++ ;
			}else{
				sortedArray[ counter3 + start ] = A[ counter2 ] ;
				counter2++ ;
			}
			counter3++ ;
		}

		// When end of any one of the above arrays is reached, simply copy the remaining elements into the sorted array.

		while (counter1 <= mid ) {
			sortedArray[ counter3] = A[ counter1] ;
			counter3++ ;
			counter1++ ;
		}

		while (counter2 <= end ) {
			sortedArray[ counter3] = A[ counter2] ;
			counter2++	;
			counter3++ 	;
		}

		/** COPY back to A **/

//		for (int i = 0; i < sortedArray.length; i++) {
//			A[ i ] = sortedArray[i] ;
//		}
//
//		for (int i = 0; i < A.length; i++) {
//			System.out.printf("%4d", A[i]);
//		}
	}

}