package com.arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * PatternExample Description.
 *
 * @author KarthickMoorthy
 */
public final class PatternExample
{
	public static void main(final String... args)
	{
		String unsafeInputString = "abc$";
		Pattern p = Pattern.compile(".*[<>%\\$].*");
		Matcher m = p.matcher(unsafeInputString);
		if (m.matches())
		{
			// Invalid input: reject it, or remove/change the offending characters.
			System.out.println("I am in ");
		}
		else
		{
			// Valid input.
			System.out.println("I am out ");
		}
	}
}
