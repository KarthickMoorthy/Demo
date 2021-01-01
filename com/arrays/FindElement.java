package com.arrays;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Program to find elements in an array.
 *
 * @author KarthickMoorthy
 */
public final class FindElement
{
	/**
	 * Driver Program for finding array elements.
	 *
	 * @param args Main Method Args.
	 */
	public static void main(final String... args)
	{
		final int[] arr = {1, 9, 3, 5, 7};
		final int key;
		final FindElement findElement = new FindElement();
		final Scanner in = new Scanner(System.in);

		//Sort the Array
		Arrays.sort(arr);

		System.out.println("The Original Array : " + Arrays.toString(arr));
		System.out.println("Enter the Element to find  : ");

		key = +in.nextInt();

		final Boolean flag = findElement.findKey(arr, key);

		if (!flag)
		{
			System.out.println("Element not found in the array");
		}

		int result = findElement.binarySearchFinder(arr, key, 0, arr.length - 1);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "+result);
	}


	/**
	 * Find the key in the given array using binary search.
	 *
	 * @param arr The sorted array to be searched. Must not be {@code non-null}.
	 * @param key The searched element. Must not be {@code non-null}.
	 * @param left Left most index of the sorted array. Must not be {@code non-null}.
	 * @param right Right most index of the sorted array. Must not be {@code non-null}.
	 *
	 * @return The Index of the searched key. Must not be {@code non-null}.
	 */
	private int binarySearchFinder(final int[] arr, final int key, final int left, final int right)
	{
		int mid = left + (right - left) / 2;

		if (arr[mid] == key)
		{
			System.out.println("Found the element in the Index : " + mid);
			return mid;
		}

		if (arr[mid] > key)
		{
			return binarySearchFinder(arr, key, 0, mid - 1);
		}
		else if (arr[mid] < key)
		{
			return binarySearchFinder(arr, key, mid + 1, right);
		}
		return -1;
	}


	/**
	 * Find the key in the given array.
	 *
	 * @param arr The array to be searched. Must not be {@code non-null}.
	 * @param key The searched element. Must not be {@code non-null}.
	 *
	 * @return The Boolean flag for search result. Must not be {@code non-null}.
	 */
	private boolean findKey(final int[] arr, final int key)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == key)
			{
				System.out.println("Found the element in the Index : " + i);

				return true;

			}
		}
		return false;
	}
}
