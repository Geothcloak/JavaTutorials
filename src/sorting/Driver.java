package sorting;

public class Driver {
	public static void main(String[] args) {
		int[] unsortedArray = {5,8,4,9,2,13,20,66,754,32,1,5,-3,24};
		Sort sort = new Sort();
		
		//int[] sortedArray = sort.selectionSort(unsortedArray);
		//sort.print(sortedArray);
		
		//print selectionSort
		//sort.print(sort.selectionSort(unsortedArray));
		
		//print bubbleSort
		//sort.print(sort.bubbleSort(unsortedArray));
		
		//
		sort.mergeSort(unsortedArray);
	}
}
