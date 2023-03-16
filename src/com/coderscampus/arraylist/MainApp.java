package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		List<String> testList = new ArrayList<>();
		testList.add("testing...");
		System.out.println(testList);
		
		System.out.println("------");
		
		CustomList<Integer> customNumList = new CustomArrayList<>();
		for (int i = 1;  i <= 111; i++) {
			customNumList.add(i);
		}

		for (int i = 0; i < customNumList.getSize(); i++) {
		    System.out.println(customNumList.get(i));
		}

	}

}
