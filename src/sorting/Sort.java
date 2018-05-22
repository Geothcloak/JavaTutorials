package sorting;

public class Sort {
	
	public void print(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}
	
	public int[] selectionSort(int[] unsortedArray) {
		int [] sortedArray = new int[unsortedArray.length];
		int count = 0;
		while(count < unsortedArray.length) {
			int temp;
			int newSmallest = unsortedArray[count];
			for (int i = 0; i < unsortedArray.length; i++) {
				if (newSmallest > unsortedArray[i]) {
					temp = newSmallest;
					newSmallest = unsortedArray[i];
					unsortedArray[i] = temp;
				}
			}
			sortedArray[count] = newSmallest;
			count++;
		}
		
		
		 	
		
		
		return sortedArray;
	}
	
	
	
	
	
	
}
