package sorting;

public class driver {
	public static void main(String[] args) {
		int[] unsortedArray = {5,8,4,9,2,13,20,66,754,32,1,5,-3,24};
		Sort sort = new Sort();
		
		//int[] sortedArray = sort.selectionSort(unsortedArray);
		//sort.print(sortedArray);
		sort.print(sort.selectionSort(unsortedArray));
	}
}
