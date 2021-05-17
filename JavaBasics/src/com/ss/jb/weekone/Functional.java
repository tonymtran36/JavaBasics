package com.ss.jb.weekone;

import java.util.Arrays;

public class Functional {

	public Integer[] rightDigit(Integer[] arr) {
		return Arrays.stream(arr).map((num) -> num%10).toArray(Integer[]::new);
	}
	
	public Integer[] doubling(Integer[] arr) {
		return Arrays.stream(arr).map((num) ->num*2).toArray(Integer[]::new);
	}
	
	public String[] noX(String[] arr) {
		return Arrays.stream(arr).map((str) -> str.replace("x", "")).toArray(String[]::new);
	}
	
	public String toString(Integer[] arr) {
		if(arr.length == 0) return "[]";
		StringBuilder array = new StringBuilder("[");
		for (int i : arr) {
			array.append(i + ", ");
		}
		array.delete(array.length()-2, array.length());
		array.append("]");
		
		return array.toString();
	}
	
	public String toString(String[] arr) {
		if(arr.length == 0) return "[]";
		StringBuilder array = new StringBuilder("[");
		for (String i : arr) {
			array.append(i + ", ");
		}
		array.delete(array.length()-2, array.length());
		array.append("]");
		
		return array.toString();
	}
	
	public static void main(String[] args) {
		Functional functions = new Functional();
		Integer[] arr1 = {1, 22, 93};
		Integer[] arr2 = {16, 8, 886, 8, 1};
		Integer[] arr3 = {10, 0};

		Integer[] arr1Right = functions.rightDigit(arr1);
		Integer[] arr2Right = functions.rightDigit(arr2);
		Integer[] arr3Right = functions.rightDigit(arr3);
		
		System.out.println(functions.toString(arr1Right));
		System.out.println(functions.toString(arr2Right));
		System.out.println(functions.toString(arr3Right));
		
		Integer[] arr4 = {1, 2, 3};
		Integer[] arr5 = {6, 8, 6, 8, -1};
		Integer[] arr6 = {};
		
		Integer[] arr4Doubled = functions.doubling(arr4);
		Integer[] arr5Doubled = functions.doubling(arr5);
		Integer[] arr6Doubled = functions.doubling(arr6);
		
		System.out.println(functions.toString(arr4Doubled));
		System.out.println(functions.toString(arr5Doubled));
		System.out.println(functions.toString(arr6Doubled));
		
		String[] arr7 = {"ax", "bb", "cx"};
		String[] arr8 = {"xxax", "xbxb", "xxcx"};
		String[] arr9 = {"x"};
		
		String[] arr7X = functions.noX(arr7);
		String[] arr8X = functions.noX(arr8);
		String[] arr9X = functions.noX(arr9);
		
		System.out.println(functions.toString(arr7X));
		System.out.println(functions.toString(arr8X));
		System.out.println(functions.toString(arr9X));
		
		
	}
}
