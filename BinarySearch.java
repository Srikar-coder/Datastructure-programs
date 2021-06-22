package com.bridgeLabz.dataStructurePrograms;
import java.util.*;
import java.io.*;
public class BinarySearch 
{
	public static void main(String args[])
	{
		SortingFunction sf=new SortingFunction();  
		Utility u=new Utility();

		System.out.println("Enter size: ");
		int arraySize=u.inputInteger();
		int a[]=sf.input1DArray(arraySize);
		Arrays.sort(a);								//sorting the array
		System.out.println();
		System.out.println("The Sorted Order is: ");
		sf.print1DArray(a);							//printing the sorted array
		System.out.println();
		System.out.println("Enter Key: ");
		int position=sf.binarySearch(a,u.inputInteger());

		if(position==-1)
		{
			System.out.println();
			System.out.println("Not Found");
		}
		else
		{
			System.out.println();
			System.out.println("Found at "+position+" position");
		}
	}
}
