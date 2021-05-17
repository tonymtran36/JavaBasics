package com.ss.jb.weekone;

public class Recursion {
	public boolean groupSumClump(int start, int[] arr, int target) {
		if (start >= arr.length) return target == 0;
		
		int i = start;
		int sum = 0;
		
		while (i<arr.length && arr[start] == arr[i]) {
			sum += arr[i];
			i++;
		}
		
		if (groupSumClump(i, arr, target - sum)) { // if clump
			return true;
		}
		if (groupSumClump(i, arr, target)) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Recursion recurse = new Recursion();
		
		int[] arr1 = {2, 4, 8};
		int[] arr2 = {1, 2, 4, 8, 1};
		int[] arr3 = {2, 4, 4, 8};
		
		System.out.println(recurse.groupSumClump(0, arr1, 10));
		System.out.println(recurse.groupSumClump(0, arr2, 14));
		System.out.println(recurse.groupSumClump(0, arr3, 14));
	}
}
