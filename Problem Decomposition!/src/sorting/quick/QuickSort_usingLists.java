package sorting.quick;

import java.util.ArrayList;
import java.util.List;

public class QuickSort_usingLists {


	// RECURSIVE
	public static List<Integer> SORT( List<Integer> list){

		// BASE CASES :

		if( list == null ){
			return list ;
		}

		if( list.isEmpty()){
			return list ;
		}

		if( list.size() == 1 ){
			return list ;
		}

		// INDUCTIVE CASE :

		int pivot = PIVOT( list ) ;


		// Step 1 : 
		// SPLIT list into 2 non-empty lists list1 & list2.
		// such that all the elements in list that are <= pivot are put
		// into list1 and the others onto list2.

		List<Integer> list1 = new ArrayList<Integer>() ;
		List<Integer> list2 = new ArrayList<Integer>() ;

		for (int index = 0; index < list.size(); index++) {
			int element = list.get(index) ; 

			if( element < pivot){
				// Add it to list1
				list1.add( element ) ;
			}else{
				// Add it to list2
				list2.add( element ) ;
			}
		}

		//  Step2 : Sort the 2 lists list1 & list2.

		List<Integer> sortedList1 = SORT( list1 ) ;
		List<Integer> sortedList2 = SORT( list2 ) ;
		List<Integer> sortedList = CONCAT( sortedList1, sortedList2 ) ;

		return sortedList ;
	}

	private static List<Integer> CONCAT(List<Integer> list1, List<Integer> list2) {

		List<Integer> sortedList = new ArrayList<Integer>(list1.size() + list2.size()) ;

		int counter1 = 0 ; // Counter for list1
		int counter2 = 0 ; // Counter for list2
		int counter3 = 0 ; // Counter for list3

		while ( counter1 < list1.size()) {
			sortedList.set(counter3, list1.get(counter1)) ;
			counter1++ ;
			counter3++ ;
		}

		while ( counter2 < list2.size()) {
			sortedList.set(counter3, list2.get(counter2)) ;
			counter2++ ;
			counter3++ ;
		}
		return sortedList;
	}

	private static int PIVOT(List<Integer> list) {

		if(list.size() == 1)
			return list.get( 0 ) ;
		else
			return list.get(list.size() /2 ) ;
	}
}
