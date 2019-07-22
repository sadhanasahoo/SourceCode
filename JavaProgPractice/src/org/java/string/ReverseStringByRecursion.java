package org.java.string;

public class ReverseStringByRecursion {
	public static void main(String[] args) {
		String str = "sadhana";
		System.out.println(reverseString(str));
	}
	public static String reverseString(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		else
		{
			return reverseString(str.substring(1))+ str.charAt(0);
		}
		
		
	}
	
	

}
