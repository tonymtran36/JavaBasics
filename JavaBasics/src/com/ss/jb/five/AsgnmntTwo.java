package com.ss.jb.five;

import java.util.ArrayList;

public class AsgnmntTwo {

	public StringBuilder toStringComma(ArrayList<Integer> list) {
		StringBuilder strComma = new StringBuilder();
		list.forEach((n) -> {
			char evenOdd = n%2 == 0 ? 'e':'o';
			strComma.append(evenOdd + "" + n);
			//System.out.print( evenOdd + "" + n);
			if (n != list.get(list.size()-1)) strComma.append(",");
		});
		return strComma;
	}
	
	public static void main(String[] args) {
		AsgnmntTwo obj  = new AsgnmntTwo();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(44);
		System.out.println(obj.toStringComma(list).toString());
		
	}
}
