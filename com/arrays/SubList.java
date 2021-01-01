package com.arrays;

import java.util.*;


/**
 * Understand Sublist operation.
 *
 * @author KarthickMoorthy
 */
public final class SubList
{
	public static void main(String []args){
/*		System.out.println("Hello World");
		String searchterm = "'tax'";
		System.out.println(searchterm);
		searchterm = searchterm.replace("\'", "");
		System.out.println(searchterm);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		searchterm =sc.nextLine();
		System.out.println("The string you entered is:"+searchterm);
		searchterm.replace("\"", "").replace("\'", "");

		System.out.println(searchterm);
		List<String> al = new LinkedList<>();

		//Addition of elements in ArrayList
		al.add("Steve");
		al.add("Justin");
		al.add("Ajeet");
		al.add("John");
		al.add("Arnold");
		al.add("Chaitanya");

		al = al.subList(2,4);

		System.out.println(al);*/

		int[] test = {1,1,1,0,1,1,1,1};
		System.out.println(cellCompete(test, 1));;
	}

	public static List<Integer> cellCompete(int[] states, int days)
	{
		// WRITE YOUR CODE HERE
		List<Integer> sol = new ArrayList<>();
		Integer[] solTest = new Integer[states.length];
		int length = states.length;
		while(days>0){
			for(int i=0; i<length;i++){
				if(i==0){
					solTest[i] = states[i+1];
				}
				else if(i==length-1){
					solTest[i] = states[i-1];		}
				else {
					if(states[i+1] == 1 || states[i-1] == 1){
						solTest[i] = 1;
					} else {
						solTest[i] = 0;
					}
				}

			}
			days--;
		}

		return Arrays.asList(solTest.clone()); }
}
