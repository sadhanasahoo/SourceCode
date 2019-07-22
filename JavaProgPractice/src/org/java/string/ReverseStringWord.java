package org.java.string;

public class ReverseStringWord {
	public static void main(String[] args) {
		String str ="what a lovely day";
		revStringWord(str);
		
	}
	public static void revStringWord(String str)
	{
		String wordStr[] = str.split(" ");
		for(int i =0; i< wordStr.length ; i++)
		{
			//System.out.println(wordStr[i]);
			for(int j= (wordStr[i].length()-1); j>=0 ; j-- )
			{
				System.out.print(wordStr[i].charAt(j));
			}
			System.out.print(" ");
		}
		
	}

}
