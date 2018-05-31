package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

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
	//TODO
			//save 3 examples of merge sorting. write it out 10 times. since i can't figure it out.
			//remove gitingore.txt from repository
			//finish mergesort.
			//use an int list
	public void mergeSort() {
		List<Integer> unsorted = Arrays.asList(5,8,4,9,2,13,20,66,754,32,1,5,-3,24);
		split(unsorted);

	}
	public static List<Integer> split(List<Integer> unsorted) {
		int middle = unsorted.size() / 2;
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		List<Integer> sortedList = new ArrayList<Integer>();

		for (int i = 0; i < middle; i++) {
			left.add(unsorted.get(i));
		}
		if (left.size() > 1) {
			split(left);
		}else {
			System.out.println(left.size() + " " + left.get(0));
		}
		for (int i = middle; i < unsorted.size(); i++) {
			right.add(unsorted.get(i));
		}
		if (right.size() > 1) {
			split(right);
		}else {
			System.out.println(right.size() + " " + right.get(0));
		}
		//same size list ,,,, 1 and 1
		
		//lobsidded 2 and 1 ....  1 and 2
		int rightIndex = 0;
		int leftIndex = 0;
		for (int i = 0; i < left.size(); i++) {
			if (rightIndex == right.size() && leftIndex == left.size()) {
				break;
			}
			else if (rightIndex == right.size()) {
				//add all of left to array
				for (int ii = leftIndex; leftIndex != left.size(); ii++) {
					sortedList.add(left.get(i));
					leftIndex++;
				}
			}else if (leftIndex == right.size()) {
				//add all of right to array
				for (int iii = rightIndex; rightIndex != right.size(); iii++) {
					sortedList.add(right.get(i));
					rightIndex++;
				}
			}

			if (left.get(i) >= right.get(i)) {
				sortedList.add(right.get(i));
				rightIndex++;
			}else {
				sortedList.add(left.get(i));
				leftIndex++;
			}
		}
		return sortedList;
	}
	
	
}





















