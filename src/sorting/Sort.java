package sorting;

public class Sort {
	
	public void print(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}
	
	public int[] selectionSort(int[] unsortedArray) {
		
		//unsortedArray
		//hold one element put 9999 in its place remember where i pulled from
		//compare element to all others on list. when i find a smaller one take it
		//out put 9999 in its place. if place holder is not null put old held variable back.
		//once at end of array place element into sorted list.
		
		int [] sortedArray = new int[unsortedArray.length];
		int currentSmallest = -1000;
		int bookmark = -1;
		for(int i = 0; i < unsortedArray.length; i++) {
			for(int ii = 0; ii < unsortedArray.length; ii++) {
				if (currentSmallest < unsortedArray[ii] && bookmark == -1) {
					currentSmallest = unsortedArray[ii];
					unsortedArray[ii] = 9999;
					bookmark = ii;
				}else if (currentSmallest > unsortedArray[ii]) {
					unsortedArray[bookmark] = currentSmallest;
					currentSmallest = unsortedArray[ii];
					unsortedArray[ii] = 9999;
					bookmark = ii;
				}
			}
			sortedArray[i] = currentSmallest;
			bookmark = -1;
		}
		
		return sortedArray;
	}
	
	public int[] bubbleSort(int[] unsortedArray) {
		//bool flipped
		//while true
			//for each element -1
			//check side by side
				//flip if right is smaller
				//bool flipped = true
			//if bool flipped = false break
		
		boolean flipped = false;
		int temp = 0;
		while (true) {
			flipped = false;
			for(int i = 0; i < unsortedArray.length -1; i++) {
				if (unsortedArray[i] > unsortedArray[i+1]) {
					temp = unsortedArray[i];
					unsortedArray[i] = unsortedArray[i+1];
					unsortedArray[i+1] = temp;
					flipped = true;
				}

			}
			if (flipped == false) {
				break;
			}
		}
		return unsortedArray;
	}

	public void mergeSort(int[] unsortedArray){
		//second array to hold arrays = unsorted length
		//break down int array into single elements
			//second array of arrays = each element
		// 12  34
		//  1234
		//
		//loop through array of arrays and compare elements. 
		//
		
		
		int[][] arrays = new int[unsortedArray.length][];
		
		for (int i = 0; i < unsortedArray.length; i++) {
			arrays[i][0] = unsortedArray[i];
		}
		System.out.println("hi");
	}
	
	
	
	
}





















