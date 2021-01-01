package com.arrays;

import java.util.Arrays;


/**
 * To check one string is a permutation of another given String.
 *
 * @author KarthickMoorthy
 */
public final class StringPermutation
{
	/**
	 * Driver Program for checking given String is a permutation of another String.
	 *
	 * @param args Main Method Args.
	 */
	public static void main(final String... args)
	{
		final int size = 126;
		final String word = "Sai";
		final String permutation = "aiS";
		final char[] checkArray = permutation.toCharArray();
		final char[] charArray = word.toCharArray();
		final int[] countArray = new int[size];
		final StringPermutation stringPermutation = new StringPermutation();

		Arrays.fill(countArray, 0);

		stringPermutation.findPermutation(charArray, checkArray, countArray);
	}


	/**
	 * Checks the given String is permutation of the original String
	 *
	 * @param charArray The Orignal String's Character Array. Must not be {@code non-null}.
	 * @param checkArray The Given String's Character Array. Must not be {@code non-null}.
	 * @param countArray The Count Array for the characters in Original String. Must not be {@code non-null}.
	 */
	private void findPermutation(final char[] charArray, final char[] checkArray, final int... countArray)
	{
		if (charArray.length != checkArray.length)
		{
			System.out.println("The Two Strings are not permutation of each other");
		}
		else
		{
			for (final char c : charArray)
			{
				countArray[(int) c]++;
			}

			final int[] compareArray = new int[126];
			for (final char k : checkArray)
			{
				compareArray[(int) k]++;
			}

			if (Arrays.equals(countArray, compareArray))
			{
				System.out.println("The Two Strings are in permutation");
			}
			else{
				System.out.println("The Two Strings are not permutation of each other");
			}
		}
	}

}
