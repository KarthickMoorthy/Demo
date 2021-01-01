package com.arrays;

/**
 * Program to determine if a number is a palindrome.
 *
 * @author KarthickMoorthy
 */
public final class NumPalindrome
{
	private static boolean isPalindrome(final int integer) {
	int palindrome = integer;
	int reverse = 0;

	// Compute the reverse
	while (palindrome != 0) {
		final int remainder = palindrome % 10;
		reverse = reverse * 10 + remainder;
		palindrome = palindrome / 10;
	}

	// The integer is palindrome if integer and reverse are equal
	return integer == reverse; //

}

	/**
	 * Driver Program for finding array elements.
	 *
	 * @param args Main Method Args.
	 */
	public static void main(final String... args)
	{
		final boolean flag  = isPalindrome(2552);

		if(flag){
			System.out.println("The number is Palindrome");
		} else{
			System.out.println("The number is not Palindrome");
		}
	}
}
