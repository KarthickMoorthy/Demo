package com.sort;

import java.util.Arrays;


/**
 * Bubble Sort Implementation
 *
 * @author KarthickMoorthy
 */
public final class Bubble
{
	public static void main(final String... args)
	{
		final int[] nums = {11, 34, 10 ,2, 10,-5, 5 , 4 , 45};
		System.out.println("Before Sort :" + Arrays.toString(nums));
		bubbleSort(nums);
		System.out.println("After Sort :" + Arrays.toString(nums));
	}


	private static void bubbleSort(final int[] nums)
	{
		for(int i= 0; i<nums.length-1; i++){
			for(int j=i+1; j<nums.length; j++){
				if(nums[i]<nums[j]){
					final int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
}
