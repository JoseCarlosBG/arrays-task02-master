package com.epam.rd.autotasks.array;

public class IntArrayUtil {

	public static int maximumDistance(int[] array) {
		int count=0; //maximum distance between two instance of the max value
		if ((array!=null) && (array.length>0)){
			int max = 0; // max value within the array
			for (int i : array) {
				if (i > max){
					max = i;
				}
			}

			int start=-1, end=-1; //first and last indexes where the maximum value was found.
			// Initialized to -1 to account for the possibility that the max value was found on index 0
			for (int j=0; j<array.length;j++){
				if (array[j]==max){
					if (start==-1){ //Used to set up the first instance of the maximun value
						start=j;
					}
					else{
						end=j; //Used to set up the last instance of the maximum value
					}
				}
			}
			if (end>0){
				count=end-start;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		{
			int[] array = null;
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] {};
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 4, 100, 3, 4 };
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 5, 50, 50, 4, 5 };
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 5, 350, 350, 4, 350 };
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 10, 10, 10, 10, 10 };
			System.out.println("result = " + maximumDistance(array));
		}
	}

}
