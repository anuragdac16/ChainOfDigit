package com.app.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CodeChallange {

	public Set<Integer> numberOfChain(int number) {
		Set<Integer> set = new LinkedHashSet<>();
		int chain = set.size() - 1;
		int descendingNumber = sortNumberInDesendingOrder(number);
		int ascendingNumber = sortNumberInAsendingOrder(number);

		while (!(set.size() == chain)) {
			int result = descendingNumber - ascendingNumber;
			descendingNumber = sortNumberInDesendingOrder(result);
			ascendingNumber = sortNumberInAsendingOrder(result);
			chain++;
			set.add(result);
		}

		return set;
	}

	public int sortNumberInDesendingOrder(int number) {

		char[] ch = Integer.toString(number).toCharArray();
		Arrays.sort(ch);
		return Integer.parseInt(new StringBuffer(String.copyValueOf(ch)).reverse().toString());
	}

	public int sortNumberInAsendingOrder(int number) {
		char[] ch = Integer.toString(number).toCharArray();
		Arrays.sort(ch);
		return Integer.parseInt(String.copyValueOf(ch));

	}

	

}
