package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * TwoSum Description.
 *
 * @author KarthickMoorthy
 */
public final class TwoSum
{
	/**
	 * Driver Program for finding the index of the array whose value when summed equal to the target.
	 *
	 * @param args Main Method Args.
	 */
	public static void main(final String... args)
	{
		final int[] nums = {3,2,3,4,6};
		final int target = 9;
		final int[] sums = twoSum(nums, target);
		System.out.println(Arrays.toString(sums));
	}


	private static int[] twoSum(final int[] nums, final int target)
	{
		final Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
		{
			final int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i)
			{
				return new int[] {map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
