package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.Math.pow;


/**
 * checking a^3 + b^3 = c^3 + d^3 pairs
 *
 * @author KarthickMoorthy
 */

class Pair {
	private int a;
	private int b;

	Pair(int x, int y) {
		setA(x);
		setB(y);
	}


	public int getA()
	{
		return a;
	}


	public void setA(int a)
	{
		this.a = a;
	}


	public int getB()
	{
		return b;
	}


	public void setB(int b)
	{
		this.b = b;
	}
}

/**
 * Generate pairs for a^3 + b^3 = c^3 + d^3
 */
public final class FindCubedPair
{

	/**
	 * Default constructor
	 */
	private FindCubedPair()
	{
	}


	/**
	 * Driver Method
	 * @param args
	 */
	public static void main(final String... args)
	{
		final HashMap<Long, ArrayList<Pair>> hashMap = new HashMap<>();
		final int n = 5;

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				final long sum = (long) (pow(i, 3) + pow(j, 3));

				if(hashMap.containsKey(sum)) {
					final List<Pair> list = hashMap.get(sum);
					for(final Pair p : list) {
						System.out.println(i + " " + j + " " + p.getA() + " " + p.getB());
					}
				} else {
					final ArrayList<Pair> list = new ArrayList<>();
					hashMap.put(sum, list);
				}

				hashMap.get(sum).add(new Pair(i, j));
			}
		}
	}
}
