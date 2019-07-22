package org.java.string;

import java.util.Arrays;

public class SortingAString {
	public static void main(String[] args) {
		String str = "5432164";
		SortingAString obj = new SortingAString();
		System.out.println(obj.sortingString(str));
	}
	
	public String sortingString(String input)
	{
		char[] stringArry = input.toCharArray();
		Arrays.sort(stringArry);
		return new String(stringArry);
	}

}
