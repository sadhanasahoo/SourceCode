package org.java.arrary;

public class SortStringArrayLength {
	public static void main(String[] args) {
		String arryStr[]= {"sargum", "raja", "poo", "lijun"};
		String temp = arryStr[0] ;
		for(int i=0; i<arryStr.length; i++)
		{
			
			for(int j=(i+1); j< arryStr.length; j++)
			{
				if(arryStr[i].length() > arryStr[j].length())
				{
					temp = arryStr[i];
					arryStr[i]= arryStr[j];
					arryStr[j]= temp;
				}
			}
		}
		for(int i=0;i<arryStr.length; i++ )
		{
			System.out.println(arryStr[i]);
		}
	}

}
