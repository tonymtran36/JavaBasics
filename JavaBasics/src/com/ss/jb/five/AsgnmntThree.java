package com.ss.jb.five;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class AsgnmntThree {
	public ArrayList<String> aToString(ArrayList<String> list) {
		return (ArrayList<String>) list.stream().filter(p -> p.charAt(0) == 'a' && p.length() == 3).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		AsgnmntThree obj  = new AsgnmntThree();
		ArrayList<String> list = new ArrayList<String>();
		list.add("alphabet");
		list.add("allow");
		list.add("store");
		list.add("a00");
		list.add("avacado");
		list.add("apple");
		list.add("app");
		list.add("wallet");
		list.add("roll");
		list.add("bun");
		list.add("Apple");
		list.add("egg");
		list.add("poptart");
		list.add("acc");
		list.add("picnic");
		list.add("abb");

		ArrayList<String> listFiltered = obj.aToString(list);
		listFiltered.forEach(i -> System.out.println(i));
	}
}
