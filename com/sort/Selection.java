package com.sort;

import java.util.Arrays;


/**
 * Selection Sort.
 *
 * @author KarthickMoorthy
 */
public final class Selection
{
	public static void main(final String... args)
	{
		final int[] nums = {11, 34, 10 ,2, 10,-5, 5 , 4 , 45};
		System.out.println("Before Sort :" + Arrays.toString(nums));
		selectionSort(nums);
		System.out.println("After Sort :" + Arrays.toString(nums));
	}


	private static void selectionSort(final int[] nums)
	{
		for(int i= 0; i<nums.length-1; i++){
			int index = i;
			for(int j=i+1; j<nums.length-1; j++){
				if(nums[j]<nums[index]){
					index = j;
				}
				if(index != i){
					final int temp = nums[index];
					nums[index] = nums[i];
					nums[i] = temp;
				}
			}
		}
	}
}
