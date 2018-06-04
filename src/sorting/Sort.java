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
	public void printList(List<Integer> list) {
		for (int i : list) {
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
	
	public void mergeSort() {
		List<Integer> unsorted = Arrays.asList(5,8,4,9,2,13,20,66,754,32,1,5,-3,24);
		List<Integer> sortedList = new ArrayList<Integer>();
		sortedList = split(unsorted);
		printList(sortedList);

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
			left = split(left);
		}else {
			//System.out.println(left.size() + " " + left.get(0));
		}
		for (int i = middle; i < unsorted.size(); i++) {
			right.add(unsorted.get(i));
		}
		if (right.size() > 1) {
			right = split(right);
		}else {
			//System.out.println(right.size() + " " + right.get(0));
		}
		//5 8         - 9     -3
		int rightIndex = 0; //1
		int leftIndex = 0; 

		while (rightIndex != right.size() || leftIndex != left.size()) {
			if (rightIndex == right.size()) {
				//add all of left to array
				for (int ii = leftIndex; leftIndex != left.size(); ii++) {
					sortedList.add(left.get(ii));
					leftIndex++;
				}
				break;
			}else if (leftIndex == left.size()) {
				//add all of right to array
				for (int iii = rightIndex; rightIndex != right.size(); iii++) {
					sortedList.add(right.get(iii));
					rightIndex++;
				}
				break;
			}

			if (left.get(leftIndex) >= right.get(rightIndex)) {
				sortedList.add(right.get(rightIndex));
				rightIndex++;
			}else {
				sortedList.add(left.get(leftIndex));
				leftIndex++;
			}
		}
		String list = " ";
		for (int i: sortedList) {
		list += i + " ";	
		}
		System.out.println(list);
		return sortedList;
	}
}

//TODO
//make sorting part another method and call it. 
//finish mergesort.
//redo selection sort
//do merge sort without recursion for better understanding.
