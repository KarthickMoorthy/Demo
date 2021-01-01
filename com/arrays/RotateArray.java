package com.arrays;

import java.util.Arrays;


/**
 * Program to rotate array elements.
 * @author Karthick Moorthy
 */
public class RotateArray
{
	/**
	 * Driver Program for Array Rotation.
	 *
	 * @param args Main Method Args.
	 */
	public static void main(final String... args)
	{
		final int[] arr = {1, 3, 5, 7, 9};
		final RotateArray rotate = new RotateArray();

		System.out.println("The Original Array : " + Arrays.toString(arr));

		rotate.rotate(arr, 4);
		rotate.rotate(arr,1);
		rotate.rightShift(arr, 1);
	}

	/**
	 * Rotate the array to right position.
	 *
	 * @param arr The array to be rotated. Must not be {@code non-null}.
	 * @param k The number of shift to be made. Must not be {@code non-null}.
	 */
	private void rightShift(final int[] arr, final int k)
	{
		final int n = arr.length;
		final int[] Arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			int w = i + k ;

			while(w>=n){
				w = w % n ;
			}
				Arr[w] = arr[i];
		}
		System.out.println("The Right Shifted  Array by "+ k +" : "+ Arrays.toString(Arr));
	}


	/**
	 * Rotate the array to left position.
	 *
	 * @param arr The array to be rotated. Must not be {@code non-null}.
	 * @param k The number of shift to be made. Must not be {@code non-null}.
	 */
	private void rotate(final int[] arr, final int k)
	{
		final int n = arr.length;
		final int[] Arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			int w = i - k;
			if (w < 0)
			{
				w = w % n;
				if (w < 0)
				{
					w = w + n;
				}
			}
			Arr[w] = arr[i];
		}
		System.out.println("The Left Shifted  Array by "+ k +" : "+ Arrays.toString(Arr));
	}
}
