package com.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;


/**
 * treeMap Description.
 *
 * @author KarthickMoorthy
 */
public final class treeMap
{

		static void checkResult (String input) {
			String [] arr = input.split ("_");
			System.out.println(input.split ("_")[0]);
			System.out.println ("Input   : '" + input + "'");
			System.out.println ("    Size: " + arr.length);
			for (int i = 0; i < arr.length; i++)
				System.out.println ("    Val : '" + arr[i] + "'");
			System.out.println();
		}

	public static void main(final String... args)
	{
		Map<Integer, String >  treeMap = new TreeMap<>();

		treeMap.put(4,"Karthick");
		treeMap.put(2,"Promo");
		treeMap.put(5,"Vidhya");
		treeMap.put(1,"Moorthy");

		final String string1= "Choice of Entity Tax Analyzer Tool";
		final String string2= "Choice of Entity Tax Analyzer Tool";

		// Comparing for String 1 != String 2
		System.out.println("Comparing " + string1 + " and " + string2
						   + " : " + string1.trim().equals(string2.trim()));

		System.out.println(Arrays.asList(treeMap));

		checkResult ("DocId_ToolId");
		checkResult ("five*four");

	}
}
