package com.sort;

import java.util.Arrays;


/**
 * QuickSort Implementation.
 *
 * @author KarthickMoorthy
 */
public final class QuickSort
{
	public static void main(final String... args)
	{
		final int[] nums = {11, 34, 10 ,2, 10,-5, 5 , 4 , 45};
		System.out.println("Before Sort :" + Arrays.toString(nums));
		quickSort(nums, 0, nums.length-1);
		System.out.println("After Sort :" + Arrays.toString(nums));
	}

	private static void quickSort(final int[] nums, final int low, final int high)
	{
		final int mid = low + (high - low) / 2;
		final int pivot = nums[mid];

		int i = low ;
		int j = high;

		while(i<=j){
			while(nums[i]<pivot){
				i++;
			}
			while(nums[j]>pivot){
				j--;
			}

			if(i<=j){
				final int temp = nums[i];
				nums[i]= nums[j];
				nums[j]= temp;
				i++;
				j--;

				if(low<j){
					quickSort(nums, low, j);
				}

				if(high>i){
					quickSort(nums, i, high);
				}

			}
		}

	}
}
