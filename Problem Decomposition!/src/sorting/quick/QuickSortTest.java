package sorting.quick;

public class QuickSortTest {

	public static void main(String[] args) {

		Integer[] data = { 8, 9, 1, 4, 3, 5, 7, 6 } ;
		
		QuickSort sorter = new QuickSort() ;
		sorter.QUICKSORT(data, 0, data.length -1) ;
		
		for (Integer element : data) {
			System.out.printf("%4d", element );
		}
		
	}

}
