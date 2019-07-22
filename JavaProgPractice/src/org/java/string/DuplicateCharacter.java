package org.java.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
	public static void main(String[] args) {
		findDuplicate("sadhana");
	}
	
	public static void findDuplicate(String str)
	{
		char[] strChar = str.toCharArray();
		Map<Character, Integer> mapVal = new HashMap<Character, Integer>();
		for(char ch:strChar)
		{
			if(mapVal.containsKey(ch))
			{
				mapVal.put(ch, mapVal.get(ch)+1);
			}
			else{
				mapVal.put(ch, 1);
			}
		}
		//iterator through hashmap
		System.out.println("word is :"+ str);
		for(Map.Entry<Character, Integer> itr : mapVal.entrySet())
		{
			
			System.out.print(itr.getKey()+ ":" + itr.getValue()+"  " );
		}
	}

}
