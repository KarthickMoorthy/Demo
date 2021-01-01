package com.arrays;

import java.util.Arrays;
import java.util.Objects;


/**
 * Program to determine if a string has unique characters.
 *
 * @author KarthickMoorthy
 */
public final class UniqueCharacters
{
	/**
	 * Driver Program for checking unique characters in a String.
	 *
	 * @param args Main Method Args.
	 */
	public static void main(final String... args)
	{
		final int size = 128;
		final String str = "kasr";
		final char[] charArray = str.toCharArray();
		final boolean[] flag = new boolean[size];
		final UniqueCharacters uniqueCharacters = new UniqueCharacters();

		uniqueCharacters.findUnique(flag, charArray);
	}


	/**
	 * Checks for unique characters in a String.
	 *  @param flag The Boolean Array. Must not be {@code non-null}.
	 * @param charArray The Character Array. Must not be {@code non-null}.
	 */
	private void findUnique(final boolean[] flag, final char... charArray)
	{
		for (final char c : charArray)
		{

			final int j = c;

			if (flag[j])
			{
				System.out.println("The String does not have all unique characters");
				break;
			}
			else
			{
				flag[j] = Boolean.TRUE;
			}
		}

	}
}
