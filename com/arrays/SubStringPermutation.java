package com.arrays;

/**
 * To check one string is a permutation of another big String.
 *
 * @author KarthickMoorthy
 */
public final class SubStringPermutation
{
	/**
	 * Checks the Permutation exist
	 * @param asciiA ASCII array of the original string
	 * @param subB subString to be checked for the permutation.
	 *
	 * @return boolean flag stating the result of comparision
	 */
	private static boolean isPermuted(final int[] asciiA, final String subB){
		final int [] asciiB = new int[26];

		for(int i=0; i < subB.length();i++){
			asciiB[(int) subB.charAt(i) - (int) 'a']++;
		}
		for(int i=0; i < 26;i++){
			if (asciiA[i] == asciiB[i])
			{
				continue;
			}
			return false;
		}
		return true;
	}

	/**
	 * Driver Program for checking given String is a permutation of another String.
	 *
	 * @param args Main Method Args.
	 */
	public static void main(String... args){
		final String a = "abbc";
		final String big = "cbabadcbbabbc";
		final int len = a.length();
		final int [] asciiA = new int[26];
		for(int i=0;i<a.length();i++){
			asciiA[(int) a.charAt(i) - (int) 'a']++;
		}
		
		for(int i=0;i<big.length()-len+1;i++){
			final String sub = big.substring(i, i + len);
			System.out.printf("%s,%s\n",sub,isPermuted(asciiA,sub));
		}
	}
}
