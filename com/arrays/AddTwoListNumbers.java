package com.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/**
 * AddTwoListNumbers Description.
 *
 * @author KarthickMoorthy
 */
public final class AddTwoListNumbers
{

	public static void main(final String... args)
	{
		final LinkedList list1 = new LinkedList<Integer>();
		final LinkedList list2 = new LinkedList<Integer>();

		list1.add(3);
		list1.add(4);
		list1.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(5);

		final LinkedList<Integer> sums = twoSum(list1, list2);
		System.out.println(sums);
	}


	private static LinkedList<Integer> twoSum(final LinkedList list1, final LinkedList list2)
	{
		final LinkedList<Integer> list3 = new LinkedList<>();
		final Stack<String> test = new Stack<>();
		test.push("l");
		test.push("o");
		test.push("o");
		test.push("p");
		System.out.println(test);
		String word = new String();
		System.out.println(word);
		word= word + test.pop();
		System.out.println(test);
		word= word + test.pop();
		System.out.println(test);
		word= word + test.pop();
		System.out.println(test);
		word= word + test.pop();
		System.out.println(test);
		System.out.println(word);

		final Queue<String> que = new LinkedList<>();

		que.offer("Katy");
		que.add("Karthick");
		que.add("Promodini");
		que.add(null);

		System.out.println(que);
		System.out.println(que.offer(null));
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		System.out.println(que.remove());
		System.out.println(que);

		int carry = 0;
		int sum = 0;
		for(int i = list1.size()-1 ;i >=0; i--){
			int firstNumber = Integer.parseInt(list1.get(i).toString());
			int secondNumber = Integer.parseInt(list2.get(i).toString());
			sum = firstNumber + secondNumber + carry ;
			int value = sum%10;
			list3.add(value);
			carry = sum/10;
		}

		return list3;
	}

}
