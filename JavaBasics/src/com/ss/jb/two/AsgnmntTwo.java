package com.ss.jb.two;

/**
 * find the index of the max number
 * @author Tony
 *
 */
public class AsgnmntTwo {
	
	/**\
	 * finds the max number in a 2d array and prints out the indices 
	 * 
	 * @param arr
	 * 2d array with max number
	 */
	public void displayMaxNumIndex(Integer[][] arr) {
		Integer max = arr[0][0];
		Integer rowIndex = 0;
		Integer colIndex = 0;
		for (int i = 0; i<arr.length;i++) {
			for (int j = 0; j<arr[i].length;j++) {
				if (arr[i][j]>max) { 
					max = arr[i][j];
					rowIndex = i;
					colIndex = j;
				}
			}
		}
		System.out.println("The max number is located at row: " + rowIndex + " and column: " + colIndex);
	}
	
	/**
	 * request to find a max number given a 2d array
	 * 
	 * @param args
	 * command line arguments
	 */
	public static void main(String[] args) {
		Integer[][] twoDArr = { {1, 3},  {1, 3},  {10, 3},  {1, 99},  {7, 4},  {5, 10},  {98, 54} };
		AsgnmntTwo maxNum = new AsgnmntTwo();
		maxNum.displayMaxNumIndex(twoDArr);

	}
}
